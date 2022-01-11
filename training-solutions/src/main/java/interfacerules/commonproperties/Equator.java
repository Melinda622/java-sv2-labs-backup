package interfacerules.commonproperties;

public class Equator implements Name,Length{


    public static final String NAME="Equator";
    public static final double LENGTH=40_075.0;

    @Override
    public double getLength() {
        return LENGTH;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
