package mbsoft.quran.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import mbsoft.quran.entities.Lafdq;

@CrossOrigin("*")
@RepositoryRestResource
public interface LafdQuranRepository extends JpaRepository<Lafdq, Integer>{
	@RestResource(path="/chercher")
	public List<Lafdq> findByNlContains(@Param("mc") String nl);
	
	
	@RestResource(path="/chercherByKlm")
	//public List<Lafdq> findByNl(@Param("mc") String nl);
	public Page<Lafdq> findByNl(@Param("mc") String nl, Pageable pageable);
	
	@RestResource(path="/chercherPage")
	//public Page<Lafdq> findByNlContains(@Param("mc") String nl, Pageable pageable);
	public Page<Lafdq> findByNlContains(@Param("mc") String nl, Pageable pageable);
	
	@RestResource(path="/chercherByHarf")
	//public List<Lafdq> findByHarfd(@Param("id") String h);
	public Page<Lafdq> findByHarfd(@Param("id") String h, Pageable pageable);
}
