package io.github.db.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "experience")
public class Experience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String companyName;

	private String description;

	private Date startDate;

	private Date endDate;

	private String position;
}
