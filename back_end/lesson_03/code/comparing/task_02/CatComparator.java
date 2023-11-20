package comparing.task_02;

import comparing.task_01.Cat;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {

        if (o1.getColor() == null && o2.getColor() != null) {
            return -1;
        }

        if (o1.getColor() != null && o2.getColor() == null) {
            return 1;
        }

        int result = o1.getColor().compareTo(o2.getColor());
        if (result != 0) {
            return result;
        }

        result = o2.getAge() - o1.getAge();
        if (result != 0) {
            return result;
        }

        return Double.compare(o1.getWeight(), o2.getWeight());
    }
}