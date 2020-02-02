

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            new BeatBox().startUp("Anonymous");

        } else {
            new BeatBox().startUp(args[0]);
        }

    }

}
