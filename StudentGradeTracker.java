import java.util.Scanner;
import java.lang.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        System.out.println("enter no of students");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a[]=new int[n];
        System.out.println("enter student grades");
       for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        int min=a[0],max=a[0],sum=0;
        double avg=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=min)
            {
                min=a[i];
            }
            else if(a[i]>=max)
            {
                max=a[i];
            }
            sum=sum+a[i];
        }
        System.out.println("lowest grade is :"+min);
        System.out.println("highest grade is :"+max);
         avg= (double)sum/n;
        System.out.println("average grade is :"+avg);
    }
    
}
