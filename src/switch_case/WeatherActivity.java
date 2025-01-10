package switch_case;
import java.util.Scanner;
public class WeatherActivity {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any weather");
        String value=sc.nextLine();
        switch (value){
            case "Sunny":
                System.out.println("Chill out in home");
                break;
            case "Windy":
                    System.out.println("Go outside and play");
                break;
            case "Rainy":
                System.out.println("Go outside and enjoy the rain");
                break;
            case "Snowy":
                System.out.println("Stay inside the house and chill");
                break;
            default:
                System.out.println("Invalid weather");

        }
    }
}
