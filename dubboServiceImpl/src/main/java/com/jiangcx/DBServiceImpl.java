package com.jiangcx;

import org.springframework.stereotype.Service;

@Service("dBServiceImpl")
public class DBServiceImpl implements DBService{
    @Override
    public String getData(String name) {
        return "name="+name;
    }
}
