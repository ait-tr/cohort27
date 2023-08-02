package example02;

import java.util.Comparator;

/**
 * 8/1/2023
 * Comparator_Comparable
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class HumanByExperienceComparator implements Comparator<Human> {
    @Override
    public int compare(Human a, Human b) {
        int result = a.getExperience() - b.getExperience();
        if (result == 0) {
            return a.getHeight() - b.getHeight();
        } else return result;
    }
}
