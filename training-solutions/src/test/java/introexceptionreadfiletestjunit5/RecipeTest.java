package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    void addIngredients(){
        Recipe recipe=new Recipe();
        List<String> result=new ArrayList<>(Arrays.asList("liszt", "margarin", "kristálycukor", "tojás", "citrom", "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj"));
        Path path= Paths.get("src/main/java/introexceptionreadfiletestjunit5/recipe.txt");
        recipe.addIngredients(path);
        assertEquals(result,recipe.ingredients);
    }
}