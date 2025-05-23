package me.leoo.guilds.api.events.level;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import me.leoo.guilds.api.enums.LevelUpEnum;
import me.leoo.guilds.api.objects.guild.GuildView;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
@Setter
@RequiredArgsConstructor
public class GuildLevelChangeEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private final GuildView guild;

    private final LevelUpEnum type;

    private final int oldLevel;
    private final int newLevel;

    private boolean cancelled;

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
