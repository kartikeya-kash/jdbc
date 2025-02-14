import java.util.Scanner;

public class exceptiondemo {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        
        if(age<18){
            throw new RuntimeException("not allowed");
        }
        else{
            System.out.println("allowed");

        }
    }
}
