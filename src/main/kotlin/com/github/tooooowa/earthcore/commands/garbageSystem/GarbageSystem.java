package com.github.tooooowa.earthcore.commands.garbageSystem;

import com.github.tooooowa.earthcore.others.Utilities;
import kotlin.jvm.internal.Intrinsics;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public final class GarbageSystem {
    @NotNull
    public static final GarbageSystem INSTANCE = new GarbageSystem();

    private GarbageSystem() {
    }

    public void openGarbageGui(@NotNull Player player) {
        Intrinsics.checkNotNullParameter(player, "player");
        Inventory inventory = Bukkit.createInventory(player, 54, Utilities.INSTANCE.getColored("&6&l\u30b4\u30df" +
                "\u7bb1"));
        Intrinsics.checkNotNullExpressionValue(inventory, "createInventory(...)");
        Inventory inventory2 = inventory;
        player.openInventory(inventory2);
    }
}

