package com.zym.demo.vuetest.model;

import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
@Table( name = "t_zym_menu_info")
public class MenuInfoModel {

    @Id
    @Column( name = "id")
    private String id;

    @Column( name = "name")
    private String name;

    @Column ( name = "code")
    private String code;

    @Column ( name = "description")
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
