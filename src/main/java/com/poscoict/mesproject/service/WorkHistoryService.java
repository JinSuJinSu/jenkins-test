package com.poscoict.mesproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.mesproject.repository.WorkHistoryRepository;
import com.poscoict.mesproject.vo.WorkHistoryVo;

@Service
public class WorkHistoryService {
	
	@Autowired
	private WorkHistoryRepository workHistoryRepository;
	
	public List<WorkHistoryVo> getAll() {
		List<WorkHistoryVo> list = workHistoryRepository.findAll();
		return list;
	}

}
