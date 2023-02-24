package com.romario.JenkinsMicro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class Controller {

    @RequestMapping(value = "/home")
    public String home(){
        return "Hola Jenkins";
    }
}
