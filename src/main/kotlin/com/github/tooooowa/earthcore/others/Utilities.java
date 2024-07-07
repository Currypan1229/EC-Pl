package com.github.tooooowa.earthcore.others;

import kotlin.jvm.internal.Intrinsics;
import org.bukkit.ChatColor;
import org.jetbrains.annotations.NotNull;

public final class Utilities {
    @NotNull
    public static final Utilities INSTANCE = new Utilities();

    private Utilities() {
    }

    @NotNull
    public String getColored(@NotNull final String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        final String string = ChatColor.translateAlternateColorCodes('&', text);
        Intrinsics.checkNotNullExpressionValue(string, "translateAlternateColorCodes(...)");
        return string;
    }
}

