interface myInterface{
    int show(int num1, int num2);
}

public class LamdaInFunctionalInterface {
    public static void main(String[] args) {
        myInterface obj = (num1, num2) -> num1 + num2;
        System.out.println(obj.show(5, 10));
    }
}
