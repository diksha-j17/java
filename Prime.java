import java.util.*;

class isPrime
{
    int n;

    isPrime(int n)
    {
        this.n = n;
    }

    void checkPrime()
    {
        if(n == 1)
        {
            System.out.println("One is a composite number");
        }
        if(n == 2 || n==3)
        {
            System.out.println(n+" is a prime number");
        }
        if(n%2 == 0 || n%3 == 0)
        {
            System.out.println(n+" is not a prime number");
        }
        for (int i = 5;i*i<n ; i=i+6)
        {
            if (n%i == 0 || n%(i+2)== 0)
            {
                System.out.println(n+" is not a prime number");
            }
            else 
                System.out.println(n+" is a prime number");
        }
    }
}

public class Prime {
    public static void main(String[] args)
    {
        int n;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter you want to check prime or not :: ");
        n = scan.nextInt();
        isPrime obj = new isPrime(n);
        obj.checkPrime();
        scan.close();
    }
}
