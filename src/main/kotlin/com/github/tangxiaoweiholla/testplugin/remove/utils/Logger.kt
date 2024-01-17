package com.github.tangxiaoweiholla.testplugin.remove.utils

import com.intellij.openapi.diagnostic.Logger

object Logger {
    fun info(message: String) {
        Logger.getInstance("RemoveButterKnife").info(message)
    }

    fun warn(message: String) {
        Logger.getInstance("RemoveButterKnife").warn(message)
    }

    fun error(message: String) {
        Logger.getInstance("RemoveButterKnife").error(message)
    }
}