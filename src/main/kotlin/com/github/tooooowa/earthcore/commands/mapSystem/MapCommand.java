package com.github.tooooowa.earthcore.commands.mapSystem;

import com.github.tooooowa.earthcore.others.Utilities;
import kotlin.jvm.internal.Intrinsics;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MapCommand
        implements CommandExecutor {
    @NotNull
    public static final MapCommand INSTANCE = new MapCommand();

    private MapCommand() {
    }

    @Override
    public boolean onCommand(@NotNull final CommandSender sender, @NotNull final Command command,
                             @NotNull final String label, @Nullable final String[] args2) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(label, "label");
        final TextComponent mapLink = new TextComponent(Utilities.INSTANCE.getColored("&a\u30de\u30c3\u30d7\u30ea" +
                "\u30f3\u30af&r: &nhttps://map.earthcore.fun:30532/"));
        mapLink.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://map.earthcore.fun:30532/"));
        sender.sendMessage((BaseComponent) mapLink);
        return true;
    }
}

