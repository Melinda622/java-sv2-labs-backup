package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recipe {

    List<String> ingredients = new ArrayList<>();

    private List<String> readRecipe(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void addIngredients(Path path) {

        for (int i = 2; i < readRecipe(path).size(); i++) {
            String[] a = readRecipe(path).get(i).split(" ");
            ingredients.add(a[2]);

        }
        System.out.println(ingredients);
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
