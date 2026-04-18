// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("enter low:");
        int low=scn.nextInt();
        System.out.print("enter high:");
        int high=scn.nextInt();
        int primecount =0;
        for(int n=low;n<=high;n++)
        {
            if(n<=1) continue;
            int count=0;
            for(int div = 2;div*div<=n;div++)
            {
                if(n%div == 0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(n);
                primecount++;
            }
        }
        System.out.println("total prime number is:"+primecount);
    }
}
