package com.model;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
@Component
public class ItemDAOImpl implements ItemDAO {

	SessionFactory sessionFactory;
	@Override
	public void saveItem(Item item) {
		// TODO Auto-generated method stub
      Session session=sessionFactory.openSession();
      Transaction tx=session.beginTransaction();
      session.save(item);
      session.flush();
      tx.commit();
	}

	@Override
	public List<Item> findAll() {
		
		Session session=sessionFactory.openSession();
		List<Item> itemList=session.createQuery("select i from Item i").getResultList();
		return itemList;
		// TODO Auto-generated method stub

	}
	

}
