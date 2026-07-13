class Pair<T, U> {

    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println("First : " + first);
        System.out.println("Second : " + second);
    }

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("Rahul", 101);
        pair.display();
    }
}