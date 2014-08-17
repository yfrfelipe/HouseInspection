package br.com.async.houseinspection.app.application;

import br.com.async.houseinspection.app.model.User;

/**
 * Created by yrineu on 17/08/14.
 */
public class LoginApplicationImpl implements LoginApplication{
    @Override
    public boolean doLogin(String userName, String password) {
        boolean canLogin = false;
        if(userName.equalsIgnoreCase("Async") && password.equalsIgnoreCase("123") ){
            canLogin = true;
        }
        return canLogin;
    }

    @Override
    public boolean doLogout(User user) {
        return false;
    }
}
