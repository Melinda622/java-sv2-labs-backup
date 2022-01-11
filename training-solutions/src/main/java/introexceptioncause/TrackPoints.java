package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {

    public List<String> readCoordinates() {
        List<String> coordinates = new ArrayList<>();
        try {
            coordinates = Files.readAllLines(Paths.get("src/main/java/introexceptioncause/tracking.csv"));
            return coordinates;
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public String [][] getElevation() {
        String[][]elevation=new String[readCoordinates().size()][3];
        for (int i = 0; i <readCoordinates().size() ; i++) {
            elevation[i]=readCoordinates().get(i).split(";");
        } return elevation;
    }

    public void printElevation(){

        for (int i = 1; i <readCoordinates().size() ; i++) {
            System.out.println(Integer.parseInt(getElevation()[i][2])-Integer.parseInt(getElevation()[i-1][2]));
        }
    }
}
