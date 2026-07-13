import java.util.*;

class Stack<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void push(T value) {
        list.add(value);
    }

    public T pop() {

        if (list.isEmpty()) {
            return null;
        }

        return list.remove(list.size() - 1);
    }

    public void display() {
        System.out.println(list);
    }
}

public class GenericStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Removed : " + stack.pop());

        stack.display();
    }
}