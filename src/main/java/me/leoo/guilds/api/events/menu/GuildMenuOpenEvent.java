package me.leoo.guilds.api.events.menu;

import lombok.Getter;
import lombok.Setter;
import me.leoo.guilds.api.objects.guild.GuildView;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;


@Getter
@Setter
public class GuildMenuOpenEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Player player;

    public GuildMenuOpenEvent(Player player) {
        this.player = player;
    }

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
