package br.com.async.houseinspection.app.application;

/**
 * Created by yrineu on 18/08/14.
 */
public interface AbstractApplication <T, E> {

    void create(T entity);
    void update(T entity);
    T findByCode(E code);
    void delete(T entity);
}
