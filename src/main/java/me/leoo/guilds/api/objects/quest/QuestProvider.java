package me.leoo.guilds.api.objects.quest;

import java.util.UUID;

public interface QuestProvider {

    QuestView getRank(UUID uuid);
}
