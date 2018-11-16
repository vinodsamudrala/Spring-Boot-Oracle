package guru.springframework.repositories;

import guru.springframework.domain.MSRNData;
import org.springframework.data.repository.CrudRepository;

public interface MSRNDataRepository extends CrudRepository<MSRNData, Long> {
	
}
