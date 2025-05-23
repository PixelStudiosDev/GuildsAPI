package me.leoo.guilds.api.objects.tag;

import me.leoo.guilds.api.enums.TagColorEnum;
import me.leoo.guilds.api.objects.guild.GuildView;
import me.leoo.guilds.api.objects.player.PlayerView;

public interface TagView {

    TagColorEnum getType();
    String getDisplayName();

    String getColoredName();
    String getFormatted(GuildView guild);
    String getName();

    boolean respectConditions(PlayerView guildPlayer, GuildView guild);
}
