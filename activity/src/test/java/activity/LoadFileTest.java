package activity;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoadFileTest {

    @Test
    void testLoadGpx() throws IOException {
        Track track = new Track();
        Path path= Paths.get("src/test/resources/track.txt");

        track.loadFromGpx(path);

        assertEquals(2801, track.getTrackPoints().size());
        assertEquals(18.541194, track.getTrackPoints().get(0).getCoordinate().getLongitude(), 0.000005);
        assertEquals(47.218102, track.getTrackPoints().get(0).getCoordinate().getLatitude(), 0.000005);
        assertEquals(134.2, track.getTrackPoints().get(0).getElevation(), 0.05);
    }
}
