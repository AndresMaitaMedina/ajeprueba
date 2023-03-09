package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vistas.*;


import org.junit.Assert;
import org.junit.Before;


import java.util.ArrayList;
import java.util.logging.Logger;

class TestPawn {
	 Logger logger;

	    Pawn pawnBlack;
	    ChessGameBoard chessGameBoard;
	   

	    @Before
	    public void setUp(){
	        logger = Logger.getLogger(TestPawn.class.getName());

	        chessGameBoard=new ChessGameBoard();
	    
	        pawnBlack=new Pawn(chessGameBoard,1,1,0);//row=1;col=[0,7];color=0 black
	        //pawnWhite=new Pawn(chessGameBoard,6,1,1);//row=6;col=[0,7];color=1 white

	    }

	    @Test
	    public void calculatePossibleMovesPawnBlack(){
	        ArrayList<String> expected=new ArrayList<>();
	        expected.add("2,1");
	        expected.add("3,1");

	    }

}
