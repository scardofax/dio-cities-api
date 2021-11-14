package br.com.scfxcorp.diocitiesapi.repository;

import br.com.scfxcorp.diocitiesapi.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
