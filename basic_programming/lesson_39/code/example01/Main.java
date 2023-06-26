package example01;

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

        CoverForIPhone coverForIPhone = new CoverForIPhone(iPhone);
        CoverForNokia coverForNokia = new CoverForNokia(nokia3310);

        IPhone iPhoneFromCover = coverForIPhone.getPhone();
        Nokia3310 nokiaFromCover = coverForNokia.getPhone();
    }
}
