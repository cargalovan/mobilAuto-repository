import org.junit.Test;

public class MainClass {
    int a = 14;

    @Test
    public void myFirstTest() {
        int a = getLocalNumber();
    }

    public int getLocalNumber() {
        return 14;
    }
}