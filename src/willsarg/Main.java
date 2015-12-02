package willsarg;

/**
 * Created by sergeantw on 12/1/2015.
 */
public class Main {
    private static Main instance = new Main();

    public static Main getInstance() {
        return instance;
    }

    private Main() {
        System.out.println("Hello github!");
    }

    public static void main(String[] args) {
        getInstance();
    }
}
