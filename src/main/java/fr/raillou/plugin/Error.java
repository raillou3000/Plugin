package fr.raillou.plugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Error {

    public static void noEnoughtPermission(final Player sender) {
        sender.sendMessage(ChatColor.RED + "Vous n'avez pas la permission d'utiliser cette commande");
    }

    public static void executableOnlyByPlayer(final Player sender) {
        sender.sendMessage("Cette commande n'est exécutable que par un joueur");
    }

    public static void commandNoNeedsArgument(final Player sender) {
        sender.sendMessage("Cette commande n'a pas besoin d'arguments");
    }
}
