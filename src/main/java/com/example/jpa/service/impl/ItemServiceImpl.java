package com.example.jpa.service.impl;

import com.example.jpa.model.Item;
import com.example.jpa.repository.ItemRepository;
import com.example.jpa.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public List<Item> list() {
        return itemRepository.findAll().stream().map( (list) -> Item.builder()
                .id(list.getId())
                .name(list.getName())
                .build()).collect(Collectors.toList());
    }
}
