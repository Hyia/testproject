package com.spring.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.spring.model.ModelPhone;

public interface IDaoPhone {
    
    List<ModelPhone> getPhoneList();
}
