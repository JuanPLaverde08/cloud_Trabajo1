package co.com.poli.cloud_trabajo1;

import co.com.poli.cloud_trabajo1.entities.ProjectTask;
import co.com.poli.cloud_trabajo1.repositories.ProjectTaskRepository;
import co.com.poli.cloud_trabajo1.service.TaskService;
import co.com.poli.cloud_trabajo1.service.TaskServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class ProyectTaskServiceMockTest {

    @Autowired
    private TaskService projectTaskService;

    @Test
    public void when_findByProjectHours_return_ProyectTask() {

        Date startDate = new Date(2021, 12, 23);
        Date finalDate = new Date(2021, 12, 24);

        ProjectTask projectTask = ProjectTask.builder()
                .name("Second task")
                .summary("Add default data to DB 2")
                .acceptanceCriteria("To look good 2")
                .status("Not Started 2")
                .priority(1)
                .hours(1)
                .startDate(startDate)
                .endDate(finalDate)
                .projectIdentifier("001_p")
                .build();

        double projectTaskHours = projectTaskService.getTasksByProjectHours("001_p");
        Assertions.assertThat(projectTaskHours=1);
    }

}
