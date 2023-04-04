package com.mairanath.iesp.iespflix.repository;

import com.mairanath.iesp.iespflix.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero,Integer> {
}
