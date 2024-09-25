// class Pen {
//     String color;
//     String type;

//     public void write() {
//         System.out.println("writing");
//     }

//     // Corrected method name
//     public void printColor() {
//         System.out.println(this.color);
//     }
// }

// public class Loops {
//     public static void main(String[] args) { // corrected 'arg' to 'args'
//         Pen pen1 = new Pen();
//         pen1.color = "blue";
//         pen1.type = "ball";
        
//         Pen pen2 = new Pen();
//         pen2.color = "black";
//         pen2.type = "gel";

//         // Corrected method call
//         pen1.printColor();
//         pen2.printColor();
//     }
// }
// // Pen() => is a constructor jo apne aap call hota ha ha 
// // jaise ki Pen(){ system.out.println("eheh");}

// // Pollymorphism
// // compiler time
class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + age);
    }


    
// getters & setters

//getters
public String getPassword(){
    return this.name;
}
//setter
public void setPassword(String pass){
    this.name = pass;
}

}

/**
 * Loops
 */
public class Loops {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 23;
        s1.printInfo(s1.name);
    }
     
    
}

// Inheritance 
class Shape{
    String color;
}
class triangle extends Shape{
    
}

