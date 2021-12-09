package co.com.poli.cloud_trabajo1;

import co.com.poli.cloud_trabajo1.entities.ProjectTask;
import co.com.poli.cloud_trabajo1.repositories.ProjectTaskRepository;
import java.util.Date;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class ProjectTaskRepositoryMockTest {

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    @Test
    public void when_findByProject_return_ListProjectTask() {

        Date startDate = new Date(2021, 12, 21);
        Date finalDate = new Date(2021, 12, 22);
        ProjectTask projectTask = ProjectTask.builder()
                .name("First task")
                .summary("Add default data to DB")
                .acceptanceCriteria("To look good")
                .status("Not Started")
                .priority(1)
                .hours(1)
                .startDate(startDate)
                .endDate(finalDate)
                .projectIdentifier("001_p")
                .build();
        projectTaskRepository.save(projectTask);
        List<ProjectTask> projectTasks = projectTaskRepository.getTasksByProject(projectTask.getProjectIdentifier());
        Assertions.assertThat(projectTasks.size()).isEqualTo(2);
    }

}
