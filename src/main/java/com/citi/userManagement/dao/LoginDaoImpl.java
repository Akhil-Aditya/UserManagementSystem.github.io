package com.citi.userManagement.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.citi.userManagement.beans.Registration;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Repository
public class LoginDaoImpl implements LoginDao{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public Registration ValidateUser(String soeId, String password) {
		System.out.println("dao" + soeId);
		System.out.println("dao" + password);
		Registration user = null;
		String res = "";
	    String result ="";
		try {
			String sql = "select roleId from Registration where soe_Id=:soeId and password=:password";
			Query query = (Query)entityManager.createQuery(sql);
			query.setParameter("soeId", soeId);
			System.out.println(soeId);
			
			query.setParameter("password", password);
			System.out.println(password);
			
			int role = (Integer) query.getSingleResult();
			System.out.println(Integer.toString(role));
			String sql3 = "select user from Registration user where soe_id=:soeId";
			Query query3 = (Query)entityManager.createQuery(sql3);
			query3.setParameter("soeId", soeId);
			System.out.println(soeId);
			user = (Registration) query3.getSingleResult();
			
			
//			String sql2 = "select roleName from Roles where roleId=:role";
//			Query query2 = (Query)entityManager.createQuery(sql2);
//			query2.setParameter("role", role);
//			res = (String) query2.getSingleResult();
//			ObjectWriter ow = new ObjectMapper().writer(); //important 
//			 result= ow.writeValueAsString(res);
//			 System.out.println(":"+result);
			 
		} catch (Exception e) {
			System.out.println("Invalid Credentials " + e.getMessage());
		}
		return user;
	}

	@Override
	public Registration ViewUserDetails(String soeId) {
		String sql = "select user from Registration user where soe_id=:soeId";
		Query query = (Query)entityManager.createQuery(sql);
		query.setParameter("soeId", soeId);
		System.out.println(soeId);
		Registration user = (Registration) query.getSingleResult();
		return user;
	}
}
