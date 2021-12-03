package co.com.poli.cloud_trabajo1.repositories;

import co.com.poli.cloud_trabajo1.entities.ProjectTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskRepository extends JpaRepository<ProjectTask, Long> {
}
