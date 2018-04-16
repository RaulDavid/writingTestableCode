package flawCode;

public class Account {

    private int id;
    private String name;
    private int age;
    private boolean hasBookCheckOut;

    public Account(int id, String name, int age, boolean hasBookCheckOut) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hasBookCheckOut = hasBookCheckOut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean hasBookCheckOut() {
        return hasBookCheckOut;
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

    public void setHasBookCheckOut(boolean hasBookCheckOut) {
        this.hasBookCheckOut = hasBookCheckOut;
    }
}
