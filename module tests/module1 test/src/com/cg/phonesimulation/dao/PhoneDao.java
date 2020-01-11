package com.cg.phonesimulation.dao;

import com.cg.phonesimulation.bean.PhoneBean;

public interface PhoneDao {

	public PhoneBean searchContact(String name);

	public boolean callContact(String name);

	public boolean messageContact(String name);

}
