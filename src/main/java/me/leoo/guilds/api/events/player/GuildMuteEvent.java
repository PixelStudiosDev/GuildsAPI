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
public class GuildMuteEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private final GuildView guild;

    private final PlayerView player;
    private long duration;

    private boolean cancelled;

    public GuildMuteEvent(GuildView guild, PlayerView player, long duration) {
        this.guild = guild;
        this.player = player;
        this.duration = duration;
    }

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
