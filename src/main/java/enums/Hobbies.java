package enums;

public enum Hobbies {
    SPORTS("//*[@for='hobbies-checkbox-1']"),
    READING("//*[@for='hobbies-checkbox-2']"),
    MUSIC("//*[@for='hobbies-checkbox-3']");

    private String locator;

    Hobbies(String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }

}
