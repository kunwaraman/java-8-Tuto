@FunctionalInterface
public interface MyInterface {
    // we look the example of functional interface

//    // only one abstract method
    public void sayHello();

    // and any no of default and static method
    // kitne bhi ho jaye
    default void sayBye(){

    }
    // because many static we can kept on inside functional interface
    public static void sayok(){

    }


}
