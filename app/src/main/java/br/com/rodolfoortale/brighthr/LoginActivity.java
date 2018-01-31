package br.com.rodolfoortale.brighthr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.rodolfoortale.brighthr.helper.FormHelper;

public class LoginActivity extends AppCompatActivity {
    FormHelper formHelper;
    EditText edtLogin;
    EditText edtPassword;
    Button btnLogin;

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
            
        }
    }
}
