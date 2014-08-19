package br.com.async.houseinspection.app.application;

import br.com.async.houseinspection.app.exception.HouseInspectionException;
import br.com.async.houseinspection.app.model.Inspection;
import br.com.async.houseinspection.app.repository.InspectionRepository;
import br.com.async.houseinspection.app.repository.InspectionRepositoryImpl;

/**
 * Created by yrineu on 18/08/14.
 */
public class InspectionApplicationImpl implements InspectionApplication {

    private InspectionRepository inspectionRepository = new InspectionRepositoryImpl();
    @Override
    public void create(Inspection entity) {
        try {
            inspectionRepository.create(entity);
        }catch (HouseInspectionException he){
            //Here implement the exception treatment
        }
    }

    @Override
    public void update(Inspection entity) {

    }

    @Override
    public Inspection findByCode(Integer code) {
        return null;
    }

    @Override
    public void delete(Inspection entity) {

    }
}
