import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        for (int i = a; i <= b; i++) {
            String result;
            if (i % 15 == 0) result = "FizzBuzz";
            else if (i % 3 == 0) result = "Fizz";
            else if (i % 5 == 0) result = "Buzz";
            else result = Integer.toString(i);
        
            System.out.println(result);
        }
    }
}
