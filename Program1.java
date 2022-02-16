import java.util.*;
public class Program1 {
    

    public static void main(String[] args) {
        System.out.println("Welcome to Math problem: Ciel and A-B Problem \n");
        System.out.println("Enter an Integer for A: ");
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = A+1;
        while (B >= A)
        {
            System.out.println("Enter an Integer for B that is less than A (P.S if value entered for B is less than A you will be prompted for a new value): ");
            B = in.nextInt();
        }
        String Result = Integer.toString(A - B);
        String wrongDigit = Integer.toString((int)Math.floor(Math.random()*(9-1+1)+1));
        StringBuilder finalResult = new StringBuilder(Result);
        int count = 0;
        while (count <= 0)
        {
            if (wrongDigit.charAt(0) != Result.charAt(0))
            {
                finalResult.setCharAt(0,wrongDigit.charAt(0));
                count = 1;
            }
            else
            {
                wrongDigit = Integer.toString((int)Math.floor(Math.random()*(9-1+1)+1));
            }
        }
        System.out.println("Random Integer: "+wrongDigit);
        System.out.println("Correct Result: "+Result);
        System.out.println("Length of Resutl: "+Result.length());
        System.out.println("Character at index 0: "+Result.charAt(0));
        System.out.println("Final Result: "+finalResult);
        
    }
}
