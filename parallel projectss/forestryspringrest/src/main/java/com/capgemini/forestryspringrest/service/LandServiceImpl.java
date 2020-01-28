package com.capgemini.forestryspringrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestryspringrest.dao.LandDao;
import com.capgemini.forestryspringrest.dto.LandBean;
@Service
public class LandServiceImpl implements LandService{
	
	@Autowired
	private LandDao landDao;

	@Override
	public boolean addLandDetails(LandBean bean) {
		return landDao.addLandDetails(bean);
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
