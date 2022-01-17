package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {

    private String address;
    private int area;
    private int levels;

    public Building(String address, int area, int levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    @Override
    public int compareTo(Building building) {
        return this.levels - building.levels;
    }

    @Override
    public String toString() {
        return "address= " + address +
                ", area=" + area +
                ", levels= " + levels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return levels == building.levels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    public static void main(String[] args) {

        Building b1 = new Building("Budapest", 300, 3);
        Building b2 = new Building("Eger", 500, 5);
        Building b3 = new Building("Debrecen", 700, 4);

        Set<Building> buildings = new TreeSet<>();
        buildings.add(b1);
        buildings.add(b3);
        buildings.add(b2);
        System.out.println(buildings);
    }
}
