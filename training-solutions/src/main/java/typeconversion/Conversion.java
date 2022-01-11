package typeconversion;

public class Conversion {
    public double convertDoubleToDouble(double number) {
        int convertedNumber = (int) number;
        double result = convertedNumber;
        return result;
    }

    public byte[] convertIntArrayToByteArray(int[] a) {
        byte[] b = new byte[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0 || a[i] > 127) {
                b[i] = (byte) -1;
            } else {
                b[i] = (byte) a[i];
            }
        }
        return b;
    }

    public int getFirstDecimal(double number) {
        int a = (int) number;
        double b = (number - a) * 10;
        int result = (int) b;
        return result;
    }
}
