package mbsoft.quran.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import mbsoft.quran.entities.LafdAya;

@CrossOrigin("*")
@RepositoryRestResource
public interface LafdAyaRepository extends JpaRepository<LafdAya, Integer>{
	@RestResource(path="/chercher")
	public List<LafdAya> findByNlContains(@Param("mc") String nl);
	//public Page<LafdAya> findByNlContains(@Param("mc") String nl ,Pageable pageable);
	
	@RestResource(path="/chercherByKlm")
	//public List<LafdAya> findByNl(@Param("mc") String nl);
	public Page<LafdAya> findByNl(@Param("mc") String nl,Pageable pageable);
	
	@RestResource(path="/chercherPage")
	public Page<LafdAya> findByNlContains(@Param("mc") String nl, Pageable pageable);
	
	@RestResource(path="/chercherId")
	//public List<LafdAya> findByNsa(@Param("id") Integer nsa);
	public Page<LafdAya> findByNsa(@Param("id") Integer nsa, Pageable pageable);
}
