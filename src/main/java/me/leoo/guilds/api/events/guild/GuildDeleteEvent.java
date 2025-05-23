package me.leoo.guilds.api.events.guild;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.leoo.guilds.api.objects.guild.GuildView;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
@RequiredArgsConstructor
public class GuildDeleteEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final GuildView guild;

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
