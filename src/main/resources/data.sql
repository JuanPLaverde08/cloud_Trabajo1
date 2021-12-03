INSERT INTO
  Backlog(id)
VALUES
  (1);
INSERT INTO
  Projects(
    id,
    project_name,
    project_identifier,
    description,
    start_date,
    end_date,
    backlog_id
  )
VALUES
  (
    1,
    'First Project',
    '001_projectt',
    'This is the first defaul project',
    '2021-12-21',
    '2022-12-1',
    1
  );
INSERT INTO
  Project_Task(
    id,
    name,
    summary,
    acceptance_criteria,
    status,
    priority,
    hours,
    start_date,
    end_date,
    project_identifier,
    backlog_id
  )
VALUES
  (
    1,
    'First task',
    'Add default data to DB',
    'To look good',
    'Not Started',
    1,
    1,
    '2021-12-21',
    '2021-12-22',
    '001_projectt',
    1
  );
