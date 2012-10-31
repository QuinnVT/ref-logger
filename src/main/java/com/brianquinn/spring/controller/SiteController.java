package com.brianquinn.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.brianquinn.model.Site;
import com.brianquinn.svc.SiteService;

@Controller
@RequestMapping(value="/api/site")
public class SiteController {
	@Autowired
	private SiteService siteService;


    @RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Site> getAllSites() {
        return siteService.getAllSites();
    }

   

}
