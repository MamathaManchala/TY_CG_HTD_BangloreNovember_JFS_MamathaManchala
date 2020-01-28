package com.capgemini.forestryspringboot.service;

import java.util.List;

import com.capgemini.forestryspringboot.dto.LandBean;

public interface LandService {
	
	public boolean addLandDetails(LandBean bean);
	public boolean modifyLandDetails(LandBean landBean);
	public boolean deleteLandDetails (int landId);
	public LandBean getLandDetails(int landId);
	public List<LandBean>getAllLandDetails();

}
