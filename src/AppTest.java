public class AppTest {

    public static void main(String[] args) {

        if (Main.add(10, 20) == 30) {
            System.out.println("TEST PASSED");
        } else {
            throw new RuntimeException("TEST FAILED");
        }
    }
}
