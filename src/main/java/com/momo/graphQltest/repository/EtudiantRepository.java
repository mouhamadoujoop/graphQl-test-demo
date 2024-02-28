package com.momo.graphQltest.repository;

import com.momo.graphQltest.entities.Etudiant;
import org.springframework.data.repository.CrudRepository;

public interface EtudiantRepository  extends CrudRepository<Etudiant, Integer> {
    Etudiant findByEmail(String email);
}
