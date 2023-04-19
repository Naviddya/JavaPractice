package ObjectExample;

public class GarbageCollector {

    public static void main(String[] args) {


        GarbageCollector ex = new GarbageCollector();

        System.out.println(ex.hashCode());

        ex=null;
        System.gc();
        System.out.println("end");

    }

    @Override
    protected void finalize() {

    }


}
