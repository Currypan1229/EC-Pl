package com.github.tooooowa.earthcore.commands;

import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class RandomTeleportCommand
        implements CommandExecutor {
    @NotNull
    public static final RandomTeleportCommand INSTANCE = new RandomTeleportCommand();

    private RandomTeleportCommand() {
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
        final int num = RangesKt.random(new IntRange(1, 18), Random.Default);
        switch (num) {
            case 1: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), 18668.0, 64.0, -4818.0));
                break;
            }
            case 2: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), 15166.0, 64.0, -4453.0));
                break;
            }
            case 3: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), 16387.0, 64.0, 589.0));
                break;
            }
            case 4: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), 18916.0, 64.0, 3497.0));
                break;
            }
            case 5: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), 7929.0, 64.0, -7670.0));
                break;
            }
            case 6: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), 10815.0, 64.0, -3216.0));
                break;
            }
            case 7: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), 8790.0, 64.0, -6387.0));
                break;
            }
            case 8: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), 6589.0, 64.0, -3520.0));
                break;
            }
            case 9: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), 2343.0, 64.0, -8601.0));
                break;
            }
            case 10: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), 1430.0, 64.0, -6911.0));
                break;
            }
            case 11: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), -565.0, 64.0, -5482.0));
                break;
            }
            case 12: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), 2519.0, 64.0, -1256.0));
                break;
            }
            case 13: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), 3157.0, 64.0, 4103.0));
                break;
            }
            case 14: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), -5750.0, 64.0, -9918.0));
                break;
            }
            case 15: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), -13143.0, 64.0, 7795.0));
                break;
            }
            case 16: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), -12696.0, 64.0, -5075.0));
                break;
            }
            case 17: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), -6628.0, 64.0, 1285.0));
                break;
            }
            case 18: {
                ((Player) sender).teleport(new Location(Bukkit.getWorld("earth"), -8469.0, 64.0, 4571.0));
            }
        }
        ((Player) sender).teleport(((Player) sender).getLocation().toHighestLocation().add(0.0, 1.0, 0.0));
        return true;
    }
}

