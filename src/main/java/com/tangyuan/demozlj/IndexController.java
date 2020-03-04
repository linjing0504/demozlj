package com.tangyuan.demozlj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;
import java.util.Calendar;

import java.text.SimpleDateFormat;


@Controller
public class IndexController {
    @RequestMapping("/index")
    @ResponseBody
    private Map<String,String> index(){
        System.out.print("wowowowo!!");
        Map map= new HashMap<String,String>();
        map.put("key","vule");
        return map;
    }

    @RequestMapping("/tanghong")
    @ResponseBody
    private Map<String,String> tanghong(){
        System.out.print("wowowowo!!");
        Map map= new HashMap<String,String>();
        map.put("tanghong","tangyuan");
        return map;
    }

    @RequestMapping("/time")
    @ResponseBody
    private Map<String,String> time(){
        System.out.print("wowowowo!!");

        /////////time////////
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
        String hehe = dateFormat.format( now );

        ////////////

        Map map= new HashMap<String,String>();
        map.put("currenttime",hehe);
        return map;
    }
}

