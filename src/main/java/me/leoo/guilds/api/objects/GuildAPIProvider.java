package me.leoo.guilds.api.objects;

import me.leoo.guilds.api.objects.guild.GuildProvider;
import me.leoo.guilds.api.objects.level.LevelProvider;
import me.leoo.guilds.api.objects.player.PlayerProvider;
import me.leoo.guilds.api.objects.utils.UtilsProvider;

// Questa interfaccia definisce i metodi che il plugin Guilds deve implementare
public interface GuildAPIProvider {
    
    // Non più statici
    GuildProvider getGuildProvider();
    LevelProvider getLevelProvider();
    PlayerProvider getPlayerProvider();
    UtilsProvider getUtilsProvider();
}