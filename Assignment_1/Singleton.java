package Software_Design_Patterns.Assignment_1;

public class Singleton {
    private static Singleton instance;

    private Singleton () {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void showWorking() {
        System.out.println("Is working.");
    }
}
