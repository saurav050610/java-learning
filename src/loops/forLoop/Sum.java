package loops.forLoop;

public class Sum {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 10; i=i+2) {
            sum=sum+i;
        }
        System.out.println("The sum is: "+sum);
    }
}
