package co.com.poli.cloud_trabajo1.repositories;

import co.com.poli.cloud_trabajo1.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
	@Query("SELECT p FROM Project as p WHERE p.projectName = :projectName OR p.projectIdentifier = :projectIdentifier")
	List<Project> getProjectByNameAndIdentifier(
			@Param("projectName") String projectName,
			@Param("projectIdentifier") String projectIdentifier
	);
}
