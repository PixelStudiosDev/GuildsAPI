package me.leoo.guilds.api.objects.settings;

import me.leoo.guilds.api.objects.player.PlayerView;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface SettingsView {

    String getDescription();

    List<String> getMotd();

    UUID getMotdLastEditorUuid();

    long getMotdLastEdit();

    boolean isOnlineMode();

    boolean isSlowMode();

    boolean isShown();

    Set<String> getGames();

    String getDiscordLink();

    PlayerView getMotdLastEditor();

    String getEffectiveDiscordLink();
}