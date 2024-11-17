package com.PrestesVilmar.GamingList.services;

import com.PrestesVilmar.GamingList.dto.GameDTO;
import com.PrestesVilmar.GamingList.dto.GameMinDTO;
import com.PrestesVilmar.GamingList.entities.Game;
import com.PrestesVilmar.GamingList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired //injeção de componentes
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        //TODO: tratamento de exceção
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
