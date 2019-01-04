package com.elastic.service;

import java.util.List;

import com.elastic.bean.Stu;


public interface EsService {
	
	// region Repository Methods
	
	public void save(Stu stu);
	
	public Stu findById(Long id);
	
	public List<Stu> getByStuId(String stuId);
	
	public List<Stu> getByStuName(String stuName);

	public List<Stu> findAll();
	
	public void delete(Stu item);
	
	// endregion Repository Methods

}