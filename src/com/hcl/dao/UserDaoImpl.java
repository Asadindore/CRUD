package com.hcl.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hcl.model.User;

@Repository
public class UserDaoImpl implements Userdao {
	
	@Autowired
	private HibernateTemplate template;

	
	
	/*
	public HibernateTemplate getTemplate() {
		return template;
	}


	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
*/

	@Autowired
	private SessionFactory sessionfactory;
	

	@Override
	public void register(User user) {
	
	sessionfactory.getCurrentSession().saveOrUpdate(user);	
		 
	}
	
//	public void add(User user){
//		template.save(user);
//	}
//	

}
