public class OsFactory {
    public Os getOs(String name) {
        Os os = null;
        if (name.equals("windows")){
            os=new Windows();
        }
        else if (name.equals("ios")){
            os=new Ios();
        }
        else if(name.equals("ubuntu")){
            os=new Ubuntu();
        }
        else {
            return os;
        }
        return os;
        
    }

    
}
