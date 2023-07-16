package fr.raillou.plugin;

import fr.raillou.plugin.command.CommandMeow;
import fr.raillou.plugin.command.CommandSetSpawn;
import fr.raillou.plugin.command.CommandSpawn;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Location SPAWN_LOCATION = null;

    @Override
    public void onEnable() {
        getCommand("meow").setExecutor(new CommandMeow());
        getCommand("setspawn").setExecutor(new CommandSetSpawn());
        getCommand("spawn").setExecutor(new CommandSpawn());
    }

    @Override
    public void onDisable() {

    }
}