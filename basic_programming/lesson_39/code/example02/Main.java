package example02;

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

        CoverObject coverForIPhone = new CoverObject(nokia3310);
        CoverObject coverForNokia = new CoverObject(iPhone);

//        IPhone iPhoneFromCover = (IPhone) coverForIPhone.getPhone();
//        Nokia3310 nokiaFromCover = (Nokia3310) coverForNokia.getPhone();

        Object obj1 = coverForIPhone.getPhone();
        Object obj2 = coverForNokia.getPhone();

        IPhone iPhoneFromCover = (IPhone) obj1;
        Nokia3310 nokiaFromCover = (Nokia3310) obj2;

        iPhoneFromCover.takePhoto();
        nokiaFromCover.call();

    }
}
