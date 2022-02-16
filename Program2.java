
import java.util.*;
public class Program2 {

    public static void main(String[] args) {
        System.out.println("Welcome to Math problem: ATM (https://www.codechef.com/problems/HS08TEST)");
        System.out.println("Enter the initial account balance with two digits of precision (ex. 120.00): ");

        Scanner in = new Scanner(System.in);
        float balance = in.nextFloat();

        System.out.println("Enter the amount you wish to withdraw: ");
        int withdraw = in.nextInt();
        if (withdraw % 5 == 0 & balance - (withdraw+.50) >0 )
            {
                System.out.printf("Succesful transaction, Account balance: %.2f\n",(balance-(withdraw+.50)));
            }
        else if (withdraw % 5 !=0)
            {
                System.out.printf("Incorrect Withdrawal Amount: %.2f\n",balance);
            }
        else
            {
                System.out.printf("Insufficient Funds: %.2f\n",balance);
            }
        /*    
        System.out.println("Result of amount to withdraw: "+withdraw);
        System.out.println("Mod 5 of the withdraw: "+(withdraw % 5));
        System.out.println("Result of float without precision format: "+balance);
        System.out.printf("Result of float without precision format: %.2f\n",balance);
        */

    
}

}
