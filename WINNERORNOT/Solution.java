import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        int find=arr.length-1;
        for(int i=0;i<3;i++)
        {
            if(arr[i]==arr[find])
            {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
