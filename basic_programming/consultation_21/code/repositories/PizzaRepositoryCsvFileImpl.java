package repositories;

import models.Pizza;
import models.Size;
import models.Type;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * 7/27/2023
 * PizzaProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class PizzaRepositoryCsvFileImpl implements PizzaRepository {

    private static final String SEPARATOR = ","; // глобальная константа в единственном экземпляре

    private final Scanner scanner;

    public PizzaRepositoryCsvFileImpl(String fileName) {
        try {
            this.scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
            // выбрасываем непроверяемое исключение поверх проверяемого
            // таким образом мы останавливаем программу
            // потому что если программа к файлу подключиться не смогла - работать ей дальше нет смысла
        }
    }

    @Override
    public List<Pizza> findAll() {
        List<Pizza> pizzas = new ArrayList<>();

        // ключ - это пицца, а значение - список типов для этой пиццы
        // например
        // ключ - Маргарита, а значение - список типов: {Small,6.5}, {Medium,8}, {Large,10.5}
        // ключ - Capricciosa, а значение - список типов: {Small,7.5}, {Medium,10}, {Large,12.5}
        Map<Pizza, List<Type>> pizzaTypes = new HashMap<>();

        while (scanner.hasNextLine()) { // пока есть следующая строка в файле - пока файл не кончился
            String line = scanner.nextLine(); // считали строку

            String[] cells = line.split(SEPARATOR); // разбили строку на символы

            Pizza pizza = new Pizza(cells[0]); // создали пиццу
            Type type = new Type(Size.valueOf(cells[1]), Double.parseDouble(cells[2]));

            // проверим, а нет ли там уже такой пиццы?
            if (!pizzaTypes.containsKey(pizza)) { // если такой пиццы еще не было
                pizzaTypes.put(pizza, new ArrayList<>()); // положили пиццу в качестве ключа в мапу с пустым списком типов
            }

            // добавляем к ней новый тип
            pizzaTypes.get(pizza).add(type); // get - получил значение по ключу pizza,

            // если там уже была такая пицца - она не добавится заново
        }
        // пробегаю все пары ключ-значение
        for (Map.Entry<Pizza, List<Type>> entry : pizzaTypes.entrySet()) {
            entry.getKey().getTypes().addAll(entry.getValue());
            // entry.getKey() - получил какую-то пиццу
            // .getTypes() - получил список типов этой пиццы
            // .addAll() - добавить все из другого списка
            // entry.getValue() - получил значение
        }

        return new ArrayList<>(pizzaTypes.keySet()); // создаю список пицц на основе ключей мапы
    }
}
