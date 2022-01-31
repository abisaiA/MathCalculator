package cordova-plugin-mathcalculator;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class MathCalculator extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("add")){
            this.add(args, CallbackContext);
            return true;
        }els if(action.equals("substract"))
        {
            this.substract(args, CallbackContext);
            return true;
        }
        return false;
    }

    private void add(JSONArray args, callbackContext) { 
        if(args != null)
        {
            try
            {
                int p1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                int p2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));

                Callback.success("" + (p1+p2));
            
            }catch(Exception ex){
                Callback.error("something went wrong" + ex);
            }

        
        }else{
            Callback.error("please do not pass null values");
        }
    }


    private void substract(JSONArray args, callbackContext) { 
        if(args != null)
        {
            try
            {
                int p1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                int p2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));

                Callback.success("" + (p1-p2));
            
            }catch(Exception ex){
                Callback.error("something went wrong" + ex);
            }

        
        }else{
            Callback.error("please do not pass null values");
        }
    }
}
