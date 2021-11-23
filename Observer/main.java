class main{
    public static void Main (String[] args){

        Channel Codexpo = new Channel("Codexpo");

        Subscriber mahmud = new Subscriber("mahmud");
        Subscriber emon = new Subscriber("emon");
        Subscriber imtiaz = new Subscriber("imtiaz");
        Subscriber piash = new Subscriber("piash");

        mahmud.subscribe(Codexpo);
        emon.subscribe(Codexpo);
        imtiaz.subscribe(Codexpo);
        piash.subscribe(Codexpo);

        Codexpo.printSubscribers();

        Codexpo.notification("welcome to the channel");

        emon.unsubscribe(Codexpo);

        Codexpo.printSubscribers();

        Codexpo.notification("This is the first content");

    }
}