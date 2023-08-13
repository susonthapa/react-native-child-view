package com.childviewtest

import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext

class GoogleMapViewManager : SimpleViewManager<GoogleMapView>() {
    override fun getName(): String {
        return "GoogleMapView"
    }

    override fun createViewInstance(reactContext: ThemedReactContext): GoogleMapView {
        return GoogleMapView(reactContext)
    }
}