package com.accenture.utilities;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="RegistraitionData")

public class RegData {
	private List<DataXml> regdata;

	@XmlElement(name="data")
	public void setUserData(List<DataXml> d)
	{
		this.regdata = d;
	}

	public List<DataXml> getUserData()
	{
		return regdata;
	}

}