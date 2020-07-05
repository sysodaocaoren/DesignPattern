package com.zym.demo.vuetest.service;

import com.zym.demo.vuetest.dao.IMenuDao;
import com.zym.demo.vuetest.model.MenuInfoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service("menuService")
public class MenuServiceImpl implements IMenuService{

    @Autowired
    private IMenuDao menuDao;

    @Override
    public void addMenu(MenuInfoModel menuInfoModel) {
        if(StringUtils.isEmpty(menuInfoModel.getId())){
            menuInfoModel.setId(UUID.randomUUID().toString());
        }
        this.menuDao.save(menuInfoModel);
    }

    @Override
    public List<MenuInfoModel> geeMenuList() {
        return this.menuDao.findAll();
    }

    @Override
    public Optional<MenuInfoModel> getMenuById(String id) {
        return this.menuDao.findById(id);
    }

    @Override
    public void deleteMenuById(String id) {
        this.menuDao.deleteById(id);
    }
}
