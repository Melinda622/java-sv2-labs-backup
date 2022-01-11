package typeconversion;

import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {

        Conversion conversion = new Conversion();

        System.out.println(conversion.convertDoubleToDouble(10.6));

        int[] a = {5, -14, 6, 2, 125, 354, 9738, 3};

        System.out.println(Arrays.toString(conversion.convertIntArrayToByteArray(a)));

        System.out.println(conversion.getFirstDecimal(10.6));
    }
}
