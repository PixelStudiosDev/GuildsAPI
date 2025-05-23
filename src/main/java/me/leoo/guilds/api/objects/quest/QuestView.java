package me.leoo.guilds.api.objects.quest;

import java.util.UUID;

public interface QuestView {

    UUID getGuildUuid();

    int getTierId();
    int getProgress();

    long getNextReset();
    boolean hasCompleted();
    int getRequired();
    int getReward();

    void addProgress(int amount);
    void giveReward();

    TierView getTierView();

    interface TierView {
       int getId();
       int getRequired();
       int getReward();
    }
}