package com.kh.practice.controller;

import java.util.List;

import com.kh.practice.model.dao.PracticeDao;
import com.kh.practice.model.vo.PracticeVO;

public class PracticeController {
	
	public int insert(String singerName, String singerMajor, String singerDate, String singerAgency) {
		
		PracticeVO pv = new PracticeVO(singerName, singerMajor, singerDate, singerAgency);
		
		int result = new PracticeDao().insert(pv);
		
		return result;
	}
	
	public List<PracticeVO> findAll() {
		
		List<PracticeVO> pv= new PracticeDao().findAll();
		
		return pv;
	}
	
}
