package src;

public class TestDailyHoroscope {
    public static void main(String[] args) {
        DailyHoroscope dailyHoroscope = new DailyHoroscope("Taurus", "Bull", "April 20 - May 20", "Earth", "Venus",
                "Today is your lucky day", "2 PM", "Overthinking");

        // Testing inherited properties
        assert "Taurus".equals(dailyHoroscope.getName()) : "Inherited Name test failed";
        assert "Bull".equals(dailyHoroscope.getSymbol()) : "Inherited Symbol test failed";

        // Testing DailyHoroscope specific properties
        assert "Today is your lucky day".equals(dailyHoroscope.getHoroscopeText()) : "Horoscope Text test failed";
        assert "2 PM".equals(dailyHoroscope.getLuckyTime()) : "Lucky Time test failed";
        assert "Overthinking".equals(dailyHoroscope.getChallenges()) : "Challenges test failed";

        System.out.println("All DailyHoroscope tests passed!");
    }
}
