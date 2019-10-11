import java.util.*;
class Student
{
    String usn,name;
    int sem;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the usn of the student");
        usn = sc.nextLine();
        System.out.println("Enter the name of the student");
        name = sc.nextLine();
        System.out.println("Enter the semester of the student");
        sem = sc.nextInt();
    }
    void output()
    {
        System.out.println("Name: " + name + "\nUSN: " + usn + "\nSemester: " + sem);
    }
}
class Test extends Student
{
    int cmarks[] = new int[6];
    static int cre[] = new Int[]{4,4,4,4,3,3};
    void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the CIE marks of all courses in order");
        for(int i = 0;i<6;i++)
        {
            cmarks[i] = sc.nextInt();
        }
    }
    void output()
    {
        super.output();
    }
}
class Exam extends Test
{
    int smarks[] = new int[6];
    void input()
    {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the SEE marks of all the courses in order");
        for(int i = 0;i<6;i++)
        {
            smarks[i] = sc.nextInt();
        }
    }
    void output()
    {
        super.output();
    }
}
class Result extends Exam
{
    double sgpa;
    int grade(int marks)
    {
        if(marks>=90)
        {
            return 10;
        }
        else if(marks>=80)
        {
            return 9;
        }
        else if(marks>=70)
        {
            return 7;
        }
        else if(marks>=60)
        {
            return 6;
        }
        else if(marks>=50)
        {
            return 5;
        }
        else if(marks>=40)
        {
            return 4;
        }
        else
        {
            return 0;
        }
    }
    void input()
    {
        super.input();
    }
    double calc()
    {
        sgpa = 0;
        int sum = 0;
        for(int i = 0; i<6;i++)
        {
            if(grade(cmarks[i]+smarks[i]) == 0)
            {
                sgpa = 0;
                break;
            }
            sgpa += grade(cmarks[i]+smarks[i])*cre[i];
            sum = sum + cre[i];
        }
        sgpa /= sum;
        return sgpa;
    }
    void output()
    {
        super.output();
        System.out.println("SGPA of the student is: " + calc());
    }
}
class SGPAdemo
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        Student s[] = new Student[n];
        for(int i = 0;i<n;i++)
        {
            s[i] = new Result();
            s[i].input();
            s[i].output();
        }
    }
}