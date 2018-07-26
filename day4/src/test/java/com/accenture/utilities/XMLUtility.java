package com.accenture.utilities;

import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLUtility {
public void readXML() throws JAXBException
	{
	File f = new File("C:\\Java Programs\\PNCSel\\Shahnawaz\\day4\\testdata.xml");
		JAXBContext j = JAXBContext.newInstance(RegData.class);
		Unmarshaller u = j.createUnmarshaller();
		RegData r = (RegData)u.unmarshal(f);
		List<DataXml> mydata = r.getUserData();
		for(DataXml d :mydata)
		{
			System.out.println("Firstname "+d.getFname());
			System.out.println("Lastname "+d.getLname());

		}
	}

	public static void main(String args[]) throws JAXBException
	{
		XMLUtility x = new XMLUtility();
		x.readXML();
	}
}
