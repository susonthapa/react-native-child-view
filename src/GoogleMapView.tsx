import React from "react"
import { requireNativeComponent, ViewProps } from "react-native"
import MapMarker from "./MapMarker"

type Props = ViewProps & {

}

export type Marker = {
  title: string,
  location: {
    lat: number,
    lng: number,
  }
}

const MapView = requireNativeComponent<Props>('GoogleMapView')

type GoogleMapViewProps = {
  markers: Marker[]
}

const GoogleMapView = ({ markers }: GoogleMapViewProps) => {
  return (
    <MapView style={{
      flex: 1,
    }}>
      {markers.map((it) => (
        <MapMarker
          key={it.title}
          {...it}
        />
      ))}
    </MapView>
  )

}

export default GoogleMapView