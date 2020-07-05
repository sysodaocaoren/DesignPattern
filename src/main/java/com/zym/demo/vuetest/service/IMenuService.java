package com.zym.demo.vuetest.service;

import com.zym.demo.vuetest.model.MenuInfoModel;

import java.util.List;
import java.util.Optional;

public interface IMenuService {
    void addMenu(MenuInfoModel menuInfoModel);

    List<MenuInfoModel> geeMenuList();

    Optional<MenuInfoModel> getMenuById(String id);

    void deleteMenuById(String id);
}
