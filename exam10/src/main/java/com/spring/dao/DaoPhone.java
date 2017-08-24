package com.spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.spring.model.ModelPhone;

@Repository("phoneDao")
public class DaoPhone implements IDaoPhone {
    // SLF4J Logging
    private static Logger logger = LoggerFactory.getLogger(DaoPhone.class);
    
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;


    @Override
    public List<ModelPhone> getPhoneList() {
        return session.selectList("mapper.mapperPhone.getPhoneList");  
    }
}
