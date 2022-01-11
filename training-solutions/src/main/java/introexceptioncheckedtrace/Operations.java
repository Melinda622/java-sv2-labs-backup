package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {

    public List<String> readFile() throws IOException {
        List<String> underground=Files.readAllLines(Paths.get("src/main/java/introexceptioncheckedtrace/underground.txt"));
        return underground;
    }

    public String getDailySchedule(List<String> underground) {
        StringBuilder sb = new StringBuilder();
        sb.append(LocalDate.now());
        sb.append(", ");

        for (String u : underground) {
            if (u.charAt(0) == '2') {
                sb.append(u);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
