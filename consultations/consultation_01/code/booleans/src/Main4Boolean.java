package booleans;

public class Main4Boolean {
    public static void main(String[] args) {
        /*
               0,1

               логическое умножение, и, and, конъюнкция, &

               Сегодня утро и погода ясная - ложное, потому что в Берлине день и пасмурно
               0 и 0 = 0

               Сегодня утро и погода ясная - ложное, потому что в Турции уже вечер, хоть и погода ясная
               0 и 1 = 0

               Сегодня утро и погода ясная
               1 и 1 = 1 - истина, потому что в США сейчас утро и ясно

               логическое сложение, или, or, дизъюнкция, |

               Сегодня утро или погода ясная
               0 или 0 = 0 ложное, потому что в Берлине день и пасмурно

               Сегодня утро или погода ясная - ложное, потому что в Турции хоть уже вечер, но погода ясная
               0 или 1 = 1
               1 или 0 = 1, если хотя бы один из операндов 1, то и результат 1

               Сегодня утро или погода ясная
               1 и 1 = 1 - истина, потому что в США сейчас утро и ясно
         */

        /*
                Что означают два знака?

                A | B - идет проверка и A и B
                A || B - проверятся B не будет, если A уже true

                A & B - идет проверка и A и B
                A && B - проверятся B не будет, если A уже false
         */

        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);

        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);

        System.out.println();
    }
}
