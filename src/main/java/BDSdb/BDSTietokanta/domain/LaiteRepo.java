package BDSdb.BDSTietokanta.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface LaiteRepo extends CrudRepository<Laite, Long>{
	
	List<Laite> findByNimi(String nimi);

}
