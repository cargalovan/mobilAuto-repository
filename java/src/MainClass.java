import org.junit.Test;

public class MainClass extends MainClassTest {
    int a = 14;

    @Test
    public void myFirstTest() {
        int a = this.multiply(14);
        System.out.println(a);

    }


}
