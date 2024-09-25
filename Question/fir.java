package Question;

import java.util.Scanner;

public class fir {
    public static void main(String[] arg){
        // int n = 10;
        // int sum = 0;
        // for(int i = 0; i <= n;i++){
        //     System.out.println(i);
        //     sum = sum + i;
        // }
        // System.out.println(sum);


        //print prime number
        // int n = 13;
        // if(n <= 1){
        //     System.out.println("num");
        // }
        // if(n%2 == 1){
        //     System.out.println("the number is prime");
        // }else{
        //     System.out.println("number is not prime");
        // }

        // 1 2 3 4
        // 1 2 3 4 
        // 1 2 3 4
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1;j <= n; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // 1 2 3
        // 4 5 6
        // 7 8 9
        // int a = 1;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1;j<=n;j++){
        //         System.out.print(a);
        //         a++;
        //     }
            
        //     System.out.println();
        // }

        
        // *
        // * *
        // * * *
        // * * * *

        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        int a = 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        for(int i = 1; i <= n;i++){
            for(int j = 0; j < i; j++){System.out.print(" ");}
            for(int k = 1;k<=n-i;k++){
                System.out.print(a);
            }
            a++;
            System.out.println();
        }
        
    }
}
