package com.capgemini.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean, DisposableBean {
	
	private String msg;
	private int count;
	
	public Hello() {
		System.out.println("Object created");
	}
	public Hello(String msg, int count) {
		this.msg=msg;
		this.count=count;
	}
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("afterProperties");
	 * 
	 * 
	 * }
	 */
	
	@PostConstruct
	public void init() {
		System.out.println("init method");
	}
	@PreDestroy
	@Override
	public void destroy() {
		System.out.println("destroy method");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		 System.out.println("afterProperties");
	}

}
