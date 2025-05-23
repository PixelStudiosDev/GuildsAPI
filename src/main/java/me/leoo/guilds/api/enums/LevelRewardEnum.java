package me.leoo.guilds.api.enums;

public enum LevelRewardEnum {
    DOUBLE_XP, DOUBLE_COINS, TAG, TAG_LENGTH, CHARS, MAX_MEMBERS;

    public String getName() {
        return name().toLowerCase().replace("_", "-");
    }

    public boolean isTagOrChars() {
        return this == TAG || this == TAG_LENGTH || this == CHARS;
    }

    public boolean isNumeric() {
        return this == DOUBLE_XP || this == DOUBLE_COINS || this == MAX_MEMBERS;
    }

    public static LevelRewardEnum getByName(String name) {
        return LevelRewardEnum.valueOf(name.toUpperCase().replace("-", "_"));
    }
}
