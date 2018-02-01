package br.com.rodolfoortale.brighthr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.rodolfoortale.brighthr.api.APIRequest;
import br.com.rodolfoortale.brighthr.helper.FormHelper;
import br.com.rodolfoortale.brighthr.interfaces.OnRequestCallbackInterface;
import br.com.rodolfoortale.brighthr.listeners.OnLoginCallbackListener;
import br.com.rodolfoortale.brighthr.model.ErrorResponse;
import br.com.rodolfoortale.brighthr.model.UserResponse;

public class LoginActivity extends AppCompatActivity implements OnRequestCallbackInterface {
    EditText edtLogin;
    EditText edtPassword;
    Button btnLogin;

    FormHelper formHelper;

    APIRequest apiRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtLogin = findViewById(R.id.edt_login);
        edtPassword = findViewById(R.id.edt_password);
        btnLogin = findViewById(R.id.btn_login);

        formHelper = FormHelper.getInstance(this);
        formHelper.checkEmptyFields(edtLogin, edtPassword, btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    private void login() {
        formHelper = FormHelper.getInstance(this);

        if (formHelper.validateLogin(edtLogin, edtPassword)) {
            apiRequest = new APIRequest(this, this);
            apiRequest.login(edtLogin.getText().toString(), edtPassword.getText().toString());
        }
    }

    @Override
    public void onResponseCallback(UserResponse userResponse) {
        String message = "Welcome to " + userResponse.getUserTimeZoneName();
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailureCallback(ErrorResponse errorResponse) {
        Toast.makeText(this, errorResponse.getErrorMessage(), Toast.LENGTH_SHORT).show();
    }
}
