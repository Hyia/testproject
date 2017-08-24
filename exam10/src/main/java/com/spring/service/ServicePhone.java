package com.spring.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.dao.IDaoPhone;
import com.spring.model.ModelPhone;


@Service("phoneService")
public class ServicePhone implements IServicePhone {
    
    // SLF4J Logging
    private static Logger logger = LoggerFactory.getLogger(ServicePhone.class);

    @Autowired
    @Qualifier("phoneDao")
    IDaoPhone dao;

    @Override
    public List<ModelPhone> getPhoneList() {
        List<ModelPhone> result = null;
        try {
            result = dao.getPhoneList();
        } catch (Exception e) {
            logger.error("getPhoneList" + e.getMessage() );
        }        
        return result;
    }
}
