package com.example;

import java.awt.*;
import javax.swing.JPanel;

/*Esta classe é responsável por desenhar o jogo na tela. */
public class SnakeDraw extends JPanel {
    private SnakeGame snakeGame;

    SnakeDraw(SnakeGame snakeGame) {
        this.snakeGame = snakeGame;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        for (int i = 0; i < snakeGame.boardWidth / snakeGame.tileSize; i++) {
            g.drawLine(i * snakeGame.tileSize, 0, i * snakeGame.tileSize, snakeGame.boardHeight);
            g.drawLine(0, i * snakeGame.tileSize, snakeGame.boardWidth, i * snakeGame.tileSize);
        }

        g.setColor(Color.red);
        g.fill3DRect(snakeGame.food.x * snakeGame.tileSize, snakeGame.food.y * snakeGame.tileSize, snakeGame.tileSize, snakeGame.tileSize, true);

        g.setColor(Color.green);
        g.fill3DRect(snakeGame.snakeHead.x * snakeGame.tileSize, snakeGame.snakeHead.y * snakeGame.tileSize, snakeGame.tileSize, snakeGame.tileSize, true);

        for (int i = 0; i < snakeGame.snakeBody.size(); i++) {
            SnakeGame.Tile snakePart = snakeGame.snakeBody.get(i);
            g.fill3DRect(snakePart.x * snakeGame.tileSize, snakePart.y * snakeGame.tileSize, snakeGame.tileSize, snakeGame.tileSize, true);
        }

        g.setFont(new Font("Arial", Font.PLAIN, 16));
        if (snakeGame.gameOver) {
            g.setColor(Color.red);
            g.drawString("Game Over: " + String.valueOf(snakeGame.snakeBody.size()), snakeGame.tileSize - 16, snakeGame.tileSize);
        } else {
            g.drawString("Score: " + String.valueOf(snakeGame.snakeBody.size()), snakeGame.tileSize - 16, snakeGame.tileSize);
        }
    }
}
