import java.util.ArrayList;

public class Digits {
    
    private ArrayList<Integer> digitList;


    public Digits(int num) {
        digitList = new ArrayList<Integer>();

        if (num == 0) {
            digitList.add(0);
        }

        while (num > 0) {
            digitList.add(0, num % 10);
            num /= 10;
        }
    }


    public String toString() {
        return digitList.toString();
    }

    public static void main(String[] args) {
        Digits d1 = new Digits(15704);
        System.out.println(d1);

        Digits d2 = new Digits(0);
        System.out.println(d2);

        Digits d3 = new Digits(12345);
        System.out.println(d3);
    }
}