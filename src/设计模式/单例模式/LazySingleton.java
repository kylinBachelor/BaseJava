package 设计模式.单例模式;

public class LazySingleton {
    private static volatile LazySingleton lazySingleton;
    private LazySingleton(){
    }
    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            synchronized(LazySingleton.class){
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }
}
