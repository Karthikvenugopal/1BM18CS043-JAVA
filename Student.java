import java.util.*;
public class Student
{
    String usn,name;
    static int cre[] = new int[]{4,4,4,4,3,3,1,2};
    int marks[] = new int[8];
    int grade[] = new int[8];
    double sgpa;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        name = sc.nextLine();
        System.out.println("Enter the usn of the student");
        usn = sc.nextLine();
        System.out.println("Enter the marks of the student");
        for(int i=0;i<8;i++)
        {
            marks[i] = sc.nextInt();
        }
    }
    void cal()
    {
        sgpa = 0.0;int flag = 1;
        for(int i=0;i<8;i++)
        {
            if(marks[i]>=90)
            {grade[i]=10;}
            else if(marks[i]>=75)
            {grade[i]=9;}
            else if(marks[i]>=65)
            {grade[i]=8;}
            else if(marks[i]>=55)
            {grade[i]=7;}
            else if(marks[i]>=45)
            {grade[i]=6;}
            else if(marks[i]>=40)
            {grade[i]=5;}
            else
            {
                grade[i]=0;
                flag = 0;
                break;
            }
        }
        for(int i=0;i<8;i++)
        {
            if(flag == 0)
            {
                sgpa = 0.0;
                System.out.println("The student has failed in a course(s) so the SGPA cannot be calculated");
                break;
            }
            sgpa+=(double)grade[i]*cre[i];
        }
        sgpa /= 25.0;
    }
    void output()
    {
        System.out.println("NAME:"+ name);
        System.out.println("USN:"+ usn);
        System.out.println("SGPA:"+ sgpa);
    }
}
