package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import utils.ErrorMessage;

import java.util.Collection;

public class Ban extends ListenerAdapter {


    @Override
    public void onSlashCommand(SlashCommandEvent event) {



        EmbedBuilder embedBuilder = new EmbedBuilder();
        ErrorMessage errorMessage = new ErrorMessage();

        if (event.getName().equals("ban")) {

            Member target = event.getOption("user").getAsMember();
            String reason = event.getOption("grund").getAsString();
            if (event.getMember().hasPermission(Permission.BAN_MEMBERS)) {


                event.getGuild().ban(target, 3, reason).queue();
                embedBuilder.setTitle("INFO");
                embedBuilder.setDescription("Der Account " + target.getUser().getAsTag() + " wurde Gebannt Grund: " + reason);


                event.replyEmbeds(embedBuilder.build()).queue();

            }else{
                errorMessage.setMessage("Du hast nicht genug rechte dafür!");
                errorMessage.ErrorMessage();
                event.replyEmbeds(errorMessage.errorembed.build()).queue();

            }
        }
    }
}

