```java
import java.util.Scanner;

// vowels or consonants
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

//        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
//            System.out.println(ch+" is a vowel");
//        }else{
//            System.out.println(ch+" is a consonant");
//        }

        switch(ch){
            case 'a', 'A', 'e', 'E', 'i', 'I','o','O','u','U':
                System.out.println(ch+" is a vowel");
                break;
            default:
                System.out.println(ch+" is a consonant");
        }

    }
}
```

```java
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter operator: ");
        char ch  = sc.next().charAt(0);

        switch(ch){
            case '+':
                System.out.println("Sum= "+(a+b));
                break;
            case '-':
                System.out.println("Diff= "+(a-b));
                break;
            case '*':
                System.out.println("Product= "+(a*b));
                break;
            case '/':
                System.out.println("Quotient= "+(a/b));
                break;
            case '%':
                System.out.println("Remainder= "+(a%b));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
```
### Enhanced Switch
```java
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter operator: ");
        char ch  = sc.next().charAt(0);

        switch (ch) {
            case '+' -> System.out.println("Sum= " + (a + b));
            case '-' -> System.out.println("Diff= " + (a - b));
            case '*' -> System.out.println("Product= " + (a * b));
            case '/' -> System.out.println("Quotient= " + (a / b));
            case '%' -> System.out.println("Remainder= " + (a % b));
            default -> System.out.println("Invalid Operator");
        }
    }
}
```

```java
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do{
        System.out.println("Press '+' for Addition");
        System.out.println("Press '-' for difference");
        System.out.println("Press '*' for multiplication");
        System.out.println("Press '/' for quotient");
        System.out.println("Press '%' for remainder");
        System.out.println("Press 'X' to exit");

        System.out.println("Enter your choice: ");
        ch  = sc.next().charAt(0);

        System.out.println("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

            switch (ch) {
                case '+' -> System.out.println("Sum= " + (a + b));
                case '-' -> System.out.println("Diff= " + (a - b));
                case '*' -> System.out.println("Product= " + (a * b));
                case '/' -> System.out.println("Quotient= " + (a / b));
                case '%' -> System.out.println("Remainder= " + (a % b));
                case 'X', 'x' -> System.exit(0);
                default -> System.out.println("Invalid Operator!!! Try Again...");
            }
        }while(ch!='X' || ch!='x');
    }
}
```
- **ISSUE**: the issue is when i press X or x , it takes input then it exits.

```java
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

            int a, b;
            switch (ch) {
                case '+':
                    System.out.println("Enter any two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Sum= " + (a + b));
                    break;
                case '-':
                    System.out.println("Enter any two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Diff= " + (a - b));
                    break;
                case '*':
                    System.out.println("Enter any two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Product= " + (a * b));
                    break;
                case '/':
                    System.out.println("Enter any two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Quotient= " + (a / b));
                    break;
                case '%':
                    System.out.println("Enter any two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Remainder= " + (a % b));
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
}
```

```java
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
```
