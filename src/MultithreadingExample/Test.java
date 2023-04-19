package MultithreadingExample;

import com.sun.org.slf4j.internal.LoggerFactory;




public class Test {

    public static void main(String[] args) {

       // System.out.println("main start "+Thread.currentThread().getName());
        for (int i = 0; i < 8 ; i++) {
            Student st = new Student();
            st.start();
        }
    }
}
