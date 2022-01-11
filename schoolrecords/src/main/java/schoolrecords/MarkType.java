package schoolrecords;

public enum MarkType {

    A(5, "excellent"), B(4, "very good"), C(3, "improvement needed"), D(2, "close fail"), F(1, "fail");

    private final int numberValue;
    private final String stringValue;

    MarkType(int numberValue, String stringValue) {
        this.numberValue = numberValue;
        this.stringValue = stringValue;
    }

    public int getNumberValue() {
        return numberValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}
