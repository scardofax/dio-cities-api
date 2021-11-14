package br.com.scfxcorp.diocitiesapi.repository;


import br.com.scfxcorp.diocitiesapi.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Integer> {
}
