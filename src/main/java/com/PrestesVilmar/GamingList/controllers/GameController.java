package com.PrestesVilmar.GamingList.controllers;


import com.PrestesVilmar.GamingList.dto.GameMinDTO;
import com.PrestesVilmar.GamingList.entities.Game;
import com.PrestesVilmar.GamingList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    public GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

}
