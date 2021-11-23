public class Factory {
    public static void main(String[] args){
        Os os = new OsFactory().getOs("windows");
        System.out.println(os);
        Os os1 = new OsFactory().getOs("ios");
        System.out.println(os1);
        Os os2 = new OsFactory().getOs("ubuntu");
        System.out.println(os2);
        Os os3 = new OsFactory().getOs("none");
        System.out.println(os3);
    }
}
