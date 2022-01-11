package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String data) {

        if (data == null) {
            throw new NullPointerException("Binary string is null.");
        }

        boolean[] output = new boolean[data.length()];

        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '0') {
                output[i] = false;
            } else if (data.charAt(i) == '1') {
                output[i] = true;
            } else {
                throw new IllegalArgumentException("Binary string is not valid.");
            }
        }
        return output;
    }

    public String booleanArrayToBinaryString(boolean[] input) {
        StringBuilder sb = new StringBuilder();

        if (input == null) {
            throw new NullPointerException();
        } else if (input.length == 0) {
            throw new IllegalArgumentException("Boolean array is empty.");
        }

        for (int i = 0; i < input.length; i++) {
            if (!input[i]) {
                sb.append("0");
            } else if (input[i]) {
                sb.append("1");
            }
        }
        return sb.toString();
    }
}

