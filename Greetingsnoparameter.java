interface Greeting{
    void sayhello();
}

class Main {
    public static void main(String[] args) {
        Greeting message = () -> System.out.println("Hello Stalker");
       message.sayhello();
    }
}
