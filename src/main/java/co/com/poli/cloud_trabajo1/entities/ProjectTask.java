package co.com.poli.cloud_trabajo1.entities;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import co.com.poli.cloud_trabajo1.helper.Deserializer;
import jdk.nashorn.internal.ir.annotations.Immutable;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "Project_Task")
public class ProjectTask extends BaseEntity {

	@Column(name = "name")
	private String name;

	@Column(name = "summary")
	private String summary;

	@Column(name = "acceptance_criteria")
	private String acceptanceCriteria;

	@Column(name = "status")
	private String status;

	@Column(name = "priority")
	@Min(1)
	@Max(5)
	private int priority;

	@Positive(message = "Value must be positive")
	@Column(name = "hours")
	@Min(1)
	@Max(8)
	private double hours;

	@Column(name = "start_date")
	@JsonDeserialize(using = Deserializer.class)
	private Date startDate;

	@Column(name = "end_date")
	@JsonDeserialize(using = Deserializer.class)
	private Date endDate;

	@Column(name = "project_identifier")
	@Immutable
	private String projectIdentifier;

	@JsonBackReference
	@ManyToOne
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
