package com.zym.demo.pattendemo.template;

public class DefinedQuery extends QueryTemplate{

    private Defined defined;

    public void setDefined(Defined defined){
        this.defined = defined;
    }

    @Override
    public String query(String query) {
        return defined.query(query);
    }

    @Override
    public boolean isDetail() {
        return true;
    }
}
