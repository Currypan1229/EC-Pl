package com.github.tooooowa.earthcore.commands.easyMenu;

import com.github.tooooowa.earthcore.others.Utilities;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public final class EasyMenuSystem {
    @NotNull
    public static final EasyMenuSystem INSTANCE = new EasyMenuSystem();

    private EasyMenuSystem() {
    }

    public void openEasyMenu(@NotNull Player player) {
        Intrinsics.checkNotNullParameter(player, "player");
        Inventory inventory = Bukkit.createInventory(player, 27, Utilities.INSTANCE.getColored("&a\u7c21\u7565" +
                "\u5316GUI"));
        Intrinsics.checkNotNullExpressionValue(inventory, "createInventory(...)");
        Inventory inventory2 = inventory;
        ItemStack linksItem = new ItemStack(Material.PAPER, 1);
        ItemMeta linksItemMeta = linksItem.getItemMeta();
        linksItemMeta.setDisplayName(Utilities.INSTANCE.getColored("&9\u5916\u90e8\u30ea\u30f3\u30af"));
        List linksItemLore = new ArrayList();
        linksItemLore.add(Utilities.INSTANCE.getColored("&7\u904a\u3073\u65b9\u3084\u898f\u7d04\u3001Wiki\u306a\u3069" +
                "\u306e\u30ea\u30f3\u30af\u3092\u8868\u793a\u3057\u307e\u3059\u3002"));
        linksItemMeta.setLore(linksItemLore);
        linksItem.setItemMeta(linksItemMeta);
        inventory2.setItem(10, linksItem);
        ItemStack jobsItem = new ItemStack(Material.IRON_PICKAXE, 1);
        ItemMeta jobsItemMeta = jobsItem.getItemMeta();
        jobsItemMeta.setDisplayName(Utilities.INSTANCE.getColored("&5\u50cd\u304f"));
        List jobsItemLore = new ArrayList();
        jobsItemLore.add(Utilities.INSTANCE.getColored("&7\u8077\u696d\u306b\u5c31\u3044\u3066\u304a\u91d1\u3092" +
                "\u8cb0\u3044\u307e\u3059\u3002"));
        jobsItemMeta.setLore(jobsItemLore);
        jobsItem.setItemMeta(jobsItemMeta);
        inventory2.setItem(12, jobsItem);
        ItemStack warpItem = new ItemStack(Material.ENDER_PEARL, 1);
        ItemMeta warpItemMeta = warpItem.getItemMeta();
        warpItemMeta.setDisplayName(Utilities.INSTANCE.getColored("&2\u79fb\u52d5"));
        List warpItemLore = new ArrayList();
        warpItemLore.add(Utilities.INSTANCE.getColored("&7\u5730\u7403\u3084\u8cc7\u6e90\u30ef\u30fc\u30eb\u30c9" +
                "\u306b\u79fb\u52d5\u3057\u307e\u3059\u3002"));
        warpItemMeta.setLore(warpItemLore);
        warpItem.setItemMeta(warpItemMeta);
        inventory2.setItem(14, warpItem);
        ItemStack kingdomItem = new ItemStack(Material.SHIELD, 1);
        ItemMeta kingdomItemMeta = kingdomItem.getItemMeta();
        kingdomItemMeta.setDisplayName(Utilities.INSTANCE.getColored("&4\u5efa\u56fd"));
        List kingdomItemLore = new ArrayList();
        kingdomItemLore.add(Utilities.INSTANCE.getColored("&7\u8857\u3092\u4f5c\u3063\u3066\u30a2\u30a4\u30c6\u30e0" +
                "\u3092\u4fdd\u8b77\u3057\u305f\u308a\u3001"));
        kingdomItemLore.add(Utilities.INSTANCE.getColored("&7\u4ed6\u306e\u4eba\u3068\u66ae\u3089\u3059\u3053\u3068" +
                "\u304c\u51fa\u6765\u307e\u3059\u3002"));
        kingdomItemMeta.setLore(kingdomItemLore);
        kingdomItem.setItemMeta(kingdomItemMeta);
        inventory2.setItem(16, kingdomItem);
        player.openInventory(inventory2);
    }
}

