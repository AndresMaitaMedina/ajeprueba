package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vistas.*;


import org.junit.Assert;
import org.junit.Before;


import java.util.ArrayList;
import java.util.logging.Logger;
class TestBishop {

    Logger logger;

    Bishop bishopBlack;
    //Bishop bishopWhite;
    ChessGameBoard chessGameBoard;

    @Before
    public void before(){
        logger = Logger.getLogger(TestBishop.class.getName());

        chessGameBoard=new ChessGameBoard();
        bishopBlack=new Bishop(chessGameBoard,0,2,0);//row=0; col=2,5; color=0 black
        //bishopBlack=new Bishop(chessGameBoard,7,2,0);//row=7; col=2,5; color=1 black
    }

    @Test
    public void calculatePossibleMovesBishopBlack(){
        ArrayList<String> expected=new ArrayList<>();

        
    }

    @Test
    public void calculatePossibleMovesBishopBlack2(){
        ArrayList<String> expected=new ArrayList<>();
        expected.add("1,3");
        expected.add("2,4");
        expected.add("3,5");
        expected.add("4,6");
        expected.add("5,7");
        expected.add("1,1");
        expected.add("2,0");


    }
}
