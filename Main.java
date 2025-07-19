import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Main {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         Random random = new Random();

         int number = random.nextInt(1,1000000);
         int roll = 1;

         while(number != 696969) {
             System.out.println(number);
             number = random.nextInt(1,1000000);
             System.out.println(number);
             roll++;

         }

         System.out.println("congrats we finally won");
         System.out.println("it took  us " + roll + " rolls");

         scanner.close();
    }

}
