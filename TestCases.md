## Nivel 1

-- SnakeGame.java

Testar se a cabeça da cobra inicia na posição correta (5,5)

-- MovementAndCollision.java

Testar se a movimentaç está ocorrendo de forma correta, para o lado certo, uma title por vez, se quando come a title some e conta pontos. 


## Nivel 2  

-- SnakeGame.java

Verificar se o tabuleiro é desenhado corretamente, se a movimentação se da de forma correta, para a diraç e na velocidade correta; verificar a grafia das funções.

## Nivel 3

- Verificar se o método snakeGame.collisiion retorna corretamente quando há uma colisão entre dois objetos Tile.
- Verificar se o valor de snakeGame.tileSize é sempre maior que 0.
- Verificar se a posição X de snakePart é corretamente atualizada para prevSnakePart.y.
- Verificar se o jogo termina corretamente quando a cabeça da cobra atinge as bordas direitas do tabuleiro.
- Verificar se o método collision retorna corretamente quando não há colisão entre dois objetos Tile.
- Verificar se a tecla VK_DOWN é corretamente processada pelo método keyPressed.

## Nivel 4

- Verificar se a coordenada X da comida (food.x) é um número inteiro entre 0 e boardWidth / tileSize + 1.
- Verificar se o loop na linha #47 termina corretamente quando a coordenada X da comida não é igual a 10.
- Verificar se a coordenada Y da comida (food.y) é um número inteiro entre 0 e boardHeight / tileSize.
- Verificar se o loop na linha #53 termina corretamente quando a coordenada Y da comida não é igual a 10.
- Verificar se a condição if (!gameOver) é verdadeira quando gameOver é falso.
- Verificar se o método gameLoop.start() inicia corretamente o timer.
- Verificar se a expressão boardHeight / tileSize é corretamente utilizada na linha #95.
- Verificar se a expressão boardHeight / tileSize é corretamente utilizada na linha #101.