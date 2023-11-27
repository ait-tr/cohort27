package lesson_05.task_4;

import javax.xml.bind.annotation.*;
import java.util.Objects;

@XmlType(name = "owner")
@XmlAccessorType(XmlAccessType.FIELD)
public class Owner {

    @XmlAttribute(name = "first_name")
    private String name;

    @XmlElement(name = "cellphone")
    private String phone;

    public Owner() {
    }

    public Owner(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(name, owner.name) && Objects.equals(phone, owner.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }

    @Override
    public String toString() {
        return String.format("Владелец: имя - %s, номер телефона - %s.", name, phone);
    }
}