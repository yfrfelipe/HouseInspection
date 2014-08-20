package br.com.async.houseinspection.app.exception;

import android.database.sqlite.SQLiteException;

/**
 * Created by yrineu on 18/08/14.
 */
public class SQLiteHouseInspectionException extends SQLiteException {

    private static String message = "Ops, algum erro ocorreu ao acessar o banco de dados: ";
    public SQLiteHouseInspectionException(String message){
        super(message);
    }
}
