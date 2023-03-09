package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vistas.*;


import org.junit.Assert;
import org.junit.Before;


import java.util.ArrayList;
import java.util.logging.Logger;

class TestKing {
	Logger logger;

    private King kingBlack;
    //private King kingWhite;
    ChessGameBoard chessGameBoard;

    @Before
    public void setUp(){
       

        chessGameBoard = new ChessGameBoard();
        kingBlack=new King(chessGameBoard,0,4,0);//row=0; col=4; color=0 black
        //KingWhite=new King(chessGameBoard,7,4,0);//row=7; col=4; color=1 white
    }

    @Test
    public void calculatePossibleMovesKingBlack(){
        ArrayList<String> expected=new ArrayList<>();

  
    }
}
