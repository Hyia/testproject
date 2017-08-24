package com.spring.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.*;
import com.spring.service.*;

@Controller
public class PhoneController {
	
	private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);
	
    @Autowired
    @Qualifier("phoneService")
    private IServicePhone phonesrv;

    @RequestMapping(value = "phone/writeonelist", method = RequestMethod.GET)
    public String writeone(Model model) {
        logger.info("writeonelist");
        
        List<ModelPhone> phone = phonesrv.getPhoneList();
        
        model.addAttribute("phone", phone);
        
        return "phone/writeOneResult";
    }
    
}
