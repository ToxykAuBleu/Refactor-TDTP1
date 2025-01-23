public class Driver {
    private String name;
    private int age;

    private static final int ADULT_AGE = 18;

    public Driver(String name, int years) {
        this.name = name;
        this.age = years;
    }

    public boolean isAdult() {
        return age >= ADULT_AGE;
    }

    public String getName() {
        return this.name;
    }

}
