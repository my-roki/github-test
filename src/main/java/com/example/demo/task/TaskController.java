package com.example.demo.task;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
	private final TaskService taskService;
	private final TaskMapper mapper;

	public TaskController(TaskService taskService, TaskMapper mapper) {
		this.taskService = taskService;
		this.mapper = mapper;
	}

	@PostMapping
	public ResponseEntity postTask(@RequestBody TaskDto.Post requestBody) {
		Task task = mapper.taskPostDtoToTaskEntity(requestBody);
		Task serviceTask = taskService.createTask(task);
		TaskDto.Response response = mapper.taskEntityToTaskResponseDto(serviceTask);

		return new ResponseEntity<>(response, HttpStatus.CREATED);

	}

}