import java.util.LinkedList;

public class Main {
    public static LinkedList<Integer> divisors(int num) {
        LinkedList<Integer> result = new LinkedList<>();
        for(int i=1; i<=num; i++) {
            if(num % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(divisors(10));
    }
}