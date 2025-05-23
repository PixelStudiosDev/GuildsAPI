package me.leoo.guilds.api.events.guild;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.leoo.guilds.api.objects.guild.GuildView;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
@RequiredArgsConstructor
public class GuildCreateEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final GuildView guild;
    private final Player creator;

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
