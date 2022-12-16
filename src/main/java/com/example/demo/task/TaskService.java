package com.example.demo.task;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
	private final TaskRepository taskRepository;

	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public Task createTask(Task task) {
		return taskRepository.save(task);
	}
}