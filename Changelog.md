### @main 
- Código inalterado

### Nivel-1
__SnakeGame.java__

- Alterado o valor dos parâmetros da chamada da cabeça da cobra de (5, 5) para (15, 75);

``` snakeHead = new Tile(15, 75); ```
    
__MovementAndCollision.java__

- Alterado o valor inicial para `i` do calculo do for da linha #26 de `-1` para `-4`;

``` for (int i = snakeGame.snakeBody.size() - 4; i >= 0; i--) ```

- Alterado o valor para pegar o segmento anterior na linha #39 de `-1` para `-2`;
``` SnakeGame.Tile prevSnakePart = snakeGame.snakeBody.get(i - 2); ```

- Alterado o valor que velocityY recebe na linha #96 de `1` para `4`;

```
if (snakeGame.velocityY != -1) {
    snakeGame.velocityX = 0;
    snakeGame.velocityY = 4;
}
```

