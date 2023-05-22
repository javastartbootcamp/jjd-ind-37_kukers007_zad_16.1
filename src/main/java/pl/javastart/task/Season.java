package pl.javastart.task;

public enum Season {
    SPRING("Wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("Jesień", new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("Zima", new String[]{"grudzień", "styczeń", "luty"});

    private final String translatePl;
    private final String[] months;

    Season(String translatePl, String[] months) {
        this.translatePl = translatePl;
        this.months = months;
    }

    public String getTranslatePl() {
        return translatePl;
    }

    public String[] getMonths() {
        return months;
    }

    @Override
    public String toString() {
        return translatePl;
    }
}