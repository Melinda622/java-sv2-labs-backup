package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a);

        Integer b = 2;
        System.out.println(b);

        Integer c = a;
        System.out.println(c);

        Integer d = b;
        System.out.println(d);

        Integer e = Integer.valueOf(2);
        System.out.println(e);

        int f = Integer.valueOf(2);
        System.out.println(f);

        int g = Integer.valueOf(a);
        System.out.println(g);

        int h = Integer.valueOf(c);
        System.out.println(h);

        int i = Integer.parseInt("2");
        System.out.println(i);

        Integer j = Integer.parseInt("2");
        System.out.println(j);

        boolean k = true;
        System.out.println(k);

        Boolean l = true;
        System.out.println(l);

        Boolean m = new Boolean(true);
        System.out.println(m);

        Boolean n = new Boolean(true);
        System.out.println(n);

        boolean o = Boolean.parseBoolean("TrUe");
        System.out.println(0);

        Boolean p = Boolean.parseBoolean("TrUe");
        System.out.println(p);

        Boolean q = Boolean.parseBoolean("TreU");
        System.out.println(q);

        Boolean r = Boolean.parseBoolean("TreU");
        System.out.println(r);
    }
}
