package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vistas.*;


import org.junit.Assert;
import org.junit.Before;


import java.util.ArrayList;
import java.util.logging.Logger;
class TestQueen {

	Logger logger;

    private Queen queenBlack;
    //private Queen queenWhite;
    ChessGameBoard chessGameBoard;

    @Before
    public void setUp(){
        logger = Logger.getLogger(TestBishop.class.getName());

        chessGameBoard = new ChessGameBoard();
        queenBlack = new Queen(chessGameBoard,0,3,0);
        //queenWhite=new Queen(chessGameBoard,7,3,0);
    }

    @Test
    public void calculatePossibleMovesQueenBlack(){
        ArrayList<String> expected=new ArrayList<>();

  

    }

    @Test
    public void calculatePossibleMovesQueenBlack2(){
        ArrayList<String> expected=new ArrayList<>();
        expected.add("1,3");
        expected.add("2,3");
        expected.add("3,3");
        expected.add("4,3");
        expected.add("5,3");
        expected.add("6,3");

    
    }

}
