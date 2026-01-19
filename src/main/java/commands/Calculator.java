package commands;

import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.ActionRow;
import net.dv8tion.jda.api.interactions.components.Button;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;




public class Calculator extends ListenerAdapter {
public static String title = "Taschenrechner";

    public void onSlashCommand(SlashCommandEvent event) {
        if(event.getName().equals("calculate")){
          event.getChannel().sendMessage(title).setActionRows(ActionRow.of(


                          Button.primary("7","7"),
                          Button.primary("8","8"),
                          Button.primary("9","9"),
                          Button.primary("+","+")

                  ),
                  ActionRow.of(
                          Button.primary("4","4"),
                          Button.primary("5","5"),
                          Button.primary("6","6"),
                          Button.primary("-","-")
                  ),ActionRow.of(

                                  Button.primary("1","1"),
                                  Button.primary("2","2"),
                                  Button.primary("3","3"),
                                  Button.primary("*","*")


                          ),
                  ActionRow.of(
                          Button.primary("0","0"),
                          Button.primary(".","."),
                          Button.success("=","="),
                          Button.primary("/","/")
                  )
                  )

             .queue();
        }


    }
    private static List<Button> sendButtons(){

        List<Button> buttons = new ArrayList<>();

        buttons.add(Button.primary("7","7"));
        buttons.add(Button.primary("8","8"));
        buttons.add(Button.primary("9","9"));
        buttons.add(Button.secondary("*","*"));

    return buttons;
}
}
