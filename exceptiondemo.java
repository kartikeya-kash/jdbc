import java.util.Scanner;

public class exceptiondemo {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int dividend = input.nextInt();
        int divisor = input.nextInt();
        try{
        int res =  (dividend/divisor);
        System.out.println("result = "+ res);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
