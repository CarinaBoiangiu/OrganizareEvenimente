package com.OrganizareEvenimente.OrganizareEvenimente.General;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@Entity
@Table(name = "evenimente")
public class Eveniment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String denumirea;
    private String locatie;
    private LocalDate data;
    private LocalTime timp;
    private float pret;


    public Eveniment(String denumirea, String  locatie, LocalDate data, LocalTime timp, float pret){
        super();
        this.denumirea = denumirea;
        this.locatie = locatie;
        this.data = data;
        this.timp = timp;
        this.pret = pret;
    }
    public Eveniment(){}

    @Override
    public String toString() {
        return super.toString();
    }
}
