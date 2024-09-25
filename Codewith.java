/*class Employee{
    int Salary;
    String name;

    public int getSalary() {
        return Salary;
    }
    public String getName(){
        return name;
    }
    public String setName(String name){
        this.name = name;
        return name;
    }

};*/

class Square{
    int r;
    private String name;

    public double area(){
        double res = this.r * this.r;
        return res;
    }
    public int prameter(){
        return 4 * this.r;
    }

    // setter
    public void setName(String name){
        this.name = name;
    }

    // getter
    public String getName(){
        return this.name;
    }
}

public class Codewith {
    public static void main(String[] args){
       /*
        Problem => 1
        Employee es = new Employee();
        es.Salary = 23000;
        es.name = "Aman";
        System.out.println(es.getSalary());
        System.out.println(es.getName());
        System.out.println(es.setName("Monu"));
 */ 

        // Problem => 2
        Square st = new Square();
        st.r = 10;
        //st.name = "aman";
        System.out.println(st.area());
        System.out.println(st.prameter());
        st.setName("AA");
        System.out.println(st.getName());

    }
}
