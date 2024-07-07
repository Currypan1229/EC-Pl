package com.github.tooooowa.earthcore.commands.warpSystem;

import com.github.tooooowa.earthcore.EarthCore;
import com.github.tooooowa.earthcore.others.Utilities;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class WarpCommand
        implements CommandExecutor {
    @NotNull
    public static final WarpCommand INSTANCE = new WarpCommand();

    private WarpCommand() {
    }

    @Override
    public boolean onCommand(@NotNull final CommandSender sender, @NotNull final Command command,
                             @NotNull final String label, @Nullable final String[] args2) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(label, "label");
        if (!(sender instanceof Player)) {
            return false;
        }
        final Inventory inventory = Bukkit.createInventory(sender, 27, Utilities.INSTANCE.getColored("&6&l\u30ef" +
                "\u30fc\u30d7\u5834\u6240\u4e00\u89a7"));
        Intrinsics.checkNotNullExpressionValue(inventory, "createInventory(...)");
        final Inventory inventory2 = inventory;
        final ItemStack item = new ItemStack(Material.ENDER_PEARL, 1);
        final ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u65e5\u672c"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(0, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u4e2d\u56fd"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(1, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u30a4\u30f3\u30c9\u30cd\u30b7\u30a2"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(2, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u30aa\u30fc\u30b9\u30c8\u30e9\u30ea\u30a2"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(3, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u30ed\u30b7\u30a2"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(4, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u30a4\u30f3\u30c9"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(5, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u30ab\u30b6\u30d5\u30b9\u30bf\u30f3"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(6, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u30b5\u30a6\u30b8\u30a2\u30e9\u30d3\u30a2"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(7, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u30b9\u30a6\u30a7\u30fc\u30c7\u30f3"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(8, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u30c9\u30a4\u30c4"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(9, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u30b9\u30da\u30a4\u30f3"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(10, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u4e2d\u592e\u30a2\u30d5\u30ea\u30ab\u5171\u548c" +
                "\u56fd"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(11, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u5357\u30a2\u30d5\u30ea\u30ab\u5171\u548c\u56fd"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(12, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u30b0\u30ea\u30fc\u30f3\u30e9\u30f3\u30c9"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(13, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u30ab\u30ca\u30c0"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(14, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u30a2\u30e1\u30ea\u30ab"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(15, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u30d6\u30e9\u30b8\u30eb"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(16, item);
        itemMeta.setDisplayName(Utilities.INSTANCE.getColored("&e&l\u30a2\u30eb\u30bc\u30f3\u30c1\u30f3"));
        item.setItemMeta(itemMeta);
        inventory2.setItem(17, item);
        final Map<UUID, Inventory> map = EarthCore.Companion.getGuiMap();
        final UUID uUID = ((Player) sender).getUniqueId();
        Intrinsics.checkNotNullExpressionValue(uUID, "getUniqueId(...)");
        map.put(uUID, inventory2);
        ((Player) sender).openInventory(inventory2);
        return true;
    }
}

