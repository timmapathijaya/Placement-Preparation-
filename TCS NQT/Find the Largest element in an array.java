/*  Given an array, we have to find the largest element in the array. */
import java.util.*;
class Test
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        arr[i] = sc.nextInt();
        int largestElement = arr[0];
        for(int i = 1 ; i < n ; i++)
        largestElement = Math.max(largestElement , arr[i]);
        System.out.println(largestElement);
    }
}
// TC : O(N)
// SC : O(1)
