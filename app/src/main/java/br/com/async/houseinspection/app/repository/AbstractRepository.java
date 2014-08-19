package br.com.async.houseinspection.app.repository;

import java.io.Serializable;

/**
 * Created by yrineu on 18/08/14.
 */
public interface AbstractRepository<T, E> {

    void create(T entity);
    void update(T entity);
    T findByCode(E code);
    void delete(T entity);
}
