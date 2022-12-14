package com.eetatcivil.eetatcivil.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;

@Data
public class ActeNaissanceDTO extends ActeDTO {

    private Long id;
    private String numRegistre;
    private String prenom;
    private String nom;
    private Date datenaiss;
    private LocalTime heurenaiss;
    private String lieunaiss;
    private char genre;
    private String prenomPere;
    private String nomMere;
    private String prenomMere;
}
