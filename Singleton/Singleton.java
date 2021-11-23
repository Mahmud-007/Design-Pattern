public class Singleton {

    public String value;
    private Singleton(String value) {
        this.value = value;
    }
    private static Singleton instance;
    
    public static Singleton getInstance(String value){
        if(instance==null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }

}
