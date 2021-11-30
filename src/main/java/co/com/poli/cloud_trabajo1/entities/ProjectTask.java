package co.com.poli.cloud_trabajo1.entities;

import java.util.Date;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="projectTaks")
public class ProjectTask extends BaseEntity {

	@Column(name = "name")
	private String name;

	@Column(name = "summary")
	private String summary;

	@Column(name = "status")
	private String status;

	@Column(name = "priority")
	private int priority;

	@Column(name = "hours")
	private double hours;

	@Column(name = "startDate")
	private Date startDate;

	@Column(name = "endDate")
	private Date endDate;

	@Column(name = "projectIdentifier")
	private String projectIdentifier;

	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "project_id")
	private String backlog;

	@Override
	public boolean equals(Object o) {
		return super.equals(o);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
