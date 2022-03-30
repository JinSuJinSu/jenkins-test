package com.poscoict.mesproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.mesproject.repository.QualityStdRepository;
import com.poscoict.mesproject.vo.QualityStdVo;
import com.poscoict.mesproject.vo.UserInfoVo;

@Service
public class QualityStdService {
	
	@Autowired
	private QualityStdRepository qualityStdRepository;
	
	public List<QualityStdVo> getAll() {
		List<QualityStdVo> list = qualityStdRepository.findAll();
		return list;
	}


}
