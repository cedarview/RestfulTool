package com.github.restful.tool.i18n;

import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.PropertyKey;

public class SystemBundle extends BaseBundle {


    public static final @NonNls String I18N = "i18n.system";
    private static final @NotNull SystemBundle INSTANCE = new SystemBundle();

    private SystemBundle() {
        super("i18n.system");
    }

    public static @Nls @NotNull String getString(@PropertyKey(resourceBundle = "i18n.system") String key, Object... params) {

        return INSTANCE.getMessage(key, params);
    }
}
