package br.com.rodolfoortale.brighthr.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import br.com.rodolfoortale.brighthr.api.APICons;

/**
 * Created by rodolfoortale on 01/02/2018.
 */

public class PersistenceHelper {
    private Context context;
    private static PersistenceHelper instance = null;
    private static SharedPreferences preferences;

    private PersistenceHelper(Context context) {
        this.context = context;
    }

    public static PersistenceHelper getInstance(Context context) {
        if(instance == null) {
            instance = new PersistenceHelper(context);
        }
        return instance;
    }

    public void saveToken(String token) {
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(APICons.kToken,token);
        editor.apply();
    }

    public String getToken(Context context) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);

        return preferences.getString(APICons.kToken, "");
    }
}
