package guru.springframework.services;

import guru.springframework.domain.MSRNData;
import guru.springframework.repositories.MSRNDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
@Service
public class MSRNDataServiceImpl implements MSRNDataService {

    private MSRNDataRepository msrndataRepository ;

    @Autowired
    public MSRNDataServiceImpl(MSRNDataRepository msrndataRepository) {
        this.msrndataRepository = msrndataRepository;
    }


    @Override
    public List<MSRNData> listAll() {
        List<MSRNData> products = new ArrayList<>();
        msrndataRepository.findAll().forEach(products::add); //fun with Java 8
        return products;
    }

    @Override
    public MSRNData getById(Long id) {
        return msrndataRepository.findOne(id);
    }

    @Override
    public MSRNData saveOrUpdate(MSRNData msrndata) {
    	msrndataRepository.save(msrndata);
        return msrndata;
    }

    @Override
    public void delete(Long id) {
    	msrndataRepository.delete(id);

    }


}
