package io.github.db.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "skill")
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String skillName;
	private String desc;

}
