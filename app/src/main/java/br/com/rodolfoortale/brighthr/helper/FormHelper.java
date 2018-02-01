package br.com.rodolfoortale.brighthr.helper;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

import br.com.rodolfoortale.brighthr.R;

/**
 * Helper to forms in the project
 */

public class FormHelper {
    private static FormHelper instance = null;

    private Context context;

    /**
     *
     * @param context - needed to UI
     */
    private FormHelper(Context context) {
        this.context = context;
    }

    /**
     *
     * @param context
     * @return - instance of FormHelper
     */
    public static FormHelper getInstance(Context context) {
        if(instance == null) {
            instance = new FormHelper(context);
        }
        return instance;
    }

    /**
     *
     * Login Form Validation
     *
     * @param edtLogin
     * @param edtPassword
     * @return boolean
     *
     */
    public boolean validateLogin(EditText edtLogin, EditText edtPassword) {
        String valLogin = edtLogin.getText().toString();

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(valLogin).matches()) {
            edtLogin.setError(context.getString(R.string.login_invalid_email));

            return false;
        }

        return true;
    }

    /**
     *
     * Checks for empty fields while typing
     *
     * @param edtLogin
     * @param edtPassword
     * @param btnLogin
     */
    public void checkEmptyFields(EditText edtLogin, EditText edtPassword, final Button btnLogin) {
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String text = editable.toString();

                if (!text.isEmpty()) {
                    btnLogin.setEnabled(true);
                }

                else {
                    btnLogin.setEnabled(false);
                }
            }
        };

        edtLogin.addTextChangedListener(textWatcher);
        edtPassword.addTextChangedListener(textWatcher);
    }
}
