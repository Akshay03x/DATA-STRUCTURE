class Pair<T> {
    private T first;
    private T second;

    public Pair(T first,T second){
        this.first=first;
        this.second=second;
    }

    public void setFirst(T first){
        this.first=first;
    }
    public void setSecond(T second){
        this.second=second;
    }

    public T getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
    }
}
public class ganeric{
    public static void main(String[] args) {
        Pair<String> p=new Pair<>("first", "second");

        System.out.println(p.getFirst());
    }
}
