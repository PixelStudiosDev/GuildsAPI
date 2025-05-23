package me.leoo.guilds.api.objects.player;

import me.leoo.guilds.api.enums.PermissionsEnum;
import me.leoo.guilds.api.objects.finder.FinderView;
import me.leoo.guilds.api.objects.rank.RankView;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.UUID;

public interface PlayerView {
    UUID getUuid();

    String getName();

    String getDisplayName();

    UUID getRankUuid();

    boolean isNotifications();

    boolean isToggle();

    long getMuteTime();

    long getJoin();

    long getLastOnline();

    FinderView getFinder();

    RankView getRankView();

    boolean hasRank(UUID rankUuid);

    String getStatus();

    void sendMessage(String text);

    String getFormattedName();

    void updateName();

    boolean hasPermission(PermissionsEnum permission);

    boolean isMuted();

    boolean isOnline();

    Player getOnlinePlayer();

    OfflinePlayer getOfflinePlayer();
}