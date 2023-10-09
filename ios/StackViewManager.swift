//
//  StackViewManager.swift
//  ChildViewTest
//
//  Created by Susan Thapa on 05/10/2023.
//

import Foundation

@objc(StackView)
class StackViewManager: RCTViewManager {
  
  override class func requiresMainQueueSetup() -> Bool {
    true
  }
  
  override func view() -> UIView! {
    return StackView()
  }
  
  override func shadowView() -> RCTShadowView {
    return StackShadowView()
  }
  
}
