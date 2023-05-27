package example02;

public class Main02 {
    public static void main(String[] args) {
        Wife julietta = new Wife("Джульетта");
        Wife mini = new Wife("Мини");

        Husband romeo = new Husband("Ромео");
        Husband miki = new Husband("Мики");

        romeo.setWife(julietta);
        julietta.setHusband(miki);
        julietta.beHappy();
        miki.setWife(julietta);


        romeo.tellAbout();
        julietta.tellAbout();
        miki.tellAbout();

    }
}
