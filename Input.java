import java.util.Scanner;

public class Input {
    @SuppressWarnings("resource")
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age");
        // int age = sc.nextInt();
        // System.out.println(age);
        // float f = sc.nextFloat();
        // System.out.println("this is float value " + f);
        String name = sc.next();
        System.out.println(name);
        String name3 = sc.nextLine();
        System.out.println("full name "+ name3);

        //Char ch = sc.next().charAt(0);
    }
}
