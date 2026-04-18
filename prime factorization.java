// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("enter your number");
        int n=scn.nextInt();
        int primecount=0;
        for(int div =2;div*div<=n;div++)
        {
            while(n%div==0)
            {
                n=n/div;
                System.out.println(div+" ");
                
            }
            
    
            if(n !=1)
            {
                System.out.println(n);
                primecount++;
            }
        }
        System.out.println("total number:"+primecount);
}
}
