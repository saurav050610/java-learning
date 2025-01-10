package homeworks;
import java.util.Scanner;
public class Homework3 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:");
        String value=sc.nextLine();
        switch(value){
            case "Sunny":
                System.out.println("Chill out in home");
                break;
            case "Rainy":
                System.out.println("Go ouside and enjoy the rain");
                break;
            case "Windy":
                System.out.println("Go outside and play");
                break;
            case "Snowy":
                System.out.println("Stay inside house");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
