package com.PrestesVilmar.GamingList.services;

import com.PrestesVilmar.GamingList.dto.GameListDTO;
import com.PrestesVilmar.GamingList.dto.GameMinDTO;
import com.PrestesVilmar.GamingList.entities.GameList;
import com.PrestesVilmar.GamingList.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired //injeção de componentes
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
