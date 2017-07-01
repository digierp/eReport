package com.digierp.it.ereport.base.dao;

import java.util.List;

import com.digierp.it.ereport.base.entity.Demo;

public interface IDemoDao {
	
	public void createDemo(Demo demo);
	
	public void updateDemo(Demo demo);
	
	public void deleteDemo(Integer id);
	
	public Demo findDemo(Integer id);
	
	public List<Demo> findDemos();
	
}
