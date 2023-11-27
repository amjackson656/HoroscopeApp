package src;

public class DailyHoroscope extends ZodiacSign {
    private String horoscopeText;
    private String luckyTime;
    private String challenges;

    // Constructor
    public DailyHoroscope(String name, String symbol, String dateRange, String element, String rulingPlanet,
            String horoscopeText, String luckyTime, String challenges) {
        super(name, symbol, dateRange, element, rulingPlanet);
        this.horoscopeText = horoscopeText;
        this.luckyTime = luckyTime;
        this.challenges = challenges;
    }

    // Getters for DailyHoroscope attributes
    public String getHoroscopeText() {
        return horoscopeText;
    }

    public String getLuckyTime() {
        return luckyTime;
    }

    public String getChallenges() {
        return challenges;
    }

    // will add methods as needed here
}
