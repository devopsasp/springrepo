package com.model;
import java.util.*;

import org.springframework.stereotype.Component;
@Component
public interface ItemDAO {
	public void saveItem(Item item);
	public List<Item> findAll();

}
