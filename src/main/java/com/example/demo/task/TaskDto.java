package com.example.demo.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

public class TaskDto {
	@Getter
	@AllArgsConstructor
	public static class Post {
		private String title;
		private Integer orders;
	}

	@Data
	@AllArgsConstructor
	public static class Response {
		private Long id;
		private String title;
		private Integer orders;
		private Boolean completed;
	}
}