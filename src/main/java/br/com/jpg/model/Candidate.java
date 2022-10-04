package br.com.jpg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name="Candidate")
public class Candidate{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_key_profile")
    public int id_key_profile;

    @Column(name = "candidate_name", length = 128)
    public String candidate_name;
    
    @Column(name = "english_level_id", table = "tb_domains", nullable = false)
    public int english_level_id;

    @Column(name = "spanish_level_id", table = "tb_domains", nullable = false)
    public int spanish_level_id;

    @Column(name = "shared_with_cust_date", nullable = false)
    public Date shared_with_cust_date;

    @Column(name = "seniority_level_id", table = "tb_domains", nullable = false)
    public int seniority_level_id;

    @Column(name = "candidate_contact_number", length = 16)
    public String candidate_contact_number;

    @Column(name = "role_id", table = "tb_domains", nullable = false)
    public int role_id;

    @Column(name = "description", length = 255)
    public String description;

    @Column(name = "resolution_comments", length = 255, nullable = false)
    public String resolution_comments;

    @Column(name = "profile_skill", length = 255, nullable = false)
    public String profile_skill;

    @Column(name = "candidate_email", length = 90, nullable = false)
    public String candidate_email;

    @Column(name = "profile_source", length = 255)
    public String profile_source;

    @Column(name = "cv_link", length = 128)
    public String cv_link;

    @Column(name = "candidate_screening_resolution", length = 45, nullable = false)
    public String candidate_screening_resolution;

    @Column(name = "current_employer", length = 64)
    public String current_employer;

    @Column(name = "id_tcs", length = 8, nullable = false)
    public String id_tcs;

    @Column(name = "work_location", length = 64)
    public String work_location;

    @Column(name = "salary_intention", length = 10)
    public String salary_intention;

    @Column(name = "hr_spoc_id", table = "tb_domains", nullable = false)
    public int hr_spoc_id;

}

   