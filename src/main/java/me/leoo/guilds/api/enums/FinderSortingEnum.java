package me.leoo.guilds.api.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.leoo.guilds.api.objects.guild.GuildView;

import java.util.Comparator;

@Getter
@RequiredArgsConstructor
public enum FinderSortingEnum {

    A_TO_Z("A to Z.", Comparator.comparing(GuildView::getName)),
    Z_TO_A("Z to A.", Comparator.comparing(GuildView::getName).reversed()),
    HIGH_MEMBERS("Most Guild Members first.", Comparator.comparingInt(guild -> -guild.getMembersView().size())),
    LOW_MEMBERS("Fewest Guild Members first.", Comparator.comparingInt(guild -> guild.getMembersView().size())),
    HIGH_LEVEL("Highest Guild Level first.", Comparator.comparingInt(guild -> -guild.getLevel().getLevel())),
    LOW_LEVEL("Lowest Guild Level first.", Comparator.comparingInt(guild -> guild.getLevel().getLevel())),
    NONE("Sort in no apparent order.", null);

    private final String defaultName;
    private final Comparator<GuildView> comparator;

    public String getPath() {
        return "guilds.settings.finder.sorting." + name().toLowerCase();
    }

    public FinderSortingEnum getNext() {
        return values()[(ordinal() + 1) % values().length];
    }
}
