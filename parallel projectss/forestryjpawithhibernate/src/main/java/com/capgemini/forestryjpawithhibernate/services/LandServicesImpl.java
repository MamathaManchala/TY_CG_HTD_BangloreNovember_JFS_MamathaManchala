package com.capgemini.forestryjpawithhibernate.services;

import java.util.List;

import com.capgemini.forestryjpawithhibernate.dao.LandDao;
import com.capgemini.forestryjpawithhibernate.dto.LandBean;
import com.capgemini.forestryjpawithhibernate.factory.ForestryFactory;

public class LandServicesImpl implements LandServices {
	
	LandDao landDao =ForestryFactory.instanceOfLandDaoImpl();

	public boolean addLandDetails(LandBean bean) {
		return landDao.addLandDetails(bean) ;
	}

	public boolean modifyLandDetails(LandBean landBean) {
		return landDao.modifyLandDetails(landBean);
	}

	public boolean deleteLandDetails(int landId) {
		return landDao.deleteLandDetails(landId);
	}

	public LandBean getLandDetails(int landId) {
		return landDao.getLandDetails(landId);
	}

	public List<LandBean> getAllLandDetails() {
		return landDao.getAllLandDetails();
	}

}
