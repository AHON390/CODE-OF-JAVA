import java.util.Scanner; // Added the required import

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter your number: ");
        int num = scn.nextInt();
        
        // Use double quotes for the messages below
        if (num % 2 == 0) {
            System.out.println("Your number is even");
        } 
        else {
            System.out.println("Your number is odd");
        }
        
        scn.close();
    }
}
