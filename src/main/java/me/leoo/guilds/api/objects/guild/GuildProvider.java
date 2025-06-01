package me.leoo.guilds.api.objects.guild;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

/**
 * GuildProvider interface for managing guilds.
 * Provides methods to retrieve, create, and manipulate guilds.
 */
public interface GuildProvider {

    /**
     * Get a guild by its UUID.
     * @param uuid of the guild
     * @return GuildView if found, null otherwise
     */
    GuildView getByUuid(UUID uuid);

    /**
     * Get a guild by its name.
     * @param name of the guild
     * @return GuildView if found, null otherwise
     */
    GuildView getByName(String name);
    GuildView getByPlayer(Player player);
    GuildView getByPlayer(UUID player);

    List<GuildView> getGuilds();
    List<GuildView> getShownGuilds();

    void addXp(Player player, int xp);
    void addLevel(Player player, int level);

    void removeXp(Player player, int xp);
    void removeLevel(Player player, int level);

    GuildView createGuild(String guildName, UUID leader);
    void deleteGuild(GuildView guild);

    boolean hasGuild(UUID uuid);

    // Quest
    void addQuestProgress(Player guildUuid, int amount);
}
