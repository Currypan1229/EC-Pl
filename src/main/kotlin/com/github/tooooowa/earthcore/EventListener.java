package com.github.tooooowa.earthcore;

import com.github.tooooowa.earthcore.others.Utilities;
import kotlin.jvm.internal.Intrinsics;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jetbrains.annotations.NotNull;

public final class EventListener
        implements Listener {
    @NotNull
    public static final EventListener INSTANCE = new EventListener();

    private EventListener() {
    }

    @EventHandler
    public void onFirstJoin(@NotNull final PlayerJoinEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getPlayer().hasPlayedBefore()) {
            return;
        }
        final World world = Bukkit.getWorld("world");
        if (world != null) {
            final World it = world;
            final boolean bl = false;
            event.getPlayer().teleport(it.getSpawnLocation());
        }
        Bukkit.getServer().broadcastMessage(Utilities.INSTANCE.getColored("&b&l" + event.getPlayer().getName() + " " +
                "&6&l\u3055\u3093\u304c\u30b5\u30fc\u30d0\u30fc\u306b\u521d\u53c2\u52a0\u3067\u3059\uff01"));
        event.getPlayer().sendMessage(Utilities.INSTANCE.getColored(""));
        event.getPlayer().sendMessage(Utilities.INSTANCE.getColored("&a*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+"));
        event.getPlayer().sendMessage(Utilities.INSTANCE.getColored("&a&l*      \u540d\u79f0\u672a\u5b9a\u306e\u30b5" +
                "\u30fc\u30d0\u30fc\u3078\u3088\u3046\u3053\u305d\uff01\uff01"));
        event.getPlayer().sendMessage(Utilities.INSTANCE.getColored("&a*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+"));
        event.getPlayer().sendMessage(Utilities.INSTANCE.getColored("&a\u3053\u306e\u30b5\u30fc\u30d0\u30fc\u306f" +
                "\u3001\u3089\u3089\u3041\u306b\u3088\u3063\u3066\u904b\u55b6\u3055\u308c\u3066\u3044\u307e\u3059"));
        event.getPlayer().sendMessage(Utilities.INSTANCE.getColored("&a\u8a66\u9a13\u904b\u7528\u671f\u9593\u4e2d" +
                "\u306e\u305f\u3081\u4e0d\u5177\u5408\u304c\u591a\u767a\u3057\u307e\u3059\u304c\u3054\u4e86\u627f" +
                "\u304f\u3060\u3055\u3044\u3001\u307e\u305f\u3084\u3080\u3092\u5f97\u306a\u3044\u4e0d\u5177\u5408" +
                "\u304c\u767a\u751f\u3057\u305f\u5834\u5408\u30b5\u30fc\u30d0\u30fc\u30ea\u30bb\u30c3\u30c8\u3055" +
                "\u308c\u308b\u3053\u3068\u304c\u3042\u308a\u307e\u3059"));
        event.getPlayer().sendMessage(Utilities.INSTANCE.getColored("&a*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*+"));
        event.getPlayer().sendMessage(Utilities.INSTANCE.getColored(""));
    }
}

