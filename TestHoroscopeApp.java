package src;

public class TestHoroscopeApp {
    public static void main(String[] args) {
        // adding tests for input handling and flows

        // first test to check if the app initializes correctly
        try {
            HoroscopeApp app = new HoroscopeApp();
            System.out.println("HoroscopeApp initialized successfully!");
        } catch (Exception e) {
            assert false : "HoroscopeApp initialization failed";
        }
    }
}
