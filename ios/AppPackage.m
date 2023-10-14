//
//  AppPackage.m
//  ChildViewTest
//
//  Created by Susan Thapa on 05/10/2023.
//

#import <Foundation/Foundation.h>
#import "React/RCTViewManager.h"

@interface RCT_EXTERN_MODULE(StackView, RCTViewManager)

@end

@interface RCT_EXTERN_MODULE(GoogleMapView, RCTViewManager)

@end

@interface RCT_EXTERN_MODULE(MapMarker, RCTViewManager)
RCT_EXPORT_VIEW_PROPERTY(title, NSString)
RCT_EXPORT_VIEW_PROPERTY(location, NSDictionary)
@end
