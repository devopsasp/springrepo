package com.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	@Autowired
    ItemDAO itemDAOImpl	;
	public void saveItem(Item item)
	{
		itemDAOImpl.saveItem(item);
	}
	public List<Item> getAll()
	{
		return itemDAOImpl.findAll();
	}

}
