package br.com.jpg.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="table")
public class Manager extends Worker{
    private static final long serialVersionUID = 1L;

}
