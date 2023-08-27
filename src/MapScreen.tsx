import React, { useEffect, useState } from "react"
import { Button, View } from "react-native"
import GoogleMapView from "./GoogleMapView"

import { sampleMarkers } from "./SampleData"

const MapScreen = () => {
  const [markers, setMarkers] = useState(sampleMarkers)

  useEffect(() => {
  }, [])

  return (
    <View style={{
      flex: 1,
    }}>
      <View style={{
        position: 'absolute',
        bottom: 0,
        left: 0,
        zIndex: 1000,
      }}>
        <Button onPress={() => {
          markers.splice(0, 1)
          console.log('New Markers counts: ', markers.length);
          const newMarker = {
            title: "Sixteen" + markers.length + Math.random(),
            location: {
              lat: -36.852 + Math.random() * 20,
              lng: 150.211 + Math.random() * 20,
            }
          }
          markers.push(newMarker)
          setMarkers(markers.slice())
        }} title="Refresh Markers" />
      </View>
      <GoogleMapView markers={markers} />
    </View>
  )
}

export default MapScreen