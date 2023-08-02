package example02;

import java.util.Comparator;

/**
 * 8/1/2023
 * Comparator_Comparable
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class HumansByHeightComparator implements Comparator<Human> {
    @Override
    public int compare(Human a, Human b) {
        return a.getHeight() - b.getHeight();
    }
}
