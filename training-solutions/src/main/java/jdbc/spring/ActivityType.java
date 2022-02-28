package jdbc.spring;

public enum ActivityType {

    BIKING("biking"), HIKING("hiking"), RUNNING("running"), BASKETBALL("basketball");

    private String value;

    ActivityType(String value) {
        this.value = value;
    }
}

