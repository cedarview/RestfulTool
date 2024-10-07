package com.github.restful.tool.i18n;

import com.intellij.AbstractBundle;
import com.intellij.ide.plugins.PluginManager;
import com.intellij.openapi.extensions.PluginId;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.ResourceBundle;

public abstract class BaseBundle extends AbstractBundle {

    protected BaseBundle(@NonNls String resource) {
        super(resource);
    }

    protected @NotNull ResourceBundle findBundle(@NotNull @NonNls String pathToBundle, @NotNull ClassLoader loader, @NotNull ResourceBundle.@NotNull Control control) {

        String chineseLanguagePlugin = "com.intellij.zh";
        if (!PluginManager.isPluginInstalled(PluginId.getId(chineseLanguagePlugin))) {
            return ResourceBundle.getBundle(pathToBundle, Locale.ROOT, loader, control);
        } else {
            return ResourceBundle.getBundle(pathToBundle, Locale.getDefault(), loader, control);
        }
    }
}
