package com.poscoict.mesproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.mesproject.repository.InstructionHistoryRepository;
import com.poscoict.mesproject.vo.InstructionHistoryVo;
import com.poscoict.mesproject.vo.WorkHistoryVo;

@Service
public class InstructionHistoryService {
	
	@Autowired
	private InstructionHistoryRepository instructionHistoryRepository;
	
	public List<InstructionHistoryVo> getAll() {
		List<InstructionHistoryVo> list = instructionHistoryRepository.findAll();
		return list;
	}
	

}
