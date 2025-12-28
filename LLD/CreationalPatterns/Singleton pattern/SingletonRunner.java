public class SingletonRunner{
    public static void main(String[] args){
        SingletonClass a = SingletonClass.getInstance() ; 
        a.increment();
        System.out.println("Value thrown by the first object after increment (value should be 1): " + a.getCounter());

        SingletonClass b = SingletonClass.getInstance() ; 
        b.increment();
        System.out.println("Value thrown by the second object after increment (value should be 2): " + a.getCounter());
    }
}