package com.capgemini.forestrymanagementcollections.dao;

import java.util.List;

import com.capgemini.forestrymanagementcollections.bean.LandBean;

public interface LandDao {
	
	public boolean addLandDetails(LandBean bean);
	public boolean modifyLandDetails(LandBean landBean);
	public boolean deleteLandDetails (int landId);
	public LandBean getLandDetails(int landId);
	public List<LandBean>getAllLandDetails();

}
