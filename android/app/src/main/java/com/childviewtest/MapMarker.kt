package com.childviewtest

import android.content.Context
import android.util.Log
import com.facebook.react.views.view.ReactViewGroup
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class MapMarker(context: Context) : ReactViewGroup(context) {

    var marker: Marker? = null
        private set
    private var title: String = ""
    private var location: LatLng = LatLng(0.0, 0.0)

    init {
        Log.d(TAG, "initializing MapMarker")
    }

    fun setMarker(marker: Marker) {
        this.marker = marker
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun setPosition(lat: Double, lng: Double) {
        this.location = LatLng(lat, lng)
    }

    fun getMarkerOptions(): MarkerOptions {
        return MarkerOptions()
            .title(title)
            .position(location)
    }

    companion object {
        const val TAG = "MapMarker"
    }

}