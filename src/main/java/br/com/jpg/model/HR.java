package br.com.jpg.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tabela")
public class HR extends Worker{
    private static final long serialVersionUID = 1L;
}