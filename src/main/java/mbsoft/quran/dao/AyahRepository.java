package mbsoft.quran.dao;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import mbsoft.quran.entities.Ayah;



@CrossOrigin("*")
@RepositoryRestResource
public interface AyahRepository extends JpaRepository<Ayah,Integer>{
@RestResource(path="/chercher")
public List<Ayah> findByCasContains(@Param("mc") String cas);

@RestResource(path="/chercherPage")
public Page<Ayah> findByCasContains(@Param("mc") String cas, Pageable pageable);

@RestResource(path="/chercherId")
public List<Ayah> findByNsa(@Param("id") Integer nsa);

}
