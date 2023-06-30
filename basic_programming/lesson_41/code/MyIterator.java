public interface MyIterator<V> { // бегунок
    boolean hasNext(); // проверяем есть ли еще элементы

    V next(); // возвращает вам новый элемент
}
