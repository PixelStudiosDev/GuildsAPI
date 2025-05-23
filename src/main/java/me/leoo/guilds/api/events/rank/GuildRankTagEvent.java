package me.leoo.guilds.api.events.rank;

import lombok.Getter;
import lombok.Setter;
import me.leoo.guilds.api.objects.guild.GuildView;
import me.leoo.guilds.api.objects.rank.RankView;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
@Setter
public class GuildRankTagEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private final GuildView guild;
    private final RankView rank;

    private final String oldTag;
    private String newTag;

    private boolean cancelled;

    public GuildRankTagEvent(GuildView guild, RankView rank, String oldTag, String newTag) {
        this.guild = guild;
        this.rank = rank;
        this.oldTag = oldTag;
        this.newTag = newTag;
    }

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
