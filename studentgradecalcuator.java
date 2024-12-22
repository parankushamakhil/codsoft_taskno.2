import java.util.*;
public class studentgradecalcuator
{
    public static void main(String[] args) {
        int totalmarks=0,averagepercentage,subjects;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of subjects");
        subjects=s.nextInt();
        int marks[]=new int[subjects];
        System.out.println("Enter marks obtained (out of 100) in each subject");
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=s.nextInt();
        }
        for(int i=0;i<marks.length;i++)
        {
            totalmarks=totalmarks+marks[i];
        }
        System.out.println("Total Marks (out of "+(100*subjects)+"): "+totalmarks);
        averagepercentage=totalmarks/subjects;
        System.out.println("Average percentage: "+averagepercentage+"%");
        if(averagepercentage>=90)
        {
            System.out.println("Grade: O");
        }
        else if(averagepercentage>=80 )
        {
            System.out.println("Grade: A");
        }
        else if(averagepercentage>=70)
        {
            System.out.println("Grade: B");
        }        
        else if(averagepercentage>=60)
        {
            System.out.println("Grade: C");
        }
        else if(averagepercentage>=50)
        {
            System.out.println("Grade: D");
        }
        else if(averagepercentage>=40)
        {
            System.out.println("Grade: E");
        }
        else
        {
            System.out.println("Grade: F");
        }
        s.close();
    }
}