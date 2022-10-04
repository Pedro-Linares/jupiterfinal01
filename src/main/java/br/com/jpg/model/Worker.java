package br.com.jpg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="tb_users")
public class Worker{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tcs_user")
    public int id_tcs_user;

    @Column(name = "user_name_domain", length = 64, nullable = false)
    private String user_name_domain;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_level_id", nullable = false, unique = true)
    private int user_level_id;

    @Column(name = "user_email", length = 90)
    private String user_email;

    @Column(name="user_status")
    private boolean user_status;

    @Column(name="user_password", length = 45)
    private String user_password;
    
}