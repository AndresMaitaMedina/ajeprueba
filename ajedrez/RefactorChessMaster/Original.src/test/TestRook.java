package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vistas.*;


import org.junit.Assert;
import org.junit.Before;


import java.util.ArrayList;
import java.util.logging.Logger;
class TestRook {

	Logger logger;

    Rook rookBlack;
    //Rook rookWhite;
    ChessGameBoard chessGameBoard;

    @Before
    public void before(){
        logger = Logger.getLogger(TestRook.class.getName());

        chessGameBoard=new ChessGameBoard();
        rookBlack=new Rook(chessGameBoard,0,0,0);//row=0; col=0,7; color=0 black
        //rookWhite=new Rook(chessGameBoard,7,0,1);//row=7; col=0,7; color=1 white
    }

    @Test
    public void calculatePossibleMovesRookBlack(){
        ArrayList<String> expected=new ArrayList<>();

    }

    @Test
    public void calculatePossibleMovesRookBlack2(){
        ArrayList<String> expected=new ArrayList<>();
        expected.add("1,0");
        expected.add("2,0");
        expected.add("3,0");
        expected.add("4,0");
        expected.add("5,0");
        expected.add("6,0");
     
        }

}
