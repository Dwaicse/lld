public class SingletonDesignPattern {
    private static volatile DoubleCheckedSingleton instance;
    private SingletonDesignPattern(){};

    public static DoubleCheckedSingleton getInstance(){
     if(instance == null){
        synchronized (DoubleCheckedSingleton.class) {
            if(instance == null){
                instance = new DoubleCheckedSingleton();
            }
        }
      }
      return instance;

    }

}
