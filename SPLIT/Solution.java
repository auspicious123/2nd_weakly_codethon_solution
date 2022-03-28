import java.util.*;
public class d6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[testcase];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();

        }
        for(int i=0;i<arr.length;i++)
        {
            operation(arr[i]);
        }

    }

    public static void operation(String s)
    {
        int a=0;
        int b=0;
       for(int i=0;i<s.length();i++)
       {
           int j=Character.getNumericValue(s.charAt(i));
           if(j%2==0)
           {
               b+=1;
           }
           else
           {
               a=a+1;
           }

       }
       char ch=s.charAt(s.length()-1);
       int last=Character.getNumericValue(ch);
        if(last%2==0&&b>=2)
       {
           System.out.println("YES");
       }
       else if(last%2!=0&&a>=2)
       {
           System.out.println("YES");
       }
       else
       {
           System.out.println("NO");
       }
    }
}
