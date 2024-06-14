class Human1{
    String name;
    int age;

    // parameter less constructor
    // constructor dont have return type and is called at time of obj instanciated
    public Human1(){
        this.name = "Person Name";
        this.age = 20;
    }

    // parameterized constructor
    public Human1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println(name+ " : " + age);
    }

}
public class ConstructorEx {
    public static void main(String[] args) {
        Human1 h1 = new Human1();

        Human1 h2 = new Human1("Nikesh", 21);

        h1.print();
        h2.print();
    }
}
