package com.childviewtest

import android.view.View
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
        child?.let {
            parent?.addMapChildView(it, index)
        }
    }

    override fun getChildAt(parent: GoogleMapView?, index: Int): View? {
        return parent?.getMapChildView(index)
    }

    override fun removeViewAt(parent: GoogleMapView?, index: Int) {
        parent?.removeMapChildView(index)
    }

}