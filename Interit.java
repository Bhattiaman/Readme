class Base{
    int x;

    public int getX(int x){
        return x;
    }
};

class Derived extends Base{
    int y;
    public int getY(int y){
        return y;
    }
};

class Derived2 extends Derived{
    public void getD(){
        System.out.println("Multiple Inheritance");
    }
};
public class Interit {
    public static void main(String[] args) {
       Derived2 d = new Derived2();
       System.out.println(d.getX(23));
       System.out.println(d.getY(22));;
    //   System.out.println(d.getD());
        d.getD();
    
    }
}

// Abstraction ->                                                                   
