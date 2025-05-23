package me.leoo.guilds.api.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum PermissionsEnum {
    NAME("modify-name"),
    MOTD("modify-motd"),
    TAG("modify-tag"),
    RANKS("change-ranks"),
    FINDER("finder-options"),
    CHAT("officer-chat"),
    KICK("kick"),
    MUTE("mute"),
    INVITE("invite"),
    LOG("log"),
    STATS("stats"),
    PARTY("party"),
    SETTINGS("settings"),
    DISCORD("change-discord");

    private final String name;

    public static PermissionsEnum getByName(String name) {
        return Arrays.stream(values()).filter(permission -> permission.getName().equals(name)).findAny().orElse(null);
    }

    public static PermissionsEnum getByOrdinal(int ordinal) {
        return values()[ordinal];
    }
}
