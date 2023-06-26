package example03;


import java.util.Scanner;

/**
 * 6/26/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        Nokia3310 nokia3310 = new Nokia3310();
        Scanner scanner = new Scanner(System.in);

        Cover<IPhone> coverForIPhone = new Cover<>(iPhone);
        Cover<Nokia3310> coverForNokia = new Cover<>(nokia3310);
        Cover<Scanner> scannerCover = new Cover<>(scanner);

        IPhone iPhoneFromCover = coverForIPhone.getPhone();
        Nokia3310 nokiaFromCover = coverForNokia.getPhone();
//        IPhone iPhone1 = scannerCover.getPhone();
    }
}
