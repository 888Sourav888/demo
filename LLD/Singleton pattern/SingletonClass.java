public class SingletonClass {
    private static SingletonClass instance ; 
    private static int counter  ; 
    SingletonClass(){
        instance = null ; 
        counter =  0 ; 
    }
    public static SingletonClass getInstance(){
        if(instance == null){
            synchronized(SingletonClass.class){
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance ; 
    }
    public void increment(){
        counter++ ; 
    }
    public int getCounter(){
        return counter ; 
    }
}
