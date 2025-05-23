package me.leoo.guilds.api.events.rank;

import lombok.Getter;
import lombok.Setter;
import me.leoo.guilds.api.objects.guild.GuildView;
import me.leoo.guilds.api.objects.player.PlayerView;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
@Setter
public class GuildRankCreateEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private final GuildView guild;
    private final PlayerView player;

    private String name;

    private boolean cancelled;

    public GuildRankCreateEvent(GuildView guild, PlayerView player, String name) {
        this.guild = guild;
        this.player = player;

        this.name = name;
    }

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
