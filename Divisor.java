import java.util.*;

class FindDivisor
{
    int num;

    FindDivisor(int num)
    {
        this.num = num;
    }

    void checkDivisor()
    {
        if(num<=1)
            return;
        while(num%2 == 0)
        {
            System.out.print("2 ");
            num= num/2;
        }
        while(num% 3 == 0)
        {
            System.out.print("3 ");
            num = num/3;
        }
        for (int i = 5;i*i<=num;i = i+6)
        {
            while(num%i == 0)
            {
                System.out.print(i+" ");
                num = num/i;
            }
            while(num%(i+2)==0)
            {
                System.out.print(i+2+" ");
                num = num/(i+2);
            }
        }
        if(num>3)
        {
            System.out.print(num+" ");
        }

    }
}

public class Divisor {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter number:: ");
        num = scan.nextInt();
        FindDivisor obj = new FindDivisor(num);
        obj.checkDivisor();
        
        scan.close();
    }
    
}



