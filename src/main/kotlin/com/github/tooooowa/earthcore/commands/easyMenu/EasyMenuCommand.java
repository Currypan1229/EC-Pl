package com.github.tooooowa.earthcore.commands.easyMenu;

import kotlin.jvm.internal.Intrinsics;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class EasyMenuCommand
        implements CommandExecutor {
    @NotNull
    public static final EasyMenuCommand INSTANCE = new EasyMenuCommand();

    private EasyMenuCommand() {
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
        EasyMenuSystem.INSTANCE.openEasyMenu((Player) sender);
        return true;
    }
}

