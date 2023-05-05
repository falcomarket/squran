package mbsoft.quran.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import mbsoft.quran.entities.Hhija;

@CrossOrigin("*")
@RepositoryRestResource
public interface HharfRepository extends JpaRepository<Hhija,Integer>{

}
