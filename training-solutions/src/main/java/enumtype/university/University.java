package enumtype.university;

public enum University {
    BME("Budapesti Műszaki és Gazdaságtudományi Egyetem"), CORVINUS("Budapest Corvinus Egyetem"), ELTE("Eőtvös Lóránd Tudományegyetem"), SOTE("Semmelweis Orvostudományi Egyetem");

    private final String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
