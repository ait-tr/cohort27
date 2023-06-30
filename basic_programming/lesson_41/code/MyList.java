public interface MyList<K> extends MyIterable<K> {
    int getCount();

    void add(K element);

    K get(int index);
}
