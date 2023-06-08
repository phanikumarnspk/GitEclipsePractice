package com.cisco;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class teststd {

	public static void main(String[] args) {
		
		

		
		    Resource r= new ClassPathResource("NewFile.xml");
				
			BeanFactory f= new XmlBeanFactory(r);
				
				
				
				 
		         Student s= (Student) f.getBean("std1");
		        Student s1= (Student) f.getBean("std2");
				 
		        Student s2= (Student) f.getBean("std3");
				 
				 System.out.println(s);
				System.out.println(s1);
				 System.out.println(s2);
				 

	}

}
