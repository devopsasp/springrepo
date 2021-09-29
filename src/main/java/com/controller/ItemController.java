package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Item;
import com.model.ItemService;

@RestController
public class ItemController {
	@Autowired
	ItemService itemService;

	@GetMapping("/getitems")
	@ResponseBody
	public List<Item> getItems()
	{
	  return itemService.getAll();	
	}
	
	@PostMapping("/saveitem")
	@ResponseBody
	public Item saveItem(@RequestBody Item item)
	{
		itemService.saveItem(item);
		return item;
	}
}
