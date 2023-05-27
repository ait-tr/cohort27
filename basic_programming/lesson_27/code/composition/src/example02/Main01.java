package example02;

public class Main01 {
    public static void main(String[] args) {
        Wife julietta = new Wife("Джульетта");
        Wife mini = new Wife("Мини");

        Husband romeo = new Husband("Ромео");
        Husband miki = new Husband("Мики");

        julietta.setHusband(romeo);
        mini.setHusband(miki);

        romeo.setWife(mini);
        miki.setWife(julietta);

        romeo.tellAbout();
        julietta.tellAbout();

        miki.tellAbout();
        mini.tellAbout();
    }
}
