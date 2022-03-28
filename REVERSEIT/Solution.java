import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a1= new ArrayList<>();
        ArrayList<ArrayList<Integer>> a2= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int size=sc.nextInt();
            for(int j=0;j<size;j++)
            {
                int e=sc.nextInt();
                a1.add(e);
            }
            a2.add(a1);
            a1= new ArrayList<>();
        }
        for(int i=0;i<a2.size();i++)
        {
            a1=a2.get(i);
            for(int j=a1.size()-1;j>=0;j--)
            {
                System.out.print(a1.get(j)+" ");
            }
            System.out.println();
        }
    }
}
