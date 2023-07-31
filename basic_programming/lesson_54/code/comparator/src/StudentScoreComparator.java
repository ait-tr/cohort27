import java.util.Comparator;

public class StudentScoreComparator implements Comparator<Student> {

  @Override
  public int compare(Student o1, Student o2) {
//    return o1.getScore() - o2.getScore();
//    Integer i1 = o1.getScore();
//    Integer i2 = o2.getScore();
//    return i1.compareTo(i2);
    return Integer.compare(o1.getScore(), o2.getScore());
  }
}
