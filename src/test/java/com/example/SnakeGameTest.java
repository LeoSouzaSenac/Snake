package com.example;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.awt.event.*;


public class SnakeGameTest
{

    private static SnakeGame snakeGame;

    @Before
    public void setUp() {
        snakeGame = new SnakeGame(100, 100);
        snakeGame.velocityX = 1;
        snakeGame.velocityY = 0;
    }


    @Test
    public void testBoardSize(){
        
        assertEquals(100, snakeGame.boardWidth);
        assertEquals(100, snakeGame.boardHeight);
    }

    @Test
    public void testSnakeHeadPosition(){
        
        assertEquals(5, snakeGame.snakeHead.x);
        assertEquals(5, snakeGame.snakeHead.y);
    }

    @Test
    public void testFoodPosition(){

        //assertEquals(10, snakeGame.food.x);
        //assertEquals(10, snakeGame.food.y);
    }


    @Test
    public void testGameOver(){

        assertFalse(snakeGame.gameOver);

    }


    //Testa a função placeFood()
    @Test
    public void testPlaceFood(){

        //Inicializa a posição inicial da comida (no código fonte, esta posição é x10 e y10)
        int initialX = snakeGame.food.x;
        int initialY = snakeGame.food.y;

        //Troca a posição inicial por outra aleatória
        snakeGame.placeFood();

        //Verifica se a posição trocou
        assertNotEquals(initialX, snakeGame.food.x);
        assertNotEquals(initialY, snakeGame.food.y);



    }


   


    //Testa a função move
    @Test
    public void testMove() {
        
        
        // Move snake with initial direction
        snakeGame.move();
        
        // Assert snake head position changed
        assertEquals(6, snakeGame.snakeHead.x);
        assertEquals(5, snakeGame.snakeHead.y);
        
        
        // Change direction and move again
        snakeGame.velocityY = 1;
        snakeGame.velocityX = 0;
        snakeGame.move();
        
        // Assert snake head position changed again
        assertEquals(6, snakeGame.snakeHead.x);
        assertEquals(6, snakeGame.snakeHead.y);
    }

    //Testa a mudança de direção ao pressionar as teclas
    @Test
    public void testKeyPressedUP() {
              
              
        // Pressiona a tecla UP
        snakeGame.keyPressed(new KeyEvent(snakeGame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_UP, 'W'));
        assertEquals(0, snakeGame.velocityX);
        assertEquals(-1, snakeGame.velocityY);

       
    }

    @Test
    public void testKeyPressedDown() {

       
        // Pressiona a tecla DOWN
        snakeGame.keyPressed(new KeyEvent(snakeGame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_DOWN, 'S'));
        assertEquals(0, snakeGame.velocityX);
        assertEquals(1, snakeGame.velocityY);

       

    }

    @Test
    public void testKeyPressedLeft(){

        snakeGame.velocityX = 0;

         // Pressiona a tecla LEFT
        snakeGame.keyPressed(new KeyEvent(snakeGame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT, 'A'));
        assertEquals(-1, snakeGame.velocityX);
        assertEquals(0, snakeGame.velocityY);

        
    }
    
    @Test
    public void testKeyPressedRight(){
        // Pressiona a tecla RIGHT
        snakeGame.keyPressed(new KeyEvent(snakeGame, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_RIGHT, 'D'));
        assertEquals(1, snakeGame.velocityX);
        assertEquals(0, snakeGame.velocityY);
    }

    @Test
    public void testCollisionWithBody() {
         snakeGame = new SnakeGame(100, 100);
        // Testa a colisão da cabeça da cobra com o corpo

        // Adiciona alguns ladrilhos ao corpo da cobra
        //snakeGame.snakeBody.add(new SnakeGame.Tile(5, 5));
        snakeGame.snakeBody.add(snakeGame.new Tile(5,5));
        snakeGame.snakeBody.add(snakeGame.new Tile(5,6));
        snakeGame.snakeBody.add(snakeGame.new Tile(5,7));
        

        // Configura a posição da cabeça da cobra
        snakeGame.snakeHead = snakeGame.new Tile(5, 5);

        // Deve retornar verdadeiro, pois a cabeça da cobra colide com o corpo
        assertTrue(snakeGame.collision(snakeGame.snakeHead, snakeGame.snakeBody.get(0)));

        // Move a cabeça da cobra para uma posição diferente
        snakeGame.snakeHead = snakeGame.new Tile(8, 4);

        // Deve retornar falso agora, pois não há colisão com o corpo
        assertFalse(snakeGame.collision(snakeGame.snakeHead, snakeGame.snakeBody.get(0)));
    }


    



}