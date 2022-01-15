package collectionsqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ToDoList {

    private List<ToDo> todos = new ArrayList<>();

    public ToDoList(List<ToDo> todos) {
        this.todos = todos;
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> result = new ArrayDeque<>();
        for (ToDo actual : todos) {
            if (actual.isUrgent()) {
                result.push(actual);
            } else {
                result.add(actual);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<ToDo> todos = new ArrayList<>();
        todos.add(new ToDo("homework", true));
        todos.add(new ToDo("dishwashing", false));
        todos.add(new ToDo("vacuuming", false));
        todos.add(new ToDo("payment", true));

        ToDoList toDoList = new ToDoList(todos);
        System.out.println(toDoList.getTodosInUrgencyOrder());
        System.out.println(toDoList.getTodosInUrgencyOrder().pop());
    }
}
