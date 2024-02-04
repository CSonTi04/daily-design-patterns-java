package entrypoint;

import context.Steak;

public class Program {
    public static void main(String[] args) {
        //Let's cook a steak
        var steak = new Steak("T-Bone");

        //Apply temperature changes
        steak.addTemp(120);
        steak.addTemp(15);
        steak.addTemp(15);
        steak.removeTemp(10);//Yes, I know this is not how you cook a steak, but it's just an example ;)
        steak.removeTemp(15);
        steak.addTemp(20);
        steak.addTemp(20);
        steak.addTemp(20);

    }
}
