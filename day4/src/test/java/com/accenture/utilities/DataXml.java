package com.accenture.utilities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="data")

public class DataXml {

	private String Firstname;

	private String Lastname;



	@XmlElement(name="Firstname")
	public void setFname(String f)
	{
		this.Firstname=f;
	}

	public String getFname()
	{
		return Firstname;
	}

	@XmlElement(name="Lastname")
	public String getLname() {
		return Lastname;
	}

	public void setLname(String lastname) {
		Lastname = lastname;
	}

}