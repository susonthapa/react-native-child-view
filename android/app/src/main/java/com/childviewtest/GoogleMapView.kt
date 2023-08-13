package com.childviewtest

import android.view.ViewGroup
import android.widget.FrameLayout
import com.facebook.react.bridge.ReactContext
import com.google.android.gms.maps.MapView

class GoogleMapView(reactContext: ReactContext) : FrameLayout(reactContext) {

    init {
        val view = MapView(reactContext)
        addView(
            view,
            LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        )
        view.getMapAsync {

        }
    }
}