import java.util.Scanner;
public class Maven {
    
    public static void sayHello(int num) {
    if (num == 0) {
        System.out.println("Done");
    
    }else {
        System.out.println("Hello");
        sayHello(num - 1); 
    } 
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
       
        System.out.println("Enter Number:");
        int num = scan.nextInt();
        sayHello(num);
    }
}
