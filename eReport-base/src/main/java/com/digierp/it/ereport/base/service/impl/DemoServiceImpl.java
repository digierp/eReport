package com.digierp.it.ereport.base.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.digierp.it.ereport.base.dao.IDemoDao;
import com.digierp.it.ereport.base.entity.Demo;
import com.digierp.it.ereport.base.service.IDemoService;


@Named
public class DemoServiceImpl implements IDemoService {

	@Inject
	private IDemoDao demoDao;
	
	public void createDemo(Demo demo) {
		demoDao.createDemo(demo);
	}

	public void updateDemo(Demo demo) {
		demoDao.updateDemo(demo);
	}

	public void deleteDemo(Integer id) {
		demoDao.deleteDemo(id);
	}

	public Demo findDemo(Integer id) {
		return demoDao.findDemo(id);
	}

	public List<Demo> findDemos() {
		return demoDao.findDemos();
	}

}
