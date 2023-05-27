package example02;

public class Main {
    public static void main(String[] args) {
        Wife julietta = new Wife("Джульетта");
        Wife mini = new Wife("Мини");

        Husband romeo = new Husband("Ромео");
        Husband miki = new Husband("Мики");

        romeo.setWife(julietta);
        julietta.setHusband(romeo);

        miki.setWife(mini);
        mini.setHusband(miki);

        romeo.tellAbout();
        julietta.tellAbout();

        miki.tellAbout();
        mini.tellAbout();




    }
}
