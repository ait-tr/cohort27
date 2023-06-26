package example03;

/**
 * 6/26/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Cover<T> {
    private T phone;

    public Cover(T phone) {
        this.phone = phone;
    }

    public T getPhone() {
        return phone;
    }
}
