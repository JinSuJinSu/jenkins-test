package com.poscoict.mesproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.mesproject.repository.MaterialMgmRepository;
import com.poscoict.mesproject.vo.MaterialMgmVo;
import com.poscoict.mesproject.vo.WorkHistoryVo;

@Service
public class MaterialMgmService {
	
	@Autowired
	private MaterialMgmRepository materialMgmRepository;
	
	public List<MaterialMgmVo> getAll() {
		List<MaterialMgmVo> list = materialMgmRepository.findAll();
		return list;
	}

}
