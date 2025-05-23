package me.leoo.guilds.api.enums;

import com.cryptomorin.xseries.XMaterial;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.md_5.bungee.api.ChatColor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum TagColorEnum {

    NONE(ChatColor.RESET, XMaterial.WHITE_WOOL, XMaterial.WHITE_DYE),
    GRAY(ChatColor.GRAY, XMaterial.LIGHT_GRAY_WOOL, XMaterial.GRAY_DYE),
    DARK_AQUA(ChatColor.DARK_AQUA, XMaterial.CYAN_WOOL, XMaterial.CYAN_DYE),
    DARK_GREEN(ChatColor.DARK_GREEN, XMaterial.GREEN_WOOL, XMaterial.GREEN_DYE),
    YELLOW(ChatColor.YELLOW, XMaterial.YELLOW_WOOL, XMaterial.YELLOW_DYE),
    ORANGE(ChatColor.GOLD, XMaterial.ORANGE_WOOL, XMaterial.ORANGE_DYE),
    DARK_RED(ChatColor.DARK_RED, XMaterial.RED_WOOL, XMaterial.RED_DYE),
    RED(ChatColor.RED, XMaterial.RED_WOOL, XMaterial.RED_DYE),
    GREEN(ChatColor.GREEN, XMaterial.LIME_WOOL, XMaterial.LIME_DYE),
    AQUA(ChatColor.AQUA, XMaterial.CYAN_WOOL, XMaterial.CYAN_DYE),
    DARK_BLUE(ChatColor.DARK_BLUE, XMaterial.BLUE_WOOL, XMaterial.BLUE_DYE),
    BLUE(ChatColor.BLUE, XMaterial.LIGHT_BLUE_WOOL, XMaterial.LIGHT_BLUE_DYE),
    PINK(ChatColor.LIGHT_PURPLE, XMaterial.PINK_WOOL, XMaterial.PINK_DYE),
    PURPLE(ChatColor.DARK_PURPLE, XMaterial.PURPLE_WOOL, XMaterial.PURPLE_DYE),
    WHITE(ChatColor.WHITE, XMaterial.WHITE_WOOL, XMaterial.WHITE_DYE),
    DARK_GRAY(ChatColor.DARK_GRAY, XMaterial.GRAY_WOOL, XMaterial.GRAY_DYE),
    BLACK(ChatColor.BLACK, XMaterial.BLACK_WOOL, XMaterial.BLACK_DYE);

    private final ChatColor chatColor;
    private final XMaterial woolMaterial;
    private final XMaterial dyeMaterial;

    public static TagColorEnum getByName(String name) {
        return Arrays.stream(values()).filter(value -> value.name().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public static TagColorEnum getByChatColor(ChatColor chatColor) {
        return Arrays.stream(values()).filter(value -> value.getChatColor().equals(chatColor)).findFirst().orElse(null);
    }
}
