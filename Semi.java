import java.util.*;
class Prime
{
    int n;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number(within 200)");
        n = sc.nextInt();
    }
    boolean isprime(int k)
    {
        for(int i = 2;i<k;i++)
        {
            if(k%i==0)
            {
                return false;
            }
        }
        return true;
    }
    void test()
    {
        for(int i = 2;i<=n/2;i++)
        {
            if(n%i==0 && (n/i)!=i && isprime(n/i))
            {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
public class Semi
{
    public static void main(String args[])
    {
        Prime p = new Prime();
        p.input();
        p.test();
    }
}
