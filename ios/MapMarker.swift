//
//  MapMarker.swift
//  ChildViewTest
//
//  Created by Susan Thapa on 11/10/2023.
//

import Foundation

class MapMarker: UIView {
  let marker: GMSMarker = GMSMarker()
  
  @objc var title: String = "" {
    didSet {
      marker.title = title
    }
  }
  
  @objc var location: [String: Any] = [:] {
    didSet {
      let lat = location["lat"] as! Double
      let lng = location["lng"] as! Double
      marker.position = .init(latitude: lat, longitude: lng)
    }
    
  }
}
