class Main {
    
    static class singleobj {

        static singleobj obj = new singleobj(); // Create Object Locally to Override

        private singleobj(){} // Don't instanciate obj from another class

        public static singleobj getInstance() {
            return obj;
        }

    }

    static class threadsafe extends Thread {
        public void run() {
            System.out.println("Object Hashcode: " + singleobj.getInstance().hashCode());
        }
    }

    static class Singleton {
        public static void main(String[] args) {

            threadsafe ts1 = new threadsafe();
            Thread t1 = new Thread(ts1);
            t1.start();

            threadsafe ts2 = new threadsafe();
            Thread t2 = new Thread(ts2);
            t2.start();
            
        }
    }
}
