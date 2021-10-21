package org.drw.ps.data;

import java.util.List;

import org.drw.ps.model.Patient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PatientInfoRepository extends CrudRepository<Patient, Integer>{

    @Query("select p from Patient p WHERE p.isActive = ?1")
    List<Patient> findActivePatients(int isActive);

}