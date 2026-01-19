import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.api.interactions.commands.build.SubcommandData;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;
import org.jetbrains.annotations.NotNull;

public class SlashCommands extends ListenerAdapter {

    public void onReady(@NotNull ReadyEvent event) {
        CommandListUpdateAction commands = event.getJDA().getGuildById("775408272269639681").updateCommands();
        commands.addCommands(new CommandData("ping", "PING PONG !"));
        commands.addCommands(new CommandData("info","zeigt die info eines users")
                .addOptions(new OptionData(OptionType.USER,"user", "zeigt die info eines users").setRequired(true)));
        commands.addCommands(new CommandData("crewmatesay", "Let a CrewMate say something(inspired by the HGLabor dc bot lol haha")
                .addOptions(new OptionData(OptionType.STRING,"text","ein text halt").setRequired(true)));
        commands.addCommands(new CommandData("ban","Ban einen Rabauken welcher schabernack anstiftet.").addOptions(new OptionData(OptionType.USER,"user","einen User").setRequired(true))
                .addOptions(new OptionData(OptionType.STRING,"grund","der Grund für den ban").setRequired(true)));
        commands.addCommands(new CommandData("kick","kick einen Rabauken welcher schabernack anstiftet.").addOptions(new OptionData(OptionType.USER,"user","einen User").setRequired(true))
                .addOptions(new OptionData(OptionType.STRING,"grund","der Grund für den kick").setRequired(true)));
        commands.addCommands(new CommandData("calculate","wer braucht schon nen richtigen Taschenrechner"));



        commands.queue();
    }

}
