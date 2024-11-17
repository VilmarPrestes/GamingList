package com.PrestesVilmar.GamingList.controllers;


import com.PrestesVilmar.GamingList.dto.GameDTO;
import com.PrestesVilmar.GamingList.dto.GameListDTO;
import com.PrestesVilmar.GamingList.dto.GameMinDTO;
import com.PrestesVilmar.GamingList.services.GameListService;
import com.PrestesVilmar.GamingList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    public GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

}
