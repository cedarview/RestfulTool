/*
  Copyright (C), 2018-2020, ZhangYuanSheng
  FileName: Test
  Author:   ZhangYuanSheng
  Date:     2020/7/7 00:12
  Description: 
  History:
  <author>          <time>          <version>          <desc>
  作者姓名            修改时间           版本号              描述
 */
package com.github.restful.tool.actions.copy;

import com.github.restful.tool.i18n.SystemBundle;
import com.intellij.openapi.actionSystem.ActionUpdateThread;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import org.jetbrains.annotations.NotNull;

/**
 * @author ZhangYuanSheng
 * @version 1.0
 */
public class OptionForEditorGroups extends DefaultActionGroup implements CopyOption {

    public OptionForEditorGroups() {
        super(SystemBundle.getString("plugin.name", new Object[0]), true);
    }

    @Override
    public void update(@NotNull AnActionEvent e) {
        e.getPresentation().setEnabledAndVisible(withPsiMethod(e));
    }

    @Override
    public @NotNull ActionUpdateThread getActionUpdateThread() {
        return ActionUpdateThread.BGT;
    }
}
