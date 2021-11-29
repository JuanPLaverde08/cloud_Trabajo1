package co.com.poli.cloud_trabajo1.entities;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "Projects")
public class Project extends BaseEntity {

	@Column(name = "projectName")
	private String projectName;

	@Column(name = "projectIdentifier")
	private String projectIdentifier;

	@Column(name = "description")
	private String description;

	@Column(name = "startDate")
	private Date startDate;

	@Column(name = "endDate")
	private Date endDate;

	@JsonBackReference
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "backlog_id")
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
