//
//  StackShadowView.swift
//  ChildViewTest
//
//  Created by Susan Thapa on 09/10/2023.
//

import Foundation

class StackShadowView: RCTShadowView {
  
  override func isYogaLeafNode() -> Bool {
    return true
  }
  
}
