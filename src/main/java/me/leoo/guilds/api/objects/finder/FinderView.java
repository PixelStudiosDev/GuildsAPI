package me.leoo.guilds.api.objects.finder;

import me.leoo.guilds.api.enums.FinderSortingEnum;

import java.util.List;

public interface FinderView {

    FinderSortingEnum getSorting();
    //List<SizeView> getSizeList();
    List<String> getGames();

    void setNextSorting();

    interface SizeView {
        int getMinimum();
        int getMaximum();
        String getFormatted();

        default boolean isNone() {
            return getMinimum() == 0 && getMaximum() == 0;
        }
    }
}