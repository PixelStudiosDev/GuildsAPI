package me.leoo.guilds.api.objects.guild;

import me.leoo.guilds.api.enums.TagColorEnum;
import me.leoo.guilds.api.objects.level.LevelView;
import me.leoo.guilds.api.objects.player.PlayerView;
import me.leoo.guilds.api.objects.quest.QuestView;
import me.leoo.guilds.api.objects.rank.RankView;
import me.leoo.guilds.api.objects.settings.SettingsView;
import me.leoo.guilds.api.objects.tag.TagView;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface GuildView {
    UUID getUuid();

    String getName();
    String getTag();
    TagColorEnum getTagColor();

    LevelView getLevel();

    SettingsView getSettings();
    QuestView getQuest();

    UUID getLeaderUuid();
    List<PlayerView> getMembersView();
    List<RankView> getRanksView();

    List<UUID> getInvites();
    Map<UUID, Long> getCooldowns();

    // Methods

    // Player
    void addMember(UUID uuid);
    void removeMember(UUID uuid);
    PlayerView getPlayer(UUID uuid);
    PlayerView getPlayer(String name);
    List<PlayerView> getOnlinePlayers();
    List<PlayerView> getOfflinePlayers();
    PlayerView getLeaderPlayer();
    boolean isMember(UUID uuid);

    // Rank
    RankView getRank(String name);
    RankView getRank(UUID uuid);
    RankView getRankByTag(String tag);
    RankView getDefaultRank();
    RankView getMasterRank();
    RankView getPreviousRank(RankView rank);
    RankView getNextRank(RankView rank);

    // Guild
    boolean isFull();
    String getFixedTag();
    TagView getCurrentTag();
    TagView getTagViewFromType(TagColorEnum tagColor);

    int getMaxTagLength();
    int getMaxMembers();

    void broadcast(String message);
    void broadcast(List<String> message);

    // Rank
    void createRank(String name, String displayName);
    void deleteRank(RankView rank);

    void updateDefault(RankView rank);
    void updateMaster(RankView rank);
    void updateLeader(UUID playerUuid);
}