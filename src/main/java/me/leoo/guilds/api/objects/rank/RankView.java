package me.leoo.guilds.api.objects.rank;

import me.leoo.guilds.api.enums.PermissionsEnum;

import java.util.List;
import java.util.UUID;

public interface RankView {

    UUID getUuid();

    String getName();
    String getDisplayName();
    String getTag();

    List<PermissionsEnum> getPermissions();
    int getPriority();
    boolean isDefaultRank();
    boolean isMasterRank();

    boolean hasPermission(PermissionsEnum permission);

    //String getFormattedName(Guild guild, PlayerView player);
}