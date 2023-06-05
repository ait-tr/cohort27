package example02;

public class MyArrayList {
    private int[] elements;
    private int count;

    public MyArrayList() {
        this.elements = new int[10];
        this.count = 0;
    }

    public void add(int element) {
        this.elements[count] = element;
        this.count++;
    }

    // я хочу создать некоторый объект, который будет последовательно проходить элементы
    // внутри моего массива
    public class Iterator { // внутренний класс
        private int next; // поле итератора, которое содержит индекс следующего элемента

        public Iterator() {
            next = 0;
        }
        /**
         * Возвращает следующий элемент массива
         * @return элемент, который стоит после итератора
         */
        public int next() {
            int element = elements[next]; // кладем элемент массива
            next++; // двигаем next на одну позицию вправо
            return element; // возвращаем результат
        }

        /**
         * Проверяет, есть ли следующий элемент
         * @return <code>true</code>, если следующий элемент есть, <code>false</code> - в противном случае
         */
        public boolean hasNext() {
            return next < count;
        }

    }
}
