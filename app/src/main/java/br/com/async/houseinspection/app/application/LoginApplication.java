package br.com.async.houseinspection.app.application;

import br.com.async.houseinspection.app.model.User;

/**
 * Created by yrineu on 17/08/14.
 */
public interface LoginApplication {

    boolean doLogin(String userName, String password);
    boolean doLogout(User user);
}
