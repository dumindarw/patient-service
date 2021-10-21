package org.drw.ps.controller;

import java.util.List;

import org.drw.ps.data.PatientInfoRepository;
import org.drw.ps.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.NonNull;

@RestController
@RequestMapping("/patients")
public class PatientBasicInfoController {

    @Autowired
    private @NonNull PatientInfoRepository patientInfoRepo;

    @GetMapping("/active")
    private List<Patient> getActivePatients() {
        return patientInfoRepo.findActivePatients(1);
    }

    @PostMapping("/")
    private Patient addNewPatient(@RequestBody Patient patient) {
        return patientInfoRepo.save(patient);
    }
    
}
