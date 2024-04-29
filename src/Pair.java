public class Pair<T> {
    public T first;
    public T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return first;
    }
    public T getSecond() {
        return second;
    }
    public void setFirst(T first){
        this.first = first;
    }
    public void setSecond(T second){
        this.second = second;
    }

    public static void main(String[] args) {
        Pair <Integer> pair = new Pair<>(1, 2);
        Pair <String> pair2 = new Pair<>("1", "2");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
    }

}