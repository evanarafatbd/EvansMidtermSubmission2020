package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        // Input given array A
        int A[] = {1, 2, 11, 5};

        // Input given array B
        int B[] = {4, 12, 19, 23, 127, 235};


        // Calculate size of Both arrays
        int m = A.length;
        int n = B.length;

        // Call function to
        // print smallest result
        System.out.println(findSmallestDifference
                (A, B, m, n));



    }
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] Array1 = {30,12,5,9,2,20,33,1};
        int [] Array2 = {18,25,41,47,17,36,14,19};

    // function to calculate Small
    // result between two arrays
    public static int findSmallestDifference(int A[], int B[],
                                      int m, int n)
    {
        // Sort both arrays
        // using sort function
        Arrays.sort(A);
        Arrays.sort(B);

        int a = 0, b = 0;

        // Initialize result as max value
        int result = Integer.MAX_VALUE;

        // Scan Both Arrays upto
        // sizeof of the Arrays
        while (a < m && b < n)
        {
            if (Math.abs(A[a] - B[b]) < result)
                result = Math.abs(A[a] - B[b]);

            // Move Smaller Value
            if (A[a] < B[b])
                a++;

            else
                b++;
        }

        return result;
    }

}





