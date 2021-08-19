/*
 * Organization Organization.java.
 *
 * Copyright (c) 2018 OptimIT d.o.o.. All rights reserved.
 */
package com.example.test;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table
public class Organization {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String identificationNumber;

  private LocalDate establishmentDate;

  private String iban;

  private String city;

  private String street;

  private String streetNumber;

  private String email;

  private String url;

  private String contactNumber;
  

}
