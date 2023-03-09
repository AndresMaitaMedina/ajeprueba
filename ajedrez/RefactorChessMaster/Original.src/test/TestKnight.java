package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vistas.*;


import org.junit.Assert;
import org.junit.Before;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

class TestKnight {

	Logger logger;

    Knight caballoBlack;
    //Knight caballoWhite;
    ChessGameBoard chessGameBoard;

    @Before
    public void before(){
        logger = Logger.getLogger(TestKnight.class.getName());
        chessGameBoard=new ChessGameBoard();
        caballoBlack=new Knight(chessGameBoard,0,1,0);//row=0; col=1,6; color=0 black
        //caballoWhite=new Knight(chessGameBoard,7,1,0);//row=7; col=1,6; color=1 white
    }

    @Test
    public void testCalculatePossibleMovesKnightBlack1(){
        List<String> esperado=new ArrayList<>();
        esperado.add("2,2");
        esperado.add("2,0");

    }

    @Test
    public void testCalculatePossibleMovesKnightBlack2(){
        List<String> esperado=new ArrayList<>();
        esperado.add("2,2");
        esperado.add("2,0");
        esperado.add("1,3");


    }


}
