public class GarbejCollector {

        public static void main(String[] args) throws InterruptedException
        {
            GarbejCollector t1 = new GarbejCollector();
            GarbejCollector t2 = new GarbejCollector();
            // Nullifying the reference variable
            t1 = null;
            // requesting JVM for running Garbage Collector
            System.gc();
            // Nullifying the reference variable
            t2 = null;
            // requesting JVM for running Garbage Collector
            Runtime.getRuntime().gc();
        }

        @Override
        // finalize method is called on object once
        // before garbage collecting it
        protected void finalize() throws Throwable
        {
            System.out.println("Garbage collector called");
            System.out.println("Object garbage collected : " + this);
        }

}
