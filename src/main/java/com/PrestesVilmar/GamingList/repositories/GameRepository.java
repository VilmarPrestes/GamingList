package com.PrestesVilmar.GamingList.repositories;

import com.PrestesVilmar.GamingList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game, Long> {//acessa (consulta) os dados


}
