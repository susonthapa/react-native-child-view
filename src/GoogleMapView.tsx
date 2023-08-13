import React from "react"
import { requireNativeComponent, ViewProps } from "react-native"

type Props = ViewProps & {

}

const MapView = requireNativeComponent<Props>('GoogleMapView')

const GoogleMapView = () => {

  return (
    <MapView style={{
      flex: 1,
    }} />
  )

}

export default GoogleMapView