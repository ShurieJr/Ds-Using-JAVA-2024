package CA224;

public class Pair<T, U> {
    T first;
    U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<>(1, "one");
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
        System.out.println(p.toString());
    }
}
