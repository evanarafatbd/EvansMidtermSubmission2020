package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {
    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */


    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

        public static int factorial( int n){
            if (n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    }



