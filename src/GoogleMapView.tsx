import React from "react"
import { requireNativeComponent, ViewProps } from "react-native"
import MapMarker from "./MapMarker"

type Props = ViewProps & {

}

type Marker = {
  title: string,
  location: {
    lat: number,
    lng: number,
  }
}

const markers: Marker[] = [
  {
    title: "One",
    location: {
      lat: -36.852,
      lng: 150.211,
    }
  },
  {
    title: "Two",
    location: {
      lat: -35.852,
      lng: 151.211,
    }
  },
  {
    title: "Three",
    location: {
      lat: -38.852,
      lng: 153.211,
    }
  },
  {
    title: "Four",
    location: {
      lat: -33.852,
      lng: 148.211,
    }
  },
  {
    title: "Five",
    location: {
      lat: -32.852,
      lng: 150.211,
    }
  },
  {
    title: "Six",
    location: {
      lat: -30.852,
      lng: 153.211,
    }
  },
  {
    title: "Seven",
    location: {
      lat: -31.852,
      lng: 151.211,
    }
  },
  {
    title: "Eight",
    location: {
      lat: -39.852,
      lng: 148.211,
    }
  },
  {
    title: "Nine",
    location: {
      lat: -32.852,
      lng: 158.211,
    }
  },
  {
    title: "Ten",
    location: {
      lat: -30.852,
      lng: 141.211,
    }
  },
  {
    title: "Eleven",
    location: {
      lat: -34.852,
      lng: 152.211,
    }
  },
  {
    title: "Twelve",
    location: {
      lat: -32.852,
      lng: 152.211,
    }
  },
  {
    title: "Thirteen",
    location: {
      lat: -35.852,
      lng: 155.211,
    }
  },
  {
    title: "Fourteen",
    location: {
      lat: -34.852,
      lng: 159.211,
    }
  },
  {
    title: "Fifteen",
    location: {
      lat: -30.852,
      lng: 158.211,
    }
  },
]

const MapView = requireNativeComponent<Props>('GoogleMapView')

const GoogleMapView = () => {

  return (
    <MapView style={{
      flex: 1,
    }}>
      {markers.map((it) => (
        <MapMarker
          {...it}
        />
      ))}
    </MapView>
  )

}

export default GoogleMapView