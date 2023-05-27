package example02;

public class Wife {

    private String name;

    private Husband husband;

    public Wife(String name) {
        this.name = name;
    }

    public void setHusband(Husband husband) {
        if (this.husband == null) {
            this.husband = husband;
        } else {
            System.out.println("Я - " + name + " и замужем за " + this.husband.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void tellAbout() {
        System.out.println("Я - " + name + ", мой муж - " + husband.getName());
    }

    public void beHappy() {
        this.husband = null;
    }
}
