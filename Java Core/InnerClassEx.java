public class InnerClassEx {
    public class InnerClass1{
        public void innerMethod(){
            System.out.println("Inner class 1 method");
        }
    }

    static class InnerClass2{
        public void  innerMethod(){
            System.out.println("Inner class 2 method");
        }
    }
}

class Program {
    public static void main(String[] args) {
        InnerClassEx outerObj = new InnerClassEx();

        // to make the object of inner class we use the outerclass obj
        InnerClassEx.InnerClass1 innerClass1 = outerObj.new InnerClass1();
        innerClass1.innerMethod();

        // unless inner class is static
        InnerClassEx.InnerClass2 innerClass2 = new InnerClassEx.InnerClass2();
        innerClass2.innerMethod();
    }
}
