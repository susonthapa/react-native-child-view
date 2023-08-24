package com.childviewtest

import android.content.Context
import com.facebook.react.views.view.ReactViewGroup
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

class MapMarker(context: Context) : ReactViewGroup(context) {

    private var marker: Marker? = null
    private var title: String = ""
    private var location: LatLng = LatLng(0.0, 0.0)

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

}