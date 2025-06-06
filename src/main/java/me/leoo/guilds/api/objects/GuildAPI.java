package me.leoo.guilds.api.objects;

import lombok.Getter;
import me.leoo.guilds.api.objects.guild.GuildProvider;
import me.leoo.guilds.api.objects.level.LevelProvider;
import me.leoo.guilds.api.objects.player.PlayerProvider;
import me.leoo.guilds.api.objects.utils.UtilsProvider;

public class GuildAPI {

    @Getter
    private static GuildProvider guildProvider;

    @Getter
    private static LevelProvider levelProvider;

    @Getter
    private static PlayerProvider playerProvider;

    @Getter
    private static UtilsProvider utilsProvider;

    public static void register(GuildProvider guildImpl, LevelProvider levelImpl, PlayerProvider playerImpl, UtilsProvider utilsImpl) {
        guildProvider = guildImpl;
        levelProvider = levelImpl;
        playerProvider = playerImpl;
        utilsProvider = utilsImpl;
    }

    public static void debug(String message){
        utilsProvider.debug(message);
    }
}