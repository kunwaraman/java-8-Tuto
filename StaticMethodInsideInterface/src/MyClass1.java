interface A {
    static void sayHello(){
        System.out.println("Hello !");
    }
    default void sayBye(){
        System.out.println("Bye !");
    }
}
public class MyClass1 implements A{
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();
        obj.sayBye(); // ye default tha to direct method name se
        A.sayHello(); // hm name se acces kiye like interface class name se

    }
}
