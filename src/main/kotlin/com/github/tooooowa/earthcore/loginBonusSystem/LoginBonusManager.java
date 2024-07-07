package com.github.tooooowa.earthcore.loginBonusSystem;

import com.github.tooooowa.earthcore.EarthCore;
import com.github.tooooowa.earthcore.others.Utilities;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public final class LoginBonusManager {
    @NotNull
    public static final LoginBonusManager INSTANCE = new LoginBonusManager();

    private LoginBonusManager() {
    }

    public void checkResetTime() {
        final ZonedDateTime time = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        if (time.getHour() == 5 && time.getMinute() == 0) {
            this.resetLoginBonus();
        }
    }

    private void resetLoginBonus() {
        EarthCore.Companion.getLoginBonusAcquiredList().clear();
        Bukkit.getServer().broadcastMessage(Utilities.INSTANCE.getColored("&7&lServer&a: &a\u30ed\u30b0\u30a4\u30f3" +
                "\u30dc\u30fc\u30ca\u30b9\u304c\u518d\u5ea6\u53d7\u53d6\u53ef\u80fd\u306b\u306a\u308a\u307e\u3057" +
                "\u305f"));
    }

    public boolean canAcquiredLoginBonus(@NotNull final Player player) {
        Intrinsics.checkNotNullParameter(player, "player");
        return !EarthCore.Companion.getLoginBonusAcquiredList().contains(player.getUniqueId());
    }

    public void giveLoginBonus(@NotNull final Player player) {
        Intrinsics.checkNotNullParameter(player, "player");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "crates key give " + player.getName() + " login_bonus 1");
        player.sendMessage(Utilities.INSTANCE.getColored("&7&lServer&a: &a\u30ed\u30b0\u30a4\u30f3\u30dc\u30fc\u30ca" +
                "\u30b9\u3092\u7372\u5f97\u3057\u307e\u3057\u305f"));
        player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 0.5f, 1.0f);
        final List<UUID> list = EarthCore.Companion.getLoginBonusAcquiredList();
        final UUID uUID = player.getUniqueId();
        Intrinsics.checkNotNullExpressionValue(uUID, "getUniqueId(...)");
        list.add(uUID);
    }
}

