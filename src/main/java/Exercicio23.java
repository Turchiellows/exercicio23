// IMPORTS

import java.util.Scanner;

public class Exercicio23 {

   public static void main(String[] args) {
      // INSTANTIATE
      Scanner sc = new Scanner(System.in);

      // DECLARATE
      int s = 0;
      int e = 0;
      int cnt = 0;
      int result = 0;

      // COLLECT DATA
      System.out.print("START : ");
      s = sc.nextInt();
      System.out.print("END : ");
      e = sc.nextInt();

      // OUTPUT
      cnt = s;
      while (cnt <= e) {
         result += cnt;
         cnt++;
      }
      System.out.println("SUM: " + result);
   }
}
