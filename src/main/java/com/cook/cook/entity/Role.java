package com.cook.cook.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Role extends AbstactEntity{
    private String name;

    private String title;
}
