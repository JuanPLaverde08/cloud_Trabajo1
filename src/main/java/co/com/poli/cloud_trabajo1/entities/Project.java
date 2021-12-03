package co.com.poli.cloud_trabajo1.entities;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import co.com.poli.cloud_trabajo1.helper.Deserializer;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "Projects")
public class Project extends BaseEntity {

	@Column(name = "project_name")
	private String projectName;

	@Column(name = "project_identifier")
	private String projectIdentifier;

	@Column(name = "description")
	private String description;

	@Column(name = "start_date")
	@JsonDeserialize(using = Deserializer.class)
	private Date startDate;

	@Column(name = "end_date")
	@JsonDeserialize(using = Deserializer.class)
	private Date endDate;

	@OneToOne
	@JoinColumn(name = "backlog_id", referencedColumnName = "id")
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
