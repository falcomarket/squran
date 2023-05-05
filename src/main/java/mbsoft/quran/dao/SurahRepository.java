package mbsoft.quran.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import mbsoft.quran.entities.Surah;



@CrossOrigin("*")
@RepositoryRestResource
public interface SurahRepository extends JpaRepository<Surah, Integer>{
	@RestResource(path="/chercher")
	public List<Surah> findByCssContains(@Param("mc") String css);

	@RestResource(path="/chercherPage")
	public Page<Surah> findByCssContains(@Param("mc") String css, Pageable pageable);

	@RestResource(path="/chercherId")
	public List<Surah> findByOs(@Param("id") Integer os);

}

