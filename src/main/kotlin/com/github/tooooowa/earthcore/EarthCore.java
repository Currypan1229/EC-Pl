package com.github.tooooowa.earthcore;

import com.github.tooooowa.earthcore.commands.RandomTeleportCommand;
import com.github.tooooowa.earthcore.commands.UpdateCommand;
import com.github.tooooowa.earthcore.commands.easyMenu.EasyMenuCommand;
import com.github.tooooowa.earthcore.commands.easyMenu.EasyMenuListener;
import com.github.tooooowa.earthcore.commands.garbageSystem.GarbageCommand;
import com.github.tooooowa.earthcore.commands.mapSystem.MapCommand;
import com.github.tooooowa.earthcore.commands.warpSystem.WarpCommand;
import com.github.tooooowa.earthcore.commands.warpSystem.WarpEventListener;
import com.github.tooooowa.earthcore.loginBonusSystem.LoginBonusCommand;
import com.github.tooooowa.earthcore.loginBonusSystem.LoginBonusManager;
import com.github.tooooowa.earthcore.others.VaultManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.command.PluginCommand;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class EarthCore
        extends JavaPlugin {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Map<UUID, Inventory> guiMap = new LinkedHashMap();
    @NotNull
    private static final List<UUID> loginBonusAcquiredList = new ArrayList();
    public static Economy econ;
    private static EarthCore Plugin;

    @Override
    public void onDisable() {
        Bukkit.getScheduler().cancelTasks(this);
    }

    @Override
    public void onEnable() {
        if (!VaultManager.INSTANCE.setupEconomy()) {
            this.getLogger().severe("Vault\u30d7\u30e9\u30b0\u30a4\u30f3\u304c\u8aad\u307f\u8fbc\u307e\u308c\u3066" +
                    "\u3044\u306a\u3044\u305f\u3081\u30d7\u30e9\u30b0\u30a4\u30f3\u3092\u7121\u52b9\u306b\u3057\u307e" +
                    "\u3059");
            this.getServer().getPluginManager().disablePlugin(this);
            VaultManager.INSTANCE.setupEconomy();
            return;
        }
        this.commandRegister();
        this.eventRegister();
        Plugin = this;
        this.scheduleTask();
    }

    private void commandRegister() {
        block6:
        {
            final PluginCommand pluginCommand = this.getCommand("warp");
            if (pluginCommand != null) {
                pluginCommand.setExecutor(WarpCommand.INSTANCE);
            }
            final PluginCommand pluginCommand2 = this.getCommand("randomteleport");
            if (pluginCommand2 != null) {
                pluginCommand2.setExecutor(RandomTeleportCommand.INSTANCE);
            }
            final PluginCommand pluginCommand3 = this.getCommand("update");
            if (pluginCommand3 != null) {
                pluginCommand3.setExecutor(new UpdateCommand(this));
            }
            final PluginCommand pluginCommand4 = this.getCommand("garbage");
            if (pluginCommand4 != null) {
                pluginCommand4.setExecutor(GarbageCommand.INSTANCE);
            }
            final PluginCommand pluginCommand5 = this.getCommand("daily");
            if (pluginCommand5 != null) {
                pluginCommand5.setExecutor(LoginBonusCommand.INSTANCE);
            }
            final PluginCommand pluginCommand6 = this.getCommand("easymenu");
            if (pluginCommand6 != null) {
                pluginCommand6.setExecutor(EasyMenuCommand.INSTANCE);
            }
            final PluginCommand pluginCommand7 = this.getCommand("map");
            if (pluginCommand7 == null) break block6;
            pluginCommand7.setExecutor(MapCommand.INSTANCE);
        }
    }

    private void eventRegister() {
        this.getServer().getPluginManager().registerEvents(EventListener.INSTANCE, this);
        this.getServer().getPluginManager().registerEvents(WarpEventListener.INSTANCE, this);
        this.getServer().getPluginManager().registerEvents(EasyMenuListener.INSTANCE, this);
    }

    private void scheduleTask() {
        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, EarthCore::scheduleTask$lambda$0, 0L, 1200L);
    }

    private static void scheduleTask$lambda$0() {
        LoginBonusManager.INSTANCE.checkResetTime();
    }

    public static final class Companion {
        public /* synthetic */ Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public Map<UUID, Inventory> getGuiMap() {
            return guiMap;
        }

        @NotNull
        public List<UUID> getLoginBonusAcquiredList() {
            return loginBonusAcquiredList;
        }

        @NotNull
        public EarthCore getPlugin() {
            final EarthCore earthCore = Plugin;
            if (earthCore != null) {
                return earthCore;
            }
            Intrinsics.throwUninitializedPropertyAccessException("Plugin");
            return null;
        }

        @NotNull
        public Economy getEcon() {
            final Economy economy = econ;
            if (economy != null) {
                return economy;
            }
            Intrinsics.throwUninitializedPropertyAccessException("econ");
            return null;
        }

        public void setEcon(@NotNull final Economy economy) {
            Intrinsics.checkNotNullParameter(economy, "<set-?>");
            econ = economy;
        }
    }
}

