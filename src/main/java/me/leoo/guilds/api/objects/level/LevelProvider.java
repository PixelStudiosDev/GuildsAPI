package me.leoo.guilds.api.objects.level;

import org.bukkit.entity.Player;

public interface LevelProvider {

    void addXp(Player player, int xp);

    void addLevel(Player player, int level);

    void removeXp(Player player, int xp);

    void removeLevel(Player player, int level);

    void setXp(Player player, int xp);

    void setLevel(Player player, int level);

    void forceLevelAndXp(Player player, int level, int xp);
}
