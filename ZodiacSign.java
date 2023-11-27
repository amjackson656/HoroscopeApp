package src;

public class ZodiacSign {
    private String name;
    private String symbol;
    private String dateRange;
    private String element;
    private String rulingPlanet;

    // Constructor
    public ZodiacSign(String name, String symbol, String dateRange, String element, String rulingPlanet) {
        this.name = name;
        this.symbol = symbol;
        this.dateRange = dateRange;
        this.element = element;
        this.rulingPlanet = rulingPlanet;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getDateRange() {
        return dateRange;
    }

    public String getElement() {
        return element;
    }

    public String getRulingPlanet() {
        return rulingPlanet;
    }

    // additional methods to be added here as needed
}
