package example01;

import java.util.NavigableMap;

public class Passenger {
    private String name;
    private boolean isChild;

    public Passenger(String name, boolean isChild) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "NO_NAME";
        }
        this.isChild = isChild;
    }

    public String getName() {
        return name;
    }

    public boolean isChild() {
        return isChild;
    }
}
