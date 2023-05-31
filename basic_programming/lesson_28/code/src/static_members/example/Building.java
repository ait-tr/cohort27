package static_members.example;

public class Building {
    private static Security security = new Security();
    private String address;
    private String area;

    public Building(String address, String area) {
        this.address = address;
        this.area = area;
    }

    public void income() {
        security.secure();
    }
}
