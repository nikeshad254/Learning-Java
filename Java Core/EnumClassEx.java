// enum class can have own methods and fields but cannot be extended or instantiated
enum Laptop{
    MAC(200), HP(150), ASUS;
    private int price;

    Laptop(){
        price = 100;
    }

    // private made as enum constructor is only used inside it
    Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class EnumClassEx {
    public static void main(String[] args) {

        for(Laptop l : Laptop.values()){
            System.out.println(l +" : "+ l.getPrice());
        }
    }
}
