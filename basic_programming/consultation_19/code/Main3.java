import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 7/18/2023
 * SimpleProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main3 {
    public static void main(String[] args) {
        HashMap<String, List<Human>> map = new HashMap<>();

        Human marsel = new Human(29, "Marsel");
        Human vadim = new Human(17, "Vadim");
        Human kenan = new Human(27, "Kenan");
        Human vika = new Human(18, "Vika");
        Human dmitri = new Human(47, "Дмитрий");

        List<Human> command1 = new ArrayList<>();
        command1.add(marsel);
        command1.add(vadim);

        List<Human> command2 = new ArrayList<>();
        command2.add(kenan);
        command2.add(vika);
        command2.add(dmitri);

        for (Human human : command2) { // human - каждый новый человек из списка, command2 - список всех людей
            System.out.println(human);
        }

        map.put("Команда 1 - Супер топ", command1);
        map.put("Команда 2 - Тоже очень топ!", command2);

        // хотим распечатать все команды и их участников
        for (Map.Entry<String, List<Human>> pair : map.entrySet()) { // map.entrySet() - получить все пары, которые есть в map
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}
