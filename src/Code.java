import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        int lo=1;
        int hi=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the limit =");
        int limit=sc.nextInt();
        System.out.println(lo);
        while (hi<limit)
        {
            System.out.println(hi);
            hi=lo+hi;
            lo=hi-lo;

        }
    }
}
