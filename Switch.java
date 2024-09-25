import java.util.Scanner;
public class Switch {
    public static void main(String[] arg){
        
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
        }
    }
}
