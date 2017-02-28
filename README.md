# SoftNavigationCheck

# Overview
This Cordova plugin for Android is used to check if the mobile device has a softkeyboard.



#### Example usage

              cordova.plugins.SoftNavigationCheck.isSoftNavigationAvailable(
                 function() {
                     console.log("Soft Navigation Bar Present");
                 }, 
                 function(){
                    console.log("Soft Navigation Bar Absent");
                 });
