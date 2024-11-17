package com.PrestesVilmar.GamingList.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable //encapsula 2 atributos em uma classe só
public class BelongingPK {

    @ManyToOne //mapeamento de chave estrangeira
    @JoinColumn (name = "game_id") //config chave estrangeira
    private Game game;

    @ManyToOne
    @JoinColumn (name = "list_id")
    private GameList list;

    public BelongingPK(){

    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(game, that.game) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }
}

