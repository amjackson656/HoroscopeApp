package src;

public class TestZodiacSign {
    public static void main(String[] args) {
        ZodiacSign zodiacSign = new ZodiacSign("Aries", "Ram", "March 21 - April 19", "Fire", "Mars");

        assert "Aries".equals(zodiacSign.getName()) : "Name test failed";
        assert "Ram".equals(zodiacSign.getSymbol()) : "Symbol test failed";
        assert "March 21 - April 19".equals(zodiacSign.getDateRange()) : "Date Range test failed";
        assert "Fire".equals(zodiacSign.getElement()) : "Element test failed";
        assert "Mars".equals(zodiacSign.getRulingPlanet()) : "Ruling Planet test failed";

        System.out.println("All ZodiacSign tests passed!");
    }
}
