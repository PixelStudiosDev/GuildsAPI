package me.leoo.guilds.api.objects.guild;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

public interface GuildProvider {

    GuildView getByUuid(UUID uuid);
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
}
