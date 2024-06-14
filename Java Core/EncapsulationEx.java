
class Human
{
    // private variables are accessed only by the class itself i.e: encapsulating from others
    private int age;
    private String name;

    // get method (getter) is created to give access indirectly to value of the age by method
    public int getAge() {
        return age;
    }

    // set method (setter) is created to give right to change var indirectly by method
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // "this" is used as both var has same name as "name"
        this.name = name;
        // this represents the current object
    }
}

public class EncapsulationEx
{
    public static void main(String[] args)
    {
        Human human = new Human();
        human.setAge(20);
        human.setName("Nikesh");

        System.out.println(human.getName() + " : " + human.getAge());
    }
}
