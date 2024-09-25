import java.util.Scanner;

public class questioin {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        if(cash > 10){
            System.out.println("cash is suficent");
        }else if(cash < 10){
            System.out.println("not");
        }else{
            System.out.println("nothing");
        }

    }
}   
