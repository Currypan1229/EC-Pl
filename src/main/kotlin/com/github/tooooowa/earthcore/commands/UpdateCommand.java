package com.github.tooooowa.earthcore.commands;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public final class UpdateCommand
        implements CommandExecutor {
    @NotNull
    private final Plugin plugin;

    public UpdateCommand(@NotNull final Plugin plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull final CommandSender sender, @NotNull final Command command,
                             @NotNull final String label, @NotNull final String[] args2) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(args2, "args");
        if (args2.length == 0) {
            return false;
        }
        final String url = args2[0];
        try {
            final byte[] pluginData = this.downloadPlugin(url);
            if (pluginData != null) {
                this.installPlugin(pluginData);
                sender.sendMessage("Plugin updated successfully.");
            } else {
                sender.sendMessage("Failed to update the plugin.");
            }
        } catch (final Exception e) {
            sender.sendMessage("An error occurred while updating the plugin: " + e.getMessage());
        }
        return true;
    }

    private byte[] downloadPlugin(final String url) {
        final URLConnection connection = new URL(url).openConnection();
        final InputStream inputStream = connection.getInputStream();
        return inputStream.readAllBytes();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void installPlugin(final byte[] pluginData) {
        final File pluginsFolder = this.plugin.getDataFolder().getParentFile();
        final File destFile = new File(pluginsFolder, "EarthCore.jar");
        try {
            final Closeable closeable = new FileOutputStream(destFile);
            Throwable throwable = null;
            try {
                final FileOutputStream outputStream = (FileOutputStream) closeable;
                final boolean bl = false;
                outputStream.write(pluginData);
                final Unit unit = Unit.INSTANCE;
            } catch (final Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            } finally {
                CloseableKt.closeFinally(closeable, throwable);
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}

