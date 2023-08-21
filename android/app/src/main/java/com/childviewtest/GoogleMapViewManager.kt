package com.childviewtest

import android.view.View
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager

class GoogleMapViewManager : ViewGroupManager<GoogleMapView>() {
    override fun getName(): String {
        return "GoogleMapView"
    }

    override fun createViewInstance(reactContext: ThemedReactContext): GoogleMapView {
        return GoogleMapView(reactContext)
    }

    override fun addView(parent: GoogleMapView?, child: View?, index: Int) {
        parent?.addView(child, 400, 400)
    }

}