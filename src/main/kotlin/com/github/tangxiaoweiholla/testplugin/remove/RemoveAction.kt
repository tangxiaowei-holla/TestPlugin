package com.github.tangxiaoweiholla.testplugin.remove

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class RemoveAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        Entrance(e).run()
    }
}