package com.childviewtest.stack

import android.view.View
import android.widget.FrameLayout
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager

class StackViewManager : ViewGroupManager<StackView>() {
    override fun getName(): String {
        return "StackView"
    }

    override fun createViewInstance(reactContext: ThemedReactContext): StackView {
        return StackView(reactContext)
    }

    // MARK :- Children
    override fun addView(parent: StackView, child: View, index: Int) {
        val params = FrameLayout.LayoutParams(250, 250)
        params.topMargin = 50 * index
        params.leftMargin = 50 * index
        child.layoutParams = params
        parent.addView(child, index)
    }

    override fun getChildAt(parent: StackView, index: Int): View {
        return parent.getChildAt(index)
    }

    override fun removeViewAt(parent: StackView, index: Int) {
        parent.removeViewAt(index)
    }

    override fun getChildCount(parent: StackView): Int {
        return parent.childCount
    }

    override fun needsCustomLayoutForChildren(): Boolean {
        return true
    }

}