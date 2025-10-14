package me.leoo.guilds.api.objects;

import lombok.Getter;
import me.leoo.guilds.api.objects.guild.GuildProvider;
import me.leoo.guilds.api.objects.level.LevelProvider;
import me.leoo.guilds.api.objects.player.PlayerProvider;
import me.leoo.guilds.api.objects.utils.UtilsProvider;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class GuildAPI extends JavaPlugin {

    private static Plugin plugin;

    @Getter
    private static GuildProvider guildProvider;

    @Getter
    private static LevelProvider levelProvider;

    @Getter
    private static PlayerProvider playerProvider;

    @Getter
    private static UtilsProvider utilsProvider;

    @Override
    public void onEnable() {
        plugin = this;
    }

    @Override
    public void onDisable() {
        disable();
    }

    public static void register(GuildProvider guildImpl, LevelProvider levelImpl, PlayerProvider playerImpl, UtilsProvider utilsImpl) {
        guildProvider = guildImpl;
        levelProvider = levelImpl;
        playerProvider = playerImpl;
        utilsProvider = utilsImpl;
    }

    public static void debug(String message){
        utilsProvider.debug(message);
    }

    public static void disable() {
        if (plugin == null) return;

        Bukkit.getScheduler().cancelTasks(plugin);
    }
}