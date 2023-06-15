import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Product_Series {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                String num = bufferedReader.readLine();
                maxProduct(k,n,num);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
    
    public static void maxProduct(int k,int n, String num){
        int product = 0;
        for (int i = 0; i<=n-k;i++){
            int temp_product = Character.getNumericValue(num.charAt(i));
            System.out.println(temp_product);
            for (int j = i+1; j<k+i;j++){
                temp_product = temp_product * Character.getNumericValue(num.charAt(j));
                System.out.println(Character.getNumericValue(num.charAt(j)));
            }
            if (product < temp_product){
                product = temp_product;
            }
        }
        System.out.println(product);
    }
}