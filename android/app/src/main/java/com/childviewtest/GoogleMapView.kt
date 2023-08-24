package com.childviewtest

import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.facebook.react.bridge.ReactContext
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class GoogleMapView(reactContext: ReactContext) : FrameLayout(reactContext) {

    private var googleMap: GoogleMap? = null

    init {
        val view = MapView(reactContext)
        addView(
            view,
            LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        )
        view.onCreate(null)
        view.onStart()
        view.getMapAsync {
            googleMap = it
        }
    }

    fun addCustomView(view: View) {
        if (view is MapMarker) {
            googleMap?.addMarker(
                view.getMarkerOptions()
            )?.let {
                view.setMarker(it)
            }
        }
    }
}