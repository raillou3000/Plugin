package fr.raillou.plugin.command;

import fr.raillou.plugin.Error;
import fr.raillou.plugin.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;

public class CommandSetSpawn implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("setspawn")) {
            if (args.length == 0) {
                if (sender instanceof Player) {
                    final Player player = (Player)sender;

                    if (player.isOp()) {
                        Main.SPAWN_LOCATION = player.getLocation();
                        player.sendMessage(ChatColor.GREEN + "Vous avez défini le point de spawn !");
                    } else {
                        Error.noEnoughtPermission((Player) sender);
                    }
                } else {
                    Error.executableOnlyByPlayer((Player) sender);
                }
            } else {
                Error.commandNoNeedsArgument((Player) sender);
            }
            return true;
        }

        return false;
    }
}
