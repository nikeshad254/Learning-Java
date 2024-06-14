class Mobile{
    String brand;
    int price;
    static String name;

    // runs before constructor, as runs when class loads ==> class loads then only object is instanciated
    // runs only once in lifetime, thus initialized static variable
    static{
        name= "Phone";
        System.out.println("in the static block");
    }

    // runs every time the object is made
    public Mobile(){
        System.out.println("in the constructor");
    }

    public void show(){
        System.out.println(brand+ " : "+ price+ " : "+ name);
    }

    // we cannot use non static varable inside static variable thus we need object as an argument
    public static void show1(Mobile m){
        System.out.println("From show1 static method");
        System.out.println(m.brand+ " : "+ m.price+ " : "+ name);
    }
}

public class Statics {
    public static void main(String[] args) throws ClassNotFoundException {

        // Below we have created object so all works fine
        // But problem is that if we dont create the object it wont load the class even once.
        // for solution we have special class called Class
        Class.forName("Mobile");
        // above code only loads the class Mobile, it throws exception too.

        Mobile m1 = new Mobile();
        m1.brand="Samsung";
        m1.price=100;
        Mobile.name = "Some Name";


        Mobile m2 = new Mobile();
        m2.brand="Apple";
        m2.price=200;
        Mobile.name = "Smart Phone";    // this changes everywhere being the static varibale

        Mobile m3 = new Mobile();
        m3.brand="Apple";
        m3.price=200;

        m1.show();
        m2.show();
        m3.show();

        Mobile.show1(m1);

    }
}
