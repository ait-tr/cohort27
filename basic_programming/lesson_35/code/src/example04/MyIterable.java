package example04;

/**
 * Описывает поведение класса, который может
 * вернуть курсор/бегунок для своего последовательного обхода
 */
public interface MyIterable {
    MyIterator iterator();
}
