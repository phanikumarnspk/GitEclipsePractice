package com.slokam;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class test {

	public static void main(String[] args) {

		Resource r = new ClassPathResource("NewFile.xml");

		BeanFactory f = new XmlBeanFactory(r);

		 Student s =  (Student) f.getBean("std");
		System.out.println(s);

	}

}
