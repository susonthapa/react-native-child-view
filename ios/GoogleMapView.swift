//
//  GoogleMapView.swift
//  ChildViewTest
//
//  Created by Susan Thapa on 11/10/2023.
//

import Foundation

class GoogleMapView: UIView {
  private var mapView: GMSMapView!
  private var mapChildren: [UIView] = []
  
  override init(frame: CGRect) {
    super.init(frame: frame)
    let camera = GMSCameraPosition.camera(withLatitude: -33.86, longitude: 151.20, zoom: 6.0)
    mapView = GMSMapView(frame: frame, camera: camera)
    mapView.autoresizingMask = [.flexibleWidth, .flexibleHeight]
    addSubview(mapView)
  }
  
  required init?(coder: NSCoder) {
    fatalError("init(coder:) has not been implemented")
  }
  
  // MARK: - Children
  override func insertReactSubview(_ subview: UIView!, at atIndex: Int) {
    let marker = subview as! MapMarker
    marker.marker.map = mapView
    mapChildren.insert(subview, at: atIndex)
  }
  
  override func removeReactSubview(_ subview: UIView!) {
    let marker = subview as! MapMarker
    marker.marker.map = nil
    mapChildren.remove(at: mapChildren.firstIndex(of: subview)!)
  }
  
  override func reactSubviews() -> [UIView]! {
    return mapChildren
  }
  
  override func addSubview(_ view: UIView) {
    if !(view is MapMarker) {
      super.addSubview(view)
    }
  }
  
}
