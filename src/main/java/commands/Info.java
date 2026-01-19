package commands;

import net.dv8tion.jda.api.EmbedBuilder;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.time.format.DateTimeFormatter;


public class Info extends ListenerAdapter {




    @Override
    public void onSlashCommand(@NotNull SlashCommandEvent event) {




            System.out.println("Name: " + event.getName()); //Name des SlashCommands
            System.out.println("Subcommand: " + event.getSubcommandName()); // Der Subcommand zum filtern (subcmd1, subcmd2)
            System.out.println("Options: " + event.getOptions()); // Optionen des Subcommands.
            System.out.println("Type: " + event.getType()); // Zur überprüfung das es ein Slashcommand ist (sollte "SLASH_COMMAND" sein)




        if (event.getName().equals("info")) {
            if (event.getOptions().equals("user")) {
                Member target = event.getOption("user").getAsMember();

                EmbedBuilder embed = new EmbedBuilder();
                embed.setTitle("User info von "+ event.getOption("user").getAsMember().getUser().getAsTag());

                embed.addField("Name", target.getUser().getAsTag() ,false);
                embed.addField("ID", target.getUser().getId(),false);
                embed.addField("Account Erstellt am", target.getTimeCreated().format(DateTimeFormatter.ISO_DATE).replace("-"," "), false);
                embed.addField("Server Beigetreten", target.getTimeJoined().format(DateTimeFormatter.ISO_DATE).replace("-"," "), false);
                embed.addField("Rollen "+ String.valueOf(target.getRoles().size()), String.valueOf(target.getRoles()), false);
                embed.setFooter("angefragt von "+ event.getUser().getAsTag());

            event.replyEmbeds(
                embed.build()).queue();
            }

        }

    }

    }

