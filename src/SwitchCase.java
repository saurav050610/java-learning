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
