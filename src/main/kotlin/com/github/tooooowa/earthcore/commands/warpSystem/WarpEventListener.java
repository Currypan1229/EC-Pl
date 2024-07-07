package com.github.tooooowa.earthcore.commands.warpSystem;

import com.github.tooooowa.earthcore.EarthCore;
import com.github.tooooowa.earthcore.others.Utilities;
import kotlin.jvm.internal.Intrinsics;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public final class WarpEventListener
        implements Listener {
    @NotNull
    public static final WarpEventListener INSTANCE = new WarpEventListener();

    private WarpEventListener() {
    }

    @EventHandler
    public void onInventoryClick(@NotNull final InventoryClickEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.areEqual(EarthCore.Companion.getGuiMap().get(event.getWhoClicked().getUniqueId()),
                event.getInventory())) {
            String string;
            event.setCancelled(true);
            ItemStack itemStack = event.getCurrentItem();
            final String string2 = itemStack != null && (itemStack = itemStack.getItemMeta()) != null ?
                    itemStack.getDisplayName() : (string = null);
            if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u65e5\u672c"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), 18668.5, 64.0, -4818.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u4e2d\u56fd"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), 15166.5, 64.0, -4453.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u30a4\u30f3\u30c9\u30cd\u30b7" +
                    "\u30a2"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), 16387.5, 64.0, 589.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u30aa\u30fc\u30b9\u30c8\u30e9" +
                    "\u30ea\u30a2"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), 18916.5, 64.0, 3497.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u30ed\u30b7\u30a2"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), 7929.5, 64.0, -7670.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u30a4\u30f3\u30c9"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), 10815.5, 64.0, -3216.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u30ab\u30b6\u30d5\u30b9\u30bf" +
                    "\u30f3"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), 8790.5, 64.0, -6387.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u30b5\u30a6\u30b8\u30a2\u30e9" +
                    "\u30d3\u30a2"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), 6589.5, 64.0, -3520.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u30b9\u30a6\u30a7\u30fc\u30c7" +
                    "\u30f3"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), 2343.5, 64.0, -8601.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u30c9\u30a4\u30c4"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), 1430.5, 64.0, -6911.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u30b9\u30da\u30a4\u30f3"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), -565.5, 64.0, -5482.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u4e2d\u592e\u30a2\u30d5\u30ea" +
                    "\u30ab\u5171\u548c\u56fd"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), 2519.5, 64.0, -1256.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u5357\u30a2\u30d5\u30ea\u30ab" +
                    "\u5171\u548c\u56fd"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), 3157.5, 64.0, 4103.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u30b0\u30ea\u30fc\u30f3\u30e9" +
                    "\u30f3\u30c9"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), -5750.5, 64.0, -9918.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u30ab\u30ca\u30c0"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), -13143.5, 64.0, 7795.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u30a2\u30e1\u30ea\u30ab"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), -12696.5, 64.0, -5075.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u30d6\u30e9\u30b8\u30eb"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), -6628.5, 64.0, 1285.5));
            } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&e&l\u30a2\u30eb\u30bc\u30f3\u30c1" +
                    "\u30f3"))) {
                event.getWhoClicked().teleport(new Location(Bukkit.getWorld("earth"), -8469.5, 64.0, 4571.5));
            } else {
                return;
            }
            event.getWhoClicked().teleport(event.getWhoClicked().getLocation().toHighestLocation().add(0.0, 1.0, 0.0));
        }
    }
}

