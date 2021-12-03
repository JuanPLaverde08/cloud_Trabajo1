package co.com.poli.cloud_trabajo1.entities;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "Backlog")
public class Backlog extends BaseEntity {

	@OneToOne
	@JoinColumn(name = "project_id", referencedColumnName="id")
	private Project project;

	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
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
