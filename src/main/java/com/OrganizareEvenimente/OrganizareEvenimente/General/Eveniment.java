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
    private long id;
    private String denumirea;
    private String locatia;
    private LocalDate data;
    private LocalTime timpul;
    private float pretBilet;

    public Eveniment(String denumirea, String  locatia, LocalDate data, LocalTime timpul, float pretul){
        super();
        this.denumirea = denumirea;
        this.locatia = locatia;
        this.data = data;
        this.timpul = timpul;
        this.pretBilet = pretul;
    }
    public Eveniment(){}

    @Override
    public String toString() {
        return super.toString();
    }
}
