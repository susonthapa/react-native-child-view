package com.childviewtest

import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.facebook.react.bridge.ReactContext
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView

class GoogleMapView(reactContext: ReactContext) : FrameLayout(reactContext) {

    private var googleMap: GoogleMap? = null
    private var mapView: MapView? = null
    private val mapChildren = mutableListOf<View>()

    init {
        mapView = MapView(reactContext)
        addView(
            mapView,
            LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        )
        mapView?.onCreate(null)
        mapView?.onStart()
        mapView?.getMapAsync {
            googleMap = it
        }
    }

    fun addMapChildView(view: View, index: Int) {
        if (view is MapMarker) {
            googleMap?.addMarker(
                view.getMarkerOptions()
            )?.let {
                view.setMarker(it)
            }
            mapChildren.add(index, view)
        }
    }

    fun removeMapChildView(index: Int) {
        val view = mapChildren.removeAt(index)
        if (view is MapMarker) {
            view.marker?.remove()
        }
    }

    fun getMapChildView(index: Int): View {
        return mapChildren[index]
    }

    fun getMapChildCount(): Int {
        return mapChildren.size
    }

    fun onDestroy() {
        mapView?.onDestroy()
    }
}