import { requireNativeComponent } from "react-native";

type Props = {
  title: string,
  location: {
    lat: number,
    lng: number,
  }
}

const MapMarker = requireNativeComponent<Props>("MapMarker")
export default MapMarker