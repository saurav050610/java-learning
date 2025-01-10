import java.util.Scanner;

public class BasicCalculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        char ch;

        do {
            System.out.println("Press '+' for Addition");
            System.out.println("Press '-' for difference");
            System.out.println("Press '*' for multiplication");
            System.out.println("Press '/' for quotient");
            System.out.println("Press '%' for remainder");
            System.out.println("Press 'X' to exit");

            System.out.println("Enter your choice: ");
            ch = sc.next().charAt(0);

            int[] nums;
            switch (ch) {
                case '+':
                    nums=input();
                    System.out.println("Sum= " + (nums[0] + nums[1]));
                    break;
                case '-':
                    nums=input();
                    System.out.println("Diff= " + (nums[0] - nums[1]));
                    break;
                case '*':
                    nums=input();
                    System.out.println("Product= " + (nums[0] * nums[1]));
                    break;
                case '/':
                    nums=input();
                    System.out.println("Quotient= " + (nums[0] / nums[1]));
                    break;
                case '%':
                    System.out.println("Enter any two numbers: ");
                    nums=input();
                    System.out.println("Remainder= " + (nums[0] % nums[1]));
                    break;
                case 'X':
                case 'x':
                    System.exit(0);
                default:
                    System.out.println("Invalid Operator!!! Try Again...");
                    break;
            }
        } while (ch != 'X' || ch != 'x');
    }

    static int[] input(){
        System.out.println("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        //arrays
        int[] numbers = {a,b};
        return numbers;
    }
}
