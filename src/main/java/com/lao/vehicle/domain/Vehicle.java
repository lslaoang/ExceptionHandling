package com.lao.vehicle.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Vehicle {

    @Id
    private String id;
    private String name;
    private String creator;
}
