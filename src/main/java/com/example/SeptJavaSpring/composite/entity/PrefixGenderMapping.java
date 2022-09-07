package com.example.SeptJavaSpring.composite.entity;


import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@Entity
public class PrefixGenderMapping {

    @EmbeddedId
    private PrefixGenderMappingId prefixGenderMappingId;

}
