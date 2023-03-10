package io.github.db.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "summary")
public class Summary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String rolesAndResponsibilities;
}
