package example01;

public class Bus {
    private String number;

    private Driver driver; // ссылка на водителя

    public Bus(String number) {
        if (number != null && !number.equals("")) {
            this.number = number;
        } else {
            this.number = "NO_NUMBER";
        }
    }

    public String getNumber() {
        return number;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void go() {
        System.out.println("Автобус - " + number
                + " в пути, под управлением - " + driver.getName());
    }
}
