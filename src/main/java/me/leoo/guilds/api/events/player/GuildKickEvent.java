package me.leoo.guilds.api.events.player;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import me.leoo.guilds.api.objects.guild.GuildView;
import me.leoo.guilds.api.objects.player.PlayerView;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
@Setter
@RequiredArgsConstructor
public class GuildKickEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private final GuildView guild;

    private final PlayerView author;
    private final PlayerView kicked;

    private String reason;

    private boolean cancelled;

    public GuildKickEvent(GuildView guild, PlayerView author, PlayerView kicked, String reason) {
        this.guild = guild;
        this.author = author;
        this.kicked = kicked;
        this.reason = reason;
    }

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
