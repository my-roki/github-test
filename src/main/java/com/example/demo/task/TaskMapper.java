package com.example.demo.task;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TaskMapper {
	Task taskPostDtoToTaskEntity(TaskDto.Post post);

	TaskDto.Response taskEntityToTaskResponseDto(Task task);
}