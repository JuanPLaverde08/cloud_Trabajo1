package co.com.poli.cloud_trabajo1.repositories;

import co.com.poli.cloud_trabajo1.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
	public Project[] getProject();
	public Project getProject(int id);
}
