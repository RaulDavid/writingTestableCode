package refactorCode;

public class Account {

    private int id;
    private String name;
    private int age;
    private boolean hasBooking;

    public Account(int id, String name, int age, boolean hasBooking) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hasBooking = hasBooking;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean hasBooking() {
        return  hasBooking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHasBooking(boolean hasBooking) {
        this.hasBooking = hasBooking;
    }
}
