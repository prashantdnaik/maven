package com.serviceinfotech;

import com.serviceinfotech.controllers.SessionScopedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SessionScopeController {


    @Autowired
    private SessionScopedBean sessionScopedBean;


    @RequestMapping(value = "/sessionScope/{value}", method = RequestMethod.GET)
    public @ResponseBody
    String getAssignedValue(@PathVariable String value) {
        sessionScopedBean.setValue(value);
        return "home";
    }

}
