package javaassignment;

public class Singleton {

        private static Singleton instance;

        private Singleton() {
            // nothing to do this time
        }

        /**
         * The Static initializer constructs the instance at class
         * loading time; this is to simulate a more involved
         * construction process (it were really simple, you'd just
         * use an initializer)
         */
        static {
            instance = new Singleton();
        }

        /** Static 'instance' method */
        public static Singleton getInstance() {
            return instance;
        }

        // other methods protected by singleton-ness would be here...
        /** A simple demo method */
        public String demoMethod() {
            return "demo";
        }
}

