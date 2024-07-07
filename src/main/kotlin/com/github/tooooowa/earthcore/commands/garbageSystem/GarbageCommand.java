package com.github.tooooowa.earthcore.commands.garbageSystem;

import kotlin.jvm.internal.Intrinsics;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class GarbageCommand
        implements CommandExecutor {
    @NotNull
    public static final GarbageCommand INSTANCE = new GarbageCommand();

    private GarbageCommand() {
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
        GarbageSystem.INSTANCE.openGarbageGui((Player) sender);
        return true;
    }
}

