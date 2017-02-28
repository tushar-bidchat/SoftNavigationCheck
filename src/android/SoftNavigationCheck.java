package bidchat-plugin-SoftNavigationCheck;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class SoftNavigationCheck extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("isSoftNavigationAvailable")) {
            this.coolMetisSoftNavigationAvailablehod(callbackContext);
            return true;
        }
        return false;
    }

    private void isSoftNavigationAvailable(CallbackContext callbackContext) {
        boolean hasSoftKey = ViewConfiguration.get(context).hasPermanentMenuKey();
        if (hasSoftKey) {
            callbackContext.success();
        } else {
            callbackContext.error();
        }
    }
}
