//
//  GoogleMapViewManager.swift
//  ChildViewTest
//
//  Created by Susan Thapa on 14/10/2023.
//

import Foundation

@objc(GoogleMapView)
class GoogleMapViewManager: RCTViewManager {
  
  override class func requiresMainQueueSetup() -> Bool {
    true
  }
  
  override func view() -> UIView! {
    return GoogleMapView()
  }
  
}
