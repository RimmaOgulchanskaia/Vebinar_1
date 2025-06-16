package enums;

public enum StateCity {
    NCR("NCR", new String[]{"Delhi","Gurgaon","Noida"}),
    UTTAR_PRADESH("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"}),
    HARYANA("Haryana", new String[]{"Karnal", "Panipat"}),
    RAJASTHAN("Rajasthan", new String[]{"Jaipur", "Jaiselmer"});


    private String state;
    private String[] city;

    StateCity(String state, String[] city) {
        this.state = state;
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String[] getCity() {
        return city;
    }

    public void setCity(String[] city) {
        this.city = city;
    }
}
