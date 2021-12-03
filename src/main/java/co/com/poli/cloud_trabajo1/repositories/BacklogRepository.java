package co.com.poli.cloud_trabajo1.repositories;

import co.com.poli.cloud_trabajo1.entities.Backlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BacklogRepository extends JpaRepository<Backlog, Long> {
}
