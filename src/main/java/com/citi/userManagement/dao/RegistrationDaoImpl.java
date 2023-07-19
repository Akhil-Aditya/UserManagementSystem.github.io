package com.citi.userManagement.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.citi.userManagement.beans.Registration;
import com.citi.userManagement.beans.UserRegistration;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public long addUser(UserRegistration user) {
		System.out.println("inside dao");
		try {
			System.out.println(user.toString());
			em.persist(user);
			System.out.println("added to user_info_table");

		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		return user.getSoeId();
	}

	@Override
	@Transactional
	public List<Registration> viewUsers() {
		String sql = "select users from Registration users";
		Query query = em.createQuery(sql);
		@SuppressWarnings("unchecked")
		List<Registration> userList = query.getResultList();
		return userList;
	}

	@Override
	@Transactional
	public int deletebyUser(String soeId) {
		String sql = "update Registration set active=0 where soe_id=:soeId";
		Query query = em.createQuery(sql);
		query.setParameter("soeId", soeId);
		int rowDeleted = query.executeUpdate();
		return rowDeleted;
		
	}
	
	
	@Override
	@Transactional
	public int updateUser(String soeId, String firstName, String lastName, String city) {
		String sql = "update Registration set firstName=:firstName, lastName=:lastName, city=:city where soe_id=:soeId";
		Query query = em.createQuery(sql);
		query.setParameter("soeId", soeId);
		query.setParameter("firstName", firstName);
		query.setParameter("lastName", lastName);
		query.setParameter("city", city);
		int rowUpdated = query.executeUpdate();
		return rowUpdated;
	}

}
