package Base.Base;

public enum EnumSample {
    SMALL("S"),
    MEDIUM("M"),
    LARGE("L");
    private String abbrevation;
    private EnumSample(String abbrevation) {
        this.abbrevation = abbrevation+"ssssss";
        System.out.println("EnumSample-----> " + this.abbrevation);

    }

    public String getAbbrevation() {
        return this.abbrevation;
    }
}
