package fr.raillou.plugin.command;

import fr.raillou.plugin.Error;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandMeow implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (label.equals("meow")) {
            if (args.length == 0) {
                if (sender instanceof  Player) {
                    final Player player = (Player) sender;
                    final World world = player.getWorld();

                    world.playSound(player.getLocation(), Sound.ENTITY_CAT_AMBIENT, 1.0F, 1.0F);
                }
            } else {
                Error.noEnoughtPermission((Player) sender);
            }
            return true;
        }
        return false;
    }
}
