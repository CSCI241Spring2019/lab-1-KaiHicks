package lab1;

public class Hello{
    public static void main(String[] args){
        String s = "World";

        if(args.length >= 1) {
            s = args[0];
            for(int i = 1; i < args.length; i++) {
                s += " " + args[i];
            }
        }

        System.out.println("Hello " + s + "!");
    }
}
