package me.leoo.guilds.api.events.guild;

import lombok.Getter;
import lombok.Setter;
import me.leoo.guilds.api.objects.guild.GuildView;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
@Setter
public class GuildRenameEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private final GuildView guild;
    private final String oldName;
    private String newName;

    private boolean cancelled;

    public GuildRenameEvent(GuildView guild, String oldName, String newName) {
        this.guild = guild;
        this.oldName = oldName;
        this.newName = newName;
    }

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
