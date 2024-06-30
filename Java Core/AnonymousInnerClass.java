abstract class AnonymousInnerClass {
    public abstract void method1();

    public void method2(){
        System.out.println("testing...2...");
    }
}

class Program1 {

    public static void main(String[] args) {

        // gemerally when using abstract class we make a class inherit and define then make object of it
        // but if that class is used only once it is better to use anonymous class
        AnonymousInnerClass anonymousObj = new AnonymousInnerClass() {
            public void method1() {
                System.out.println("mathod1 was implemented");
            }
        };

        anonymousObj.method1();
        anonymousObj.method2();
    }


}
