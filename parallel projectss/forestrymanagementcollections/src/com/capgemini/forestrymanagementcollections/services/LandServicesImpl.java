package com.capgemini.forestrymanagementcollections.services;

import java.util.List;

import com.capgemini.forestrymanagementcollections.bean.LandBean;
import com.capgemini.forestrymanagementcollections.dao.LandDao;
import com.capgemini.forestrymanagementcollections.factory.ForestryFactory;


public class LandServicesImpl implements LandServices {
	
	LandDao landDao =ForestryFactory.instanceOfLandDaoImpl();

	@Override
	public boolean addLandDetails(LandBean bean) {
		return landDao.addLandDetails(bean) ;
	}

	@Override
	public boolean modifyLandDetails(LandBean landBean) {
		return landDao.modifyLandDetails(landBean);
	}

	@Override
	public boolean deleteLandDetails(int landId) {
		return landDao.deleteLandDetails(landId);
	}

	@Override
	public LandBean getLandDetails(int landId) {
		return landDao.getLandDetails(landId);
	}

	@Override
	public List<LandBean> getAllLandDetails() {
		return landDao.getAllLandDetails();
	}

}
