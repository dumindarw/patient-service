package org.drw.ps.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Patient {

    String name;
    @Id
    int id;
    String nic;
    int isActive;
    LocalDate birthDate;

}