package com.capgemini.forestrymanagementcollections.dao;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import com.capgemini.forestrymanagementcollections.bean.CustomerBean;
import com.capgemini.forestrymanagementcollections.bean.LandBean;
import com.capgemini.forestrymanagementcollections.exceptions.NotFoundException;

public class LandDaoImpl implements LandDao{
	
	private List<LandBean> land=new ArrayList<LandBean>();



	@Override
	public boolean addLandDetails(LandBean bean) {
		for ( LandBean landB: land) 
		{
			if( landB.getLandId() ==bean.getLandId()) 
				throw new NotFoundException("Land Id Already Exist");
		}
		land.add(bean);
		return true;
	}

	@Override
	public boolean modifyLandDetails(LandBean landBean) {
		LandBean bean1=getLandDetails(landBean.getLandId());
		if(bean1!=null) {
			deleteLandDetails(landBean.getLandId());
			bean1.setLandValue(landBean.getLandValue());
			bean1.setLandLocation(landBean.getLandLocation());
			
			land.add(bean1);
			return true;
		}
		throw new NotFoundException("Land Details Not Found");	
	}

	@Override
	public boolean deleteLandDetails(int landId) {
		LandBean bean=null;
		for ( LandBean lbean: land) {
			if(lbean.getLandId()==landId) {
				bean=lbean;
			}
		}
		if(bean!=null) {
			land.remove(bean);
			return true;
		}
		throw new NotFoundException("Land Details Not Found");	
	}

	@Override
	public LandBean getLandDetails(int landId) {
		LandBean bean=null;
		for (LandBean pb: land) {
			if(pb.getLandId()==landId) 

				return pb;
		}
		throw new NotFoundException("Land Details Not Found");	
	}

	@Override
	public List<LandBean> getAllLandDetails() {
		return land;
	}

}
