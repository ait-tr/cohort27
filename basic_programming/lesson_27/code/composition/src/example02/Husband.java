package example02;

public class Husband {

    private String name;

    private Wife wife;

    public Husband(String name) {
        this.name = name;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
        this.wife.setHusband(this);
    }

    public String getName() {
        return name;
    }

    public void tellAbout() {
        System.out.println("Я - " + name + ", моя жена - " + wife.getName());
    }
}
