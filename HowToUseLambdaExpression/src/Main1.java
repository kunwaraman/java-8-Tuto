public class Main1 {
    public static void main(String[] args) {
//        Employee employee = new SoftwareDev();
//        System.out.println(employee.getName());
        // now lambda ke case main hum sort karneg code ko
        Employee employee =()->"Software Engineer";
        System.out.println(employee.getName());
        // aab ham chahe to software dev class ko delete bhi kar sakte hai
    }

}
