package me.leoo.guilds.api.objects.player;

import org.bukkit.entity.Player;

import java.util.UUID;

public interface PlayerProvider {

    PlayerView getPlayer(UUID uuid);

    PlayerView getPlayer(Player player);
}
