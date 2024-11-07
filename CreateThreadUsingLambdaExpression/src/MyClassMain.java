public class MyClassMain {
    public static void main(String[] args) {

        /*

        MyClass myClass = new MyClass();
        Thread thread = new Thread(myClass);
        thread.run();

        aab mujhe myclass likhne ki jaruratr nahi hai // chahu to main use delete bhi kar sakta hu
        mujhe lambda aat hai to main lambda expression use karunga

         */
        // we use lamda this case
        Runnable runnable = () ->{
            for (int i=1;i<=10;i++){
                System.out.println("hello" + i);
            }
        };
        Thread childThread = new Thread(runnable);
        childThread.run();


    }
}
