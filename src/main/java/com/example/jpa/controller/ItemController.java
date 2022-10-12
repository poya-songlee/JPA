package com.example.jpa.controller;

import com.example.jpa.model.Item;
import com.example.jpa.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemController {

    private final ItemService itemService;


    @GetMapping("/list")
    public void list(Model model){
        List<Item> itemList = itemService.list();
        itemList.forEach(System.out::println);

        model.addAttribute("itemList", itemList);
    }

    @GetMapping("/item")
    public void item(Model model){

    }
//
//    @GetMapping("/add")
//    public void add(){
//
//    }
//
//    @PostMapping("/add")
//    public void add(){
//
//    }
//
//    @GetMapping("/update")
//    public void update(){
//
//    }
//
//    @PostMapping("/update")
//    public void update(){
//
//    }
//
//    @GetMapping("/delete")
//    public void delete(){
//
//    }

}
