package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class reverse {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue:");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element of the queue:");
            int a = sc.nextInt();
            queue.add(a);
        }
        
        System.out.println("\nContents of the queue:");
        for (Integer element : queue) {
            System.out.println(element);
        }

        Stack<Integer> st = new Stack<>();

        for(Integer element : queue){
            st.push(element);
        }
        for(Integer element : queue){
            System.out.print(st.pop());
        }




        sc.close();
    }
}
