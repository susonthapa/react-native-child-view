package com.childviewtest

import com.facebook.react.bridge.ReadableMap
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

class MapMarkerManager : SimpleViewManager<MapMarker>() {
    override fun getName(): String {
        return "MapMarker"
    }

    override fun createViewInstance(context: ThemedReactContext): MapMarker {
        return MapMarker(context)
    }

    @ReactProp(name = "title")
    fun setTitle(view: MapMarker, title: String) {
        view.setTitle(title)
    }

    @ReactProp(name = "location")
    fun setPosition(view: MapMarker, position: ReadableMap) {
        val lat = position.getDouble("lat")
        val lng = position.getDouble("lng")
        view.setPosition(lat, lng)
    }
}