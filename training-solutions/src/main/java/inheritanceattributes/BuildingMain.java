package inheritanceattributes;

public class BuildingMain {

    public static void main(String[] args) {

        Building building=new Building("Allee",100.34,5);

        SchoolBuilding schoolBuilding=new SchoolBuilding("Corvinus",60.78,3,100);

        System.out.println(building.getFloors());
        System.out.println(building.area);
        System.out.println(building.name);

        System.out.println(schoolBuilding.getNumberOfClassRooms());
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.name);
    }
}
