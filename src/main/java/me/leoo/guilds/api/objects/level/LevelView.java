package me.leoo.guilds.api.objects.level;

import me.leoo.guilds.api.enums.LevelRewardEnum;

import java.util.List;
import java.util.UUID;

public interface LevelView {

    UUID getUuid();

    int getLevel();
    int getXp();
    int getNextCost();

    String getProgressBar();

    void setLevel(int level);
    void addLevel(int level);
    void removeLevel(int level);

    void setXp(int xp);
    void addXp(int xp);
    void removeXp(int xp);

    int getRequiredXp();
    String getPercentage();

    String getRewardValue(LevelRewardEnum rewardType);
    List<Integer> getUnlockedLevels();
    List<String> getUnlockedRewards(LevelRewardEnum type);
    List<Integer> getNumericalRewards(LevelRewardEnum type);
}
