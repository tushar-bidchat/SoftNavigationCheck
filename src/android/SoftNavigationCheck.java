package com.bidchat.SoftNavigationCheck;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.view.ViewConfiguration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.content.res.Resources;

/**
 * This class echoes a string called from JavaScript.
 */
public class SoftNavigationCheck extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("isSoftNavigationAvailable")) {
            this.isSoftNavigationAvailable(callbackContext);
            return true;
        }
        if (action.equals("navigationBarHeight")) {
            this.navigationBarHeight(callbackContext);
            return true;
        }
        return false;
    }

    private void isSoftNavigationAvailable(CallbackContext callbackContext) {
        // boolean hasSoftKey = ViewConfiguration.get(this.cordova.getActivity()).hasPermanentMenuKey();
        if (isNavigationBarAvailable()) {
            callbackContext.success();
        } else {
            callbackContext.error("error");
        }
    }

    public boolean isNavigationBarAvailable(){

        boolean hasBackKey = KeyCharacterMap.deviceHasKey(KeyEvent.KEYCODE_BACK);
        boolean hasHomeKey = KeyCharacterMap.deviceHasKey(KeyEvent.KEYCODE_HOME);

        return (!(hasBackKey && hasHomeKey));
    }

    public void navigationBarHeight(CallbackContext callbackContext) {
        Resources resources = this.cordova.getActivity().getResources();
        int resourceId = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId > 0) {
             callbackContext.success(resources.getDimensionPixelSize(resourceId));
            }
        callbackContext.success(0);
    }
}
