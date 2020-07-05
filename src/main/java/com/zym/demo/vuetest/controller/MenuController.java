package com.zym.demo.vuetest.controller;

import com.zym.demo.vuetest.model.MenuInfoModel;
import com.zym.demo.vuetest.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/menu")
public class MenuController {

    @Autowired
    private IMenuService menuService;

    @PostMapping("")
    public String addMenu(@RequestBody MenuInfoModel menuInfoModel){
        this.menuService.addMenu(menuInfoModel);
        return "sucess";
    }

    @GetMapping("")
    public List<MenuInfoModel> getMenuList(){
        return this.menuService.geeMenuList();
    }

    @GetMapping("/{id}")
    public MenuInfoModel getMenuById(@PathVariable (value = "id") String id){
        return this.menuService.getMenuById(id).get();
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable (value = "id") String id){
        this.menuService.deleteMenuById(id);
        return "success";
    }
}
