package co.com.poli.cloud_trabajo1.entities;

import java.io.Serializable;
import lombok.*;
import java.util.List;

@Getter
@Setter
public class BacklogDTO implements Serializable{
	  private String projectIdentifier;
    private int taskCount;
    private Project project;
    private List<ProjectTask> projectTask;
}
