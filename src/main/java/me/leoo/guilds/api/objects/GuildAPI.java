package me.leoo.guilds.api.objects;

import lombok.Getter;
import me.leoo.guilds.api.objects.guild.GuildProvider;
import me.leoo.guilds.api.objects.level.LevelProvider;
import me.leoo.guilds.api.objects.player.PlayerProvider;
import me.leoo.guilds.api.objects.utils.UtilsProvider;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

@Getter
public class GuildAPI {

    private static GuildAPI instance;

    private Plugin plugin;

    private GuildProvider guildProvider;
    private LevelProvider levelProvider;
    private PlayerProvider playerProvider;
    private UtilsProvider utilsProvider;


    public void register(GuildProvider guildImpl, LevelProvider levelImpl, PlayerProvider playerImpl, UtilsProvider utilsImpl) {
        guildProvider = guildImpl;
        levelProvider = levelImpl;
        playerProvider = playerImpl;
        utilsProvider = utilsImpl;
    }

    public void debug(String message) {
        utilsProvider.debug(message);
    }

    public void disable() {
        if (plugin == null) return;

        Bukkit.getScheduler().cancelTasks(plugin);
    }

    public static GuildAPI get() {
        if (instance == null) {
            instance = new GuildAPI();
        }
        return instance;
    }
}