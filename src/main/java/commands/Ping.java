package commands;

import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Ping extends ListenerAdapter {


    @Override
    public void onSlashCommand(@NotNull SlashCommandEvent event) {
        System.out.println("Name: "+ event.getName()); //Name des SlashCommands
        System.out.println("Subcommand: "+event.getSubcommandName()); // Der Subcommand zum filtern (subcmd1, subcmd2)
        System.out.println("Options: "+ event.getOptions()); // Optionen des Subcommands.
        System.out.println("Type: "+ event.getType()); // Zur überprüfung das es ein Slashcommand ist (sollte "SLASH_COMMAND" sein)

        if (event.getName().equals("ping")) {

        event.reply("Pong!").setEphemeral(true)
                .queue();
        }

    }

}
