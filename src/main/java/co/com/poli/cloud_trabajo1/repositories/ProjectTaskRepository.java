package co.com.poli.cloud_trabajo1.repositories;

import co.com.poli.cloud_trabajo1.entities.ProjectTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface ProjectTaskRepository extends JpaRepository<ProjectTask, Long> {
	@Query("SELECT pt FROM ProjectTask as pt WHERE  pt.name = :name AND  pt.projectIdentifier = :projectIdentifier")
	List<ProjectTask> getTaskByNameAndProject(
			@Param("name") String name,
			@Param("projectIdentifier") String projectIdentifier
	);
}
