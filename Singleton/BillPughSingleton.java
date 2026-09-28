package Singleton;
public class BillPughSingleton {

    private BillPughSingleton(){
         //private constructor
    }

    public static class Holder {
        private Static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance(){
        return  Holder.INSTANCE;
    }
    
}
