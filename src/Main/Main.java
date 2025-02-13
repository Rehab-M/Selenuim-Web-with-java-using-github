package Main;

public class Main {
    public static void main(String[] args){
        /*--> program1
        System.out.println("Hello World!");
        //Calling the class Greetings
        Greeting greeting = new Greeting();
        greeting.hello(); // her is the object that created in greeting class and here we callit here
        // Calling the Class Messanger
        Messenger messenger = new Messenger();// call method that in the class messanger
        messenger.sendMessage();*/
        String name = "Rehab";
        int Age = 25;
        System.out.println(PrintName());
        System.out.println(PrintAge());

    }
    public static String PrintName(){
        System.out.println("Hello" );
        return "Rehab";
    }
    public static String PrintAge(){
        System.out.println("Hello,your age is  " );
        return "25";
    }
}
