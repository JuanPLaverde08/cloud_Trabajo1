package co.com.poli.cloud_trabajo1.entities;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "Backlog")
public class Backlog extends BaseEntity {

	@JsonBackReference
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "project_id")
	private Project project;

	@JsonManagedReference
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "projectTask_id")
	private List<ProjectTask> projectTask;

	@Override
	public boolean equals(Object o) {
		return super.equals(o);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
