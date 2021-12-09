package co.com.poli.cloud_trabajo1.entities;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.com.poli.cloud_trabajo1.helper.Deserializer;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "Projects")
public class Project extends BaseEntity {

	@NotEmpty(message="required")
	@Column(name = "project_name")
	private String projectName;

	@NotEmpty(message="required")
	@Column(name = "project_identifier")
	private String projectIdentifier;

	@NotEmpty(message="required")
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
	@JsonIgnoreProperties("project")
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
