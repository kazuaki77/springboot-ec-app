package com.kazu77project.user_service.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kazu77project.user_service.model.Test;

@Mapper
public interface TestMapper {

	Test findById(Long id);

}
