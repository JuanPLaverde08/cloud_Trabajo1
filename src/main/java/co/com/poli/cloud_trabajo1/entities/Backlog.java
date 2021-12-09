package co.com.poli.cloud_trabajo1.entities;

import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.*;
import lombok.*;
import javax.validation.constraints.*;

@Getter
@Setter
@Entity
@Table(name = "Backlog")
public class Backlog extends BaseEntity {

	@NotEmpty
	@Column(name = "project_identifier")
	private String projectIdentifier;

	@OneToOne(mappedBy = "backlog")
	@JsonIgnoreProperties("backlog")
	private Project project;

	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "backlog", cascade = CascadeType.ALL)
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
