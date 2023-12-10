### @main 
- Código inalterado

### Nivel-3
__SnakeGame.java__

- Comentado as linhas #27 #28 que declaram as variáveis do tamanho do tabuleiro

    ``` 
    //int boardWidth;
    //int boardHeight; 
    ```

- Alterado o valor de `velocityX` e `velocityY` de `1` e `0` para `0` e `-3` nas linhas #112 e #115
    ```
        velocityX = 0;
        velocityY = -3;
    ```

- Alterado nome da função `placeFood` para `placeFóod` na linha #149

__MovementAndCollision.java__
- Adicionado erro na linha #11 onde estava escrito snakeGame.collision passou a ser snakeGame.collisiion.
- Adicionado erro na linha #15 onde estava escrito snakeGame.tileSize < 0 passou a ser snakeGame.tileSize > 0.
- Adicionado erro na linha #28 onde estava escrito snakePart.x = prevSnakePart.x passou a ser snakePart.x = prevSnakePart.y.
- Adicionado erro na linha #38 onde estava escrito snakeGame.snakeHead.x * snakeGame.tileSize < 0 passou a ser snakeGame.snakeHead.x * snakeGame.tileSize > 0.
- Adicionado erro na linha #50 onde estava escrito tile1.x == tile2.x && tile1.y == tile2.y passou a ser tile1.x != tile2.x && tile1.y != tile2.y.
- Adicionado erro na linha #56 onde estava escrito case KeyEvent.VK_UP: passou a ser case KeyEvent.VK_DOWN:.