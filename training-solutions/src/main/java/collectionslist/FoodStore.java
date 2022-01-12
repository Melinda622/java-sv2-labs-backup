package collectionslist;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class FoodStore {

    private List<Food> foods =new LinkedList<>();

    public void addFood(Food f){
        foods.add(f);
    }

    public void sellFirst(Food f){
        if(f.getExpirationDate().isEqual(LocalDate.now())){
            foods.add(0, f);
        }
    }

    public List<Food> getFoods() {
        return foods;
    }
}
