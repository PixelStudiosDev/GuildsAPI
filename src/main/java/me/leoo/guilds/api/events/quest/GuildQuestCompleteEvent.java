package me.leoo.guilds.api.events.quest;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import me.leoo.guilds.api.objects.guild.GuildView;
import me.leoo.guilds.api.objects.quest.QuestView;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
@Setter
@RequiredArgsConstructor
public class GuildQuestCompleteEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private final GuildView guild;
    private final QuestView quest;

    private final QuestView.TierView completedTier;

    private final boolean latest;

    private boolean cancelled;

    public QuestView.TierView getNewTier() {
        return quest.getTierView();
    }

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
