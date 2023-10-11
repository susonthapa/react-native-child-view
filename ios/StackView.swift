//
//  StackView.swift
//  ChildViewTest
//
//  Created by Susan Thapa on 05/10/2023.
//

import Foundation
import UIKit

class StackView: UIView {
  
  override init(frame: CGRect) {
    super.init(frame: frame)
  }
  
  required init?(coder: NSCoder) {
    fatalError("init(coder:) has not been implemented")
  }
  
  // MARK: - Children
  override func insertReactSubview(_ subview: UIView!, at atIndex: Int) {
    subview.frame = .init(x: atIndex * 18, y: atIndex * 18, width: 100, height: 100)
    insertSubview(subview, at: atIndex)
  }
  
  override func removeReactSubview(_ subview: UIView!) {
    subview.removeFromSuperview()
  }
  
  override func reactSubviews() -> [UIView]! {
    return subviews
  }
  
}
