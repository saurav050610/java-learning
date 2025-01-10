package homeworks;
import java.util.Scanner;
public class Homework1 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter tour choice");
        String value=sc.next();
        switch(value) {
            case "13":
                System.out.println("Child");
                break;
            case "13-19" :
                System.out.println("Tennager");
                break;
            case "20-59":
                System.out.println("Adult");
                break;
            case "+60":
                System.out.println("Senior");
                break;
            default:
                System.out.println("Invalid choice");



        }



    }
}
