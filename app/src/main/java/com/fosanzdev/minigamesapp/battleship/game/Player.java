package com.fosanzdev.minigamesapp.battleship.game;

import com.fosanzdev.battleship.boardLogic.Board;
import com.fosanzdev.battleship.gameLogic.Hit;
import com.fosanzdev.minigamesapp.battleship.board.VBoard;

public abstract class Player {

    private final String name;
    private VBoard vBoard;


    public Player(String name, VBoard vBoard) {
        this.name = name;
        this.vBoard = vBoard;
    }

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public VBoard getvBoard() {
        return vBoard;
    }

    public void setvBoard(VBoard vBoard) {
        this.vBoard = vBoard;
    }

    public void hit(Hit hit){
        vBoard.hit(hit);
    }
}
