package co.com.poli.cloud_trabajo1.entities;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.*;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.com.poli.cloud_trabajo1.helper.Deserializer;
import jdk.nashorn.internal.ir.annotations.Immutable;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "Projects")
public class Project extends BaseEntity {

	@NotEmpty(message = "required")
	@Column(name = "project_name", unique = true)
	private String projectName;

	@NotEmpty(message = "required")
	@Column(name = "project_identifier", unique = true)
	@Immutable
	@Size(max = 7, min = 5)
	private String projectIdentifier;

	@NotEmpty(message = "required")
	@Column(name = "description")
	private String description;

	@Column(name = "start_date")
	@JsonDeserialize(using = Deserializer.class)
	private Date startDate;

	@Column(name = "end_date")
	@JsonDeserialize(using = Deserializer.class)
	private Date endDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "backlog_id", referencedColumnName = "id")
	@JsonIgnoreProperties(value = { "project" }, allowSetters = true)
	private Backlog backlog;

	@Override
	public boolean equals(Object o) {
		return super.equals(o);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
