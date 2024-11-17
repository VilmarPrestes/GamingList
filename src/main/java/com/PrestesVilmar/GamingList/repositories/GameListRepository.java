package com.PrestesVilmar.GamingList.repositories;

import com.PrestesVilmar.GamingList.entities.Game;
import com.PrestesVilmar.GamingList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository <GameList, Long> {//acessa (consulta) os dados


}
