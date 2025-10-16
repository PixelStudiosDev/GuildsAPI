package me.leoo.guilds.api.objects;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.leoo.guilds.api.objects.guild.GuildProvider;
import me.leoo.guilds.api.objects.level.LevelProvider;
import me.leoo.guilds.api.objects.player.PlayerProvider;
import me.leoo.guilds.api.objects.utils.UtilsProvider;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

@Getter
@RequiredArgsConstructor
public final class GuildAPI {

    private static GuildAPI instance;

    private final GuildProvider guildProvider;
    private final LevelProvider levelProvider;
    private final PlayerProvider playerProvider;
    private final UtilsProvider utilsProvider;

    public static void register(GuildProvider guildImpl, LevelProvider levelImpl, PlayerProvider playerImpl, UtilsProvider utilsImpl) {
        if (instance != null) {
            Bukkit.getLogger().warning("GuildAPI is already registered!");
            return;
        }

        instance = new GuildAPI(guildImpl, levelImpl, playerImpl, utilsImpl);

        Bukkit.getLogger().info("GuildAPI has been registered successfully.");
    }

    public void debug(String message) {
        utilsProvider.debug(message);
    }

    public static GuildAPI get() {
        if (instance == null) {
            throw new IllegalStateException("GuildAPI has not been initialized yet!");
        }

        return instance;
    }

}