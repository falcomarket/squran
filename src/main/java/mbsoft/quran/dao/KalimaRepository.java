package mbsoft.quran.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import mbsoft.quran.entities.Kalima;

@CrossOrigin("*")
@RepositoryRestResource
public interface KalimaRepository extends JpaRepository<Kalima,Integer>{

@RestResource(path="/chercher")
public List<Kalima> findByNlContains(@Param("mc") String nl);

@RestResource(path="/chercherByKlm")
public List<Kalima> findByNl(@Param("mc") String nl);

@RestResource(path="/chercherPage")
public Page<Kalima> findByNlContains(@Param("mc") String nl, Pageable pageable);

@RestResource(path="/chercherId")
public List<Kalima> findByNsa(@Param("id") Integer nsa);


}
