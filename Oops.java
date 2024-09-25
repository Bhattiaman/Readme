class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing");
    }
    public void printC(){
        System.out.println(this.color);
    }

}

w
    public static void main(String[] arg){

Pen p1 = new Pen();
p1.color = "blue";
p1.type = "gel";
p1.write();
Pen p2 = new Pen();
p2.color = "Green";
p2.type = "ballpoint";
p1.printC();
p2.printC();
}
}
