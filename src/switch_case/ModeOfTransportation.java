package switch_case;
import java.util.Scanner;
public class ModeOfTransportation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance");
        String value=sc.nextLine();
        switch (value){
            case "<3 km":
                System.out.println("Walk");
                break;
            case "3-15 km":
                System.out.println("Bike");
                break;
            case "<15 km":
                System.out.println("Car");
                break;
            case "100-500 km":
                System.out.println("Train");
                break;
            case "1500-5000 km":
                System.out.println("Plane");
            break;
            default:
                System.out.println("Invalid input");

        }
    }
}
