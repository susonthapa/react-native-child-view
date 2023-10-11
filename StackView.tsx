import React, { useEffect, useState } from "react"
import { requireNativeComponent, View, ViewProps } from "react-native"

const StackView = requireNativeComponent<ViewProps>("StackView")

const TOTAL_VIEWS = 15

function getRandomColor() {
  // Generate random values for red, green, and blue components
  var r = Math.floor(Math.random() * 256); // 0 - 255
  var g = Math.floor(Math.random() * 256);
  var b = Math.floor(Math.random() * 256);

  // Construct the CSS color string
  var color = "rgb(" + r + ", " + g + ", " + b + ")";

  return color;
}

const StackViewComponent = () => {
  const [viewCount, setViewCount] = useState(0)

  useEffect(() => {
    const timerRef = setTimeout(() => {
      if (viewCount === TOTAL_VIEWS) {
        clearInterval(timerRef)
        return
      }
      setViewCount(viewCount + 1)
    }, 500)

    return () => clearTimeout(timerRef)
  }, [viewCount])

  return (
    <StackView style={{
      flex: 1,
      backgroundColor: 'pink'
    }}>
      {Array(viewCount).fill(0).map((it) => {
        return <View key={Math.random().toString()} style={{ height: 100, width: 100, backgroundColor: getRandomColor()}} />
      })}
    </StackView>
  )
}

export default StackViewComponent