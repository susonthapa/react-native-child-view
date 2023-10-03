package com.childviewtest.stack

import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager

class StackViewManager : ViewGroupManager<StackView>() {
    override fun getName(): String {
        return "StackView"
    }

    override fun createViewInstance(reactContext: ThemedReactContext): StackView {
        return StackView(reactContext)
    }
}