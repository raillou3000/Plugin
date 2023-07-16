package fr.raillou.plugin;

import fr.raillou.plugin.command.CommandMeow;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Location SPAWN_LOCATION = null;

    @Override
    public void onEnable() {
        getCommand("meow").setExecutor(new CommandMeow());
    }

    @Override
    public void onDisable() {

    }
}
