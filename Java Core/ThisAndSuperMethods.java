class Parent1{
    public Parent1(){
        super();
        System.out.println("Parent no param");
    }

    public Parent1(int n){
        this(); // it will class the constuctor of Parent itself.
        System.out.println("Parent with int ");
    }
}

class Child1 extends Parent1{
    public Child1(){
        super();   // even if we dont mention it it is always on top and here
        // this class the constructor of the parent
        System.out.println("Child default");
    }

    public Child1(int n){
        super(n); // doing this will call the constructor with the parameter
        System.out.println("Child with Int");
    }
}

public class ThisAndSuperMethods {
    public static void main(String[] args) {
        Child1 c1 = new Child1(20);
    }
}
