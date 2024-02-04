package model;

/**
 * Singleton participant
 * The Bell is a singleton class, which means that only one instance of it can be created.
 */
public final class TheBell {//final class means that it cannot be extended
    private static TheBell bellConnection;
    private static final Object lockObject = new Object();

    private TheBell() {//Hiding the constructor
    }

    public static TheBell getInstance() {
        synchronized (lockObject) {
            if (bellConnection == null) {
                bellConnection = new TheBell();
            }
        }
        return bellConnection;
    }

    public void ring() {
        System.out.println("Ding! Order up!");
    }
}
