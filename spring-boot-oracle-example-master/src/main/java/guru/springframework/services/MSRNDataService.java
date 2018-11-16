package guru.springframework.services;

import guru.springframework.domain.MSRNData;

import java.util.List;

public interface MSRNDataService {

    List<MSRNData> listAll();

    MSRNData getById(Long id);

    MSRNData saveOrUpdate(MSRNData product);

    void delete(Long id);

}
