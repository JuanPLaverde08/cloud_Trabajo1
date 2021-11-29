package co.com.poli.cloud_trabajo1.entities;

import javax.persistence.*;

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
}
