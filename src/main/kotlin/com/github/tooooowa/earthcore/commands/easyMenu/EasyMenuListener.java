package com.github.tooooowa.earthcore.commands.easyMenu;

import com.github.tooooowa.earthcore.others.Utilities;
import kotlin.jvm.internal.Intrinsics;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public final class EasyMenuListener
        implements Listener {
    @NotNull
    public static final EasyMenuListener INSTANCE = new EasyMenuListener();

    private EasyMenuListener() {
    }

    @EventHandler
    public void onEasyMenuClick(@NotNull final InventoryClickEvent event) {
        final Player player;
        block16:
        {
            block15:
            {
                Intrinsics.checkNotNullParameter(event, "event");
                if (!Intrinsics.areEqual(event.getWhoClicked().getOpenInventory().getTitle(),
                        Utilities.INSTANCE.getColored("&a\u7c21\u7565\u5316GUI"))) {
                    return;
                }
                event.setCancelled(true);
                if (event.getClick() == ClickType.DOUBLE_CLICK) {
                    return;
                }
                final Player player2 = Bukkit.getPlayer(event.getWhoClicked().getName());
                if (player2 == null) {
                    return;
                }
                player = player2;
                if (event.getCurrentItem() == null) break block15;
                final ItemStack itemStack = event.getCurrentItem();
                Intrinsics.checkNotNull(itemStack);
                if (itemStack.getItemMeta() != null) break block16;
            }
            return;
        }
        final ItemStack itemStack = event.getCurrentItem();
        Intrinsics.checkNotNull(itemStack);
        final String string = itemStack.getItemMeta().getDisplayName();
        if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&9\u5916\u90e8\u30ea\u30f3\u30af"))) {
            player.sendMessage("");
            player.sendMessage(Utilities.INSTANCE.getColored("&8\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015" +
                    "\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015" +
                    "\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015" +
                    "\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015" +
                    "\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015"));
            player.sendMessage(Utilities.INSTANCE.getColored("&7\u3010 &b&lEarthCore " +
                    "&f&l\u516c\u5f0f\u30ea\u30f3\u30af\u96c6&r&7 \u3011"));
            player.sendMessage("");
            final TextComponent homePageLink = new TextComponent(Utilities.INSTANCE.getColored("&b\u30db\u30fc\u30e0" +
                    "\u30da\u30fc\u30b8&r: &nhttps://earthcore.fun/"));
            homePageLink.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://earthcore.fun/"));
            player.sendMessage((BaseComponent) homePageLink);
            final TextComponent discordLink = new TextComponent(Utilities.INSTANCE.getColored("&9Discord&r: " +
                    "&nhttps://discord.gg/7w8enwt5v5"));
            discordLink.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://discord.gg/7w8enwt5v5"));
            player.sendMessage((BaseComponent) discordLink);
            final TextComponent staffLink = new TextComponent(Utilities.INSTANCE.getColored("&c\u30b9\u30bf\u30c3" +
                    "\u30d5\u52df\u96c6\u30d5\u30a9\u30fc\u30e0&r: &nhttps://forms.gle/fpJ3jyAXsNnzWC7j9"));
            staffLink.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://forms.gle/fpJ3jyAXsNnzWC7j9"));
            player.sendMessage((BaseComponent) staffLink);
            final TextComponent mapLink = new TextComponent(Utilities.INSTANCE.getColored("&a\u30de\u30c3\u30d7\u30ea" +
                    "\u30f3\u30af&r: &nhttps://map.earthcore.fun:30532/"));
            mapLink.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://map.earthcore.fun:30532/"));
            player.sendMessage((BaseComponent) mapLink);
            player.sendMessage(Utilities.INSTANCE.getColored("&8\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015" +
                    "\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015" +
                    "\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015" +
                    "\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015" +
                    "\u2015\u2015\u2015\u2015\u2015\u2015\u2015\u2015"));
            player.sendMessage("");
        } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&5\u50cd\u304f"))) {
            player.performCommand("jobs browse");
        } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&2\u79fb\u52d5"))) {
            player.performCommand("warp");
        } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&4\u5efa\u56fd"))) {
            player.sendMessage(Utilities.INSTANCE.getColored("&a\u8fd1\u65e5\u8ffd\u52a0"));
        } else if (Intrinsics.areEqual(string, Utilities.INSTANCE.getColored("&3\u4fbf\u5229\u6a5f\u80fd"))) {
            player.sendMessage(Utilities.INSTANCE.getColored("&a\u8fd1\u65e5\u8ffd\u52a0"));
        }
    }
}

