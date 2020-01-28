package com.capgemini.forestryjpawithhibernate.services;

import java.util.List;

import com.capgemini.forestryjpawithhibernate.dto.LandBean;

public interface LandServices {

	public boolean addLandDetails(LandBean bean);
	public boolean modifyLandDetails(LandBean landBean);
	public boolean deleteLandDetails (int landId);
	public LandBean getLandDetails(int landId);
	public List<LandBean>getAllLandDetails();
}
