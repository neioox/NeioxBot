import commands.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class Bot extends ListenerAdapter {



public static void main(String[] args)throws Exception{

    JDA jda = JDABuilder.createDefault("token").build();


    jda.addEventListener(new Ban());
    jda.addEventListener(new Ping());
    jda.addEventListener(new Info());
    jda.addEventListener(new Kick());
    jda.addEventListener(new Calculator());
   /** jda.addEventListener(new CrewMateSay());**/
    jda.addEventListener(new SlashCommands());
    jda.addEventListener(new ClickButtonEvent());
    System.out.println("Der bot ist gestartet");




}


    }


