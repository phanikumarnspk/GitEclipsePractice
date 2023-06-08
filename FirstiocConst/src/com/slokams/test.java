package com.slokams;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.slokam.Student;

public class test {

		
		
		public static void main(String[] args) {

			Resource r = new ClassPathResource("NewFile.xml");

			BeanFactory f = new XmlBeanFactory(r);

			 Student s =  (Student) f.getBean("std");
			System.out.println(s);

		}

	
	}

