import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class first{
    public static void main(String[] args){
        System.out.println("Hello, World!");
        // String name = "Aman";
        // int age = 24;
        // String neg = "Ankit";
        //  System.out.println(name+ " " + age + " " + neg);

        // Primitive Type
            // byte - 1 [-128 to 127]
            // short - 2
            // int - 4 1, 2 3 
            // float - 4
            // long - 8
           // double = 8 
            //char - 2 a,b,c
            // boolea - 1 //true /false

            byte age = 39;
            int phone = 123456789;
            long phone2 = 1234567890;
            float pi = 3.14F;
            char letter = 'A';
            boolean isAdult = false;



            // NON - primitive type
               String name = "Aman Bhatti";
               String hell = new String("haej");
               System.out.println(name.length());


            // String method
            // concatenate
            // String name3 = "akku";
            // String sum = name + name3;
            // System.out.println(sum);

            System.out.println(name.charAt(2));
            System.out.println(name.length());
            String up_name = name.replace("Aman", "Vijay");
            System.out.println(up_name);

            // Sub string
            System.out.println(name.substring(0,4));

            // STRING are Immputable

            //ARRAY
            // int[] marks = new int[3];
            // marks[0] = 97;
            // marks[1] = 57;
            // marks[2] = 37;

            // System.out.println(marks.length);
            // Arrays.sort(marks);
            // System.out.println(marks[0]);

            int[] marks = {97,89,77};
            System.out.println(marks);

            // 2 - Dimmensionl
            int[][] finalMarks = {{97,98,95},{98,56,46}};
            System.out.println(finalMarks[0][1]);

            //Casting => convert the one type to another type
            double price = 100.00;
            double finalPrice = price + 18;
            System.out.println(finalPrice);

            // int p = 100;
            // int fp = p + 12.9;  // Error because of casting

            int p = 100;
            int fp = p + (int)12.9;
            System.out.println(fp);

            // Constants
            int age1 = 30;
            age1 = 31;
            // final float pi2 = 23.3F;
            // pi2 = 12.0f;

            
            // Opperators
            // Arthmetic Operator
            int a = 1;
            int b = 3;
            int sum = a + b;
            int diff = b - a;
            int mul = a * b;
            int div = b/a;
            int mod = a % b;

            System.out.println(sum + " " + diff + " " + mul + " " + div +" "+ mod);

            // Assignment Opperators
            // a++, a--, --a, ++a,

            // Logical Operators
            // &&, ||, boolean, 

            // Comparison Operator
            // ==, !=, >=, <=, <, >,

            // Maths
            System.out.println(Math.min(3,4));

            System.out.println((int)Math.random()); // always geting 0
            System.out.println((int)(Math.random())*100); // not get zero



            // input
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("Input your ager");
            int age4 = sc.nextInt();
            System.out.println(age4);

    }
}