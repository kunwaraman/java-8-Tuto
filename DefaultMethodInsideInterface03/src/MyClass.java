//interface Parent{
//    default void sayHello(){
//        System.out.println("hello");
//    }
//}
//class Child implements Parent {
//
//}
//
//public class MyClass {
//    public static void main(String[] args) {
//        Child c = new Child();
//        c.sayHello();
//    }
//}
/*
here ambiguity exmaple
 */
interface A {
    default void sayHello(){
        System.out.println("A says hello");
    }
}
interface B{
    default void sayHello(){
        System.out.println("B says hello");
    }
}
public class MyClass implements A,B{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.sayHello(); // this case ambiguty error
        // say hello par kon sa say hello same parametr hai hm to differ nahi kar pa rhe hai

        // solution is overid kar lo kishi ek ko b.super sayhello
    }

    @Override
    public void sayHello() {
        A.super.sayHello();
    }
}
