import java.util.*;

class Repository<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void add(T value) {
        list.add(value);
    }

    public void display() {
        for (T value : list) {
            System.out.println(value);
        }
    }
}

public class GenericRepository {

    public static void main(String[] args) {

        Repository<String> repository = new Repository<>();

        repository.add("Book");
        repository.add("Pen");
        repository.add("Notebook");

        repository.display();
    }
}