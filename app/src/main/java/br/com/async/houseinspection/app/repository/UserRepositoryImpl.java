package br.com.async.houseinspection.app.repository;

import android.database.sqlite.SQLiteException;

import br.com.async.houseinspection.app.exception.SQLiteHouseInspectionException;
import br.com.async.houseinspection.app.model.User;

/**
 * Created by yrineu on 18/08/14.
 */
public class UserRepositoryImpl implements UserRepository{

    @Override
    public void create(User entity) {
        try {

        }catch (SQLiteException sqlE){
            throw new SQLiteHouseInspectionException(sqlE.getMessage());
        }
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public User findByCode(Integer code) {
        return null;
    }

    @Override
    public void delete(User entity) {

    }
}
