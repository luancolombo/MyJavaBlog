package com.lemare.myjavablog.controllers;

import com.lemare.myjavablog.models.Post;
import com.lemare.myjavablog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    PostService service;

    @RequestMapping(value="/posts", method= RequestMethod.GET)
    public ModelAndView getPosts(){
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = service.findAll();
        mv.addObject("posts", posts);
        return mv;
    }
}
