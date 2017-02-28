# SoftNavigationCheck

# Overview
This Cordova plugin for Android is used to check if the mobile device has a softkeyboard.



#### Example usage

### isSoftNavigationAvailable

              cordova.plugins.SoftNavigationCheck.isSoftNavigationAvailable(
                 function() {
                     console.log("Soft Navigation Bar Present");
                 }, 
                 function(){
                    console.log("Soft Navigation Bar Absent");
                 });


### navigationBarHeight
            cordova.plugins.SoftNavigationCheck.navigationBarHeight(
                 function(height) {
                     console.log("Height Value: " + height);
                 }, 
                 function(){
                    console.log("Error");
                 });
