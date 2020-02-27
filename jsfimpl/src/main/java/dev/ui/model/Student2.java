package dev.ui.model;

import java.util.ArrayList;
import java.util.List;


import javax.enterprise.context.RequestScoped;

import javax.inject.Named;

@Named
@RequestScoped
public class Student2 {

	private String fName;
	private String lName;
	private String country;
	private String code;
	private String eMail;
	private String phone;
	private List<String> appServer;
	private List<String> countryList;
	private List<String> codeList;
	private List<String> appServerList;
	
	public Student2() {	
		fName="Hello";
		lName="World";
		code="Java";
		appServer=new ArrayList<String>();
		appServer.add("WildFly");
		countryList=new ArrayList<String>();
		countryList.add("India");
		countryList.add("USA");
		countryList.add("UK");
		countryList.add("Japan");
		
		codeList=new ArrayList<String>();
		codeList.add("C");
		codeList.add("C++");
		codeList.add("Java");
		codeList.add("PHP");	
		
		appServerList = new ArrayList<String>();
		appServerList.add("JBoss AS");
		appServerList.add("WildFly");
		appServerList.add("Payara");
		appServerList.add("WebLogic");
		appServerList.add("WebSphere");
		appServerList.add("TomEE");
	}
	
	
	public List<String> getAppServerList() {
		return appServerList;
	}

	public void setAppServerList(List<String> appServerList) {
		this.appServerList = appServerList;
	}

	public List<String> getAppServer() {
		return appServer;
	}

	public void setAppServer(List<String> appServer) {
		this.appServer = appServer;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	public List<String> getCodeList() {
		return codeList;
	}

	public void setCodeList(List<String> codeList) {
		this.codeList = codeList;
	}

	public List<String> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<String> countryList) {
		this.countryList = countryList;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
}
