package br.com.rodolfoortale.brighthr.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import br.com.rodolfoortale.brighthr.api.APICons;

/**
 * Local persistence helper
 */

public class PersistenceHelper {
    private Context context;
    private static PersistenceHelper instance = null;
    private static SharedPreferences preferences;

    /**
     *
     * @param context - needed to UI
     */
    private PersistenceHelper(Context context) {
        this.context = context;
    }

    /**
     *
     * @param context
     * @return - instance of PersistenceHelper
     */
    public static PersistenceHelper getInstance(Context context) {
        if(instance == null) {
            instance = new PersistenceHelper(context);
        }
        return instance;
    }

    /**
     * Saves login token to use on future requests
     *
     * @param token
     */
    public void saveToken(String token) {
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(APICons.kToken,token);
        editor.apply();
    }

    /**
     *
     * Get Token to use on safe requests
     *
     * @param context
     * @return String
     */
    public String getToken(Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);

        return preferences.getString(APICons.kToken, "");
    }
}
