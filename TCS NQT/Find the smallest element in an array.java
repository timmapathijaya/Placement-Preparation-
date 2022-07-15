/* Given an array, we have to find the smallest element in the array. */
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
        int smallestElement = arr[0];
        for(int i = 1 ; i < n ; i++)
        smallestElement = Math.min(smallestElement , arr[i]);
        System.out.println(smallestElement);
    }
}
// TC : O(N)
// SC : O(1)
