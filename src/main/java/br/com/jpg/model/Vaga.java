package br.com.jpg.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_open_positions")
@SecondaryTable(name="tb_domains")
public class Vaga {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_key_open_position")
    public Integer id_key_open_position ;

    @Column(name = "title", length = 45, nullable = false)
    public Integer title;
   
    @Column(name = "role_id", table = "tb_domains", nullable = false)
    public Integer role_id;

    @Column(name = "open_position_status", table = "tb_domains", nullable = false)
    public Integer open_position_status;

    @Column(name = "type_main_skill_id", table = "tb_domains", nullable = false)
    public Integer type_main_skill_id;

    @Column(name = "seniority_level_required_id", table = "tb_domains", nullable = false)
    public Integer seniority_level_required_id;
   
    @Column(name = "minimum_experience_years")
    public Integer minimum_experience_years;
    
    @Column(name = "cluster_id", table = "tb_domains", nullable = false)
    public Integer cluster_id;

    @Column(name = "customer_id", table = "tb_domains", nullable = false)
    public Integer customer_id;

    @Column(name = "won", nullable = false)
    public Integer won;

    @Column(name = "new_position_or_replacement_id", table = "tb_domains", nullable = false)
    public Integer new_position_or_replacement_id;

    @Column(name = "rgs", nullable = false)
    public Integer rgs;

    @Column(name = "req", nullable = false)
    public Integer req;

    @Column(name = "cp_id", table = "tb_domains", nullable = false)
    public Integer cp_id;

    @Column(name = "need_client_interview_id", table = "tb_domains", nullable = false)
    public Integer need_client_interview_id;

    @Column(name = "work_model_id", table = "tb_domains", nullable = false)
    public Integer work_model_id;

    @Column(name = "owner_id", table = "tb_domains", nullable = false)
    public Integer owner_id;
    
    @Column(name = "pending_hr")
    public String pending_hr;

    @Column(name = "hr_spoc_id", table = "tb_domains", nullable = false)
    public Integer hr_spoc_id;

    @Column(name = "position_status_id")
    public Integer position_status_id;

    @Column(name = "doj")
    public String doj;

    @Column(name = "rgs_status_id", table = "tb_domains", nullable = false)
    public Integer rgs_status_id;

    @Column(name = "english_required_id", table = "tb_domains", nullable = false)
    public Integer english_required_id;

    @Column(name = "spanish_required_id", table = "tb_domains", nullable = false)
    public Integer spanish_required_id;
    
    @Column(name = "description", length = 255, nullable = false)
    public String description;

    @Column(name = "linkedin_open_position_url", length = 120)
    public String linkedin_open_position_url;

    @Column(name = "customer_info", length = 255)
    public String customer_info;

    @Column(name = "approved_candidate_id")
    public Integer approved_candidate_id;

    @Column(name = "dhl_requirement", length = 255)
    public Integer dhl_requirement;

    @Column(name = "rate_target", length = 45, nullable = false)
    public Integer rate_target;

    @Column(name = "on_hold", length = 255)
    public String on_hold;

    @Column(name = "cancel_reason", length = 255)
    public String cancel_reason;

}
   