public class Main2 {
    public static void main(String[] args) {
        {
            int a = 10;
            {
                int b = 5;
                System.out.println(b);
                System.out.println(a);
            }
            System.out.println(a);
//            System.out.println(b);
            {
                int x = 7;
                System.out.println(a);
                {
                    System.out.println(x);
                    System.out.println(a);
                }
                System.out.println(x);
            }
//            System.out.println(x);
        }
//        System.out.println(a);
    }
}
