package com.javappa.postmemberof.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javappa.postmemberof.dto.ItemDTOResponse;
import com.javappa.postmemberof.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	
	private ItemRepository itemRepository;

	@Autowired
	public ItemServiceImpl(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@Override
	public List<ItemDTOResponse> getItems() {

		List<ItemDTOResponse> items = itemRepository.findAllNotAssignedToUser().stream()
				.map(item -> new ItemDTOResponse(item.getId(), item.getName())).collect(Collectors.toList());
		return items;
	}
}
