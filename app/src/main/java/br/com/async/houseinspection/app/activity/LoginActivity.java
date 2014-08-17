package br.com.async.houseinspection.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.async.houseinspection.app.R;
import br.com.async.houseinspection.app.application.LoginApplication;
import br.com.async.houseinspection.app.application.LoginApplicationImpl;

/**
 * Created by yrineu on 17/08/14.
 */
public class LoginActivity extends Activity {

    private LoginApplication loginApplication;
    private static int BTN_LOGIN_ID = R.id.login_btn;
    private EditText fieldUserName;
    private EditText fieldPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        loginApplication = new LoginApplicationImpl();
        fieldUserName = (EditText)findViewById(R.id.fieldUserName);
        fieldPassword = (EditText)findViewById(R.id.fieldPassword);
    }

    public void login(View view){
        int viewId = view.getId();
        if(viewId == BTN_LOGIN_ID){
            String userName = fieldUserName.getText().toString();
            String password = fieldPassword.getText().toString();
            boolean canAccess = loginApplication.doLogin(userName, password);
            if(canAccess){
                Intent inspectionActivityListIntent = new Intent(this, InspectionListActivity.class);
                startActivity(inspectionActivityListIntent);
            }else{
                Toast.makeText(this, R.string.login_error_msg, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
