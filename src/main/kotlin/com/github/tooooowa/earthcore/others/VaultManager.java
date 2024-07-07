package com.github.tooooowa.earthcore.others;

import com.github.tooooowa.earthcore.EarthCore;
import kotlin.jvm.internal.Intrinsics;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.jetbrains.annotations.NotNull;

public final class VaultManager {
    @NotNull
    public static final VaultManager INSTANCE = new VaultManager();

    private VaultManager() {
    }

    public boolean setupEconomy() {
        if (Bukkit.getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        final RegisteredServiceProvider rsp = Bukkit.getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        final Object object = rsp.getProvider();
        Intrinsics.checkNotNullExpressionValue(object, "getProvider(...)");
        EarthCore.Companion.setEcon((Economy) object);
        return EarthCore.Companion.getEcon() != null;
    }

    public double getBalance(@NotNull final Player player) {
        Intrinsics.checkNotNullParameter(player, "player");
        final RegisteredServiceProvider rsp = Bukkit.getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp != null) {
            final Object object = rsp.getProvider();
            Intrinsics.checkNotNullExpressionValue(object, "getProvider(...)");
            EarthCore.Companion.setEcon((Economy) object);
        }
        final double bal = EarthCore.Companion.getEcon().getBalance(player);
        return bal;
    }

    public void giveMoney(@NotNull final Player player, final double money) {
        Intrinsics.checkNotNullParameter(player, "player");
        final RegisteredServiceProvider rsp = Bukkit.getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp != null) {
            final Object object = rsp.getProvider();
            Intrinsics.checkNotNullExpressionValue(object, "getProvider(...)");
            EarthCore.Companion.setEcon((Economy) object);
        }
        EarthCore.Companion.getEcon().depositPlayer(player, money);
    }
}

