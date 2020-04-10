package math.problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

         int k=0, a=1, b=1;

         Scanner scanner= new Scanner(System.in);
         System.out.println("Write the number you want Fibonacci number up to : ");

         int num = scanner.nextInt();

         while(k<=num) {

             k=a+b;

             if(k>=num)
                 break;


             System.out.println(k);

             a=b;
             b=k;

         }



    }
}
