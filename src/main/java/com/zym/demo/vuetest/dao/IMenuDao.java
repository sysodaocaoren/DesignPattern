package com.zym.demo.vuetest.dao;

import com.zym.demo.vuetest.model.MenuInfoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("memuDao")
public interface IMenuDao extends JpaRepository<MenuInfoModel,String> {
}
