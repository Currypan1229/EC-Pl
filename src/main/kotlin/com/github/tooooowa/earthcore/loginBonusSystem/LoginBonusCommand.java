package com.github.tooooowa.earthcore.loginBonusSystem;

import com.github.tooooowa.earthcore.others.Utilities;
import kotlin.jvm.internal.Intrinsics;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LoginBonusCommand
        implements CommandExecutor {
    @NotNull
    public static final LoginBonusCommand INSTANCE = new LoginBonusCommand();

    private LoginBonusCommand() {
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
        if (LoginBonusManager.INSTANCE.canAcquiredLoginBonus((Player) sender)) {
            LoginBonusManager.INSTANCE.giveLoginBonus((Player) sender);
        } else {
            sender.sendMessage(Utilities.INSTANCE.getColored("&7&lServer&a: &c\u3042\u306a\u305f\u306f\u3059\u3067" +
                    "\u306b\u30ed\u30b0\u30a4\u30f3\u30dc\u30fc\u30ca\u30b9\u3092\u53d7\u3051\u53d6\u3063\u3066\u3044" +
                    "\u307e\u3059\u3002\u6b21\u306f\u671d\u306e5\u6642\u4ee5\u964d\u306b\u53d6\u5f97\u53ef\u80fd" +
                    "\u3067\u3059"));
            ((Player) sender).playSound((Entity) sender, Sound.BLOCK_STONE_BUTTON_CLICK_ON, 0.5f, 1.0f);
        }
        return true;
    }
}

