import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Predicate;

public class Sorting {
   static Scanner scanner = new Scanner(System.in);

   static void sortListAlhabetically(ArrayList<String> inputWords) {
      Collections.sort(inputWords);
      Collections.reverse(inputWords);
      System.out.println(inputWords);
   }

   public static void main(String[] args) {
      ArrayList<String> stringArrayList = new ArrayList<>();
      System.out.println("Type five words to be sorted:");
      for (int i = 0; i < 5; i++) {
         String input = scanner.next();
         stringArrayList.add(input);
      }
      sortListAlhabetically(stringArrayList);
   }
}
