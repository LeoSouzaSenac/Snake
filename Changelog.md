### @main 
- Código inalterado

### Nivel-4
__SnakeGame.java__
- Adicionado erro na linha #45 onde estava escrito `int posX = random.nextInt(boardWidth / tileSize);` passou a ser `int posX = random.nextInt(boardWidth / tileSize + 1);`.
- Adicionado erro na linha #47 onde estava escrito `while (posX == 10) {` passou a ser `while (posX != 10) {.`
- Adicionado erro na linha #51 onde estava escrito `int posY = random.nextInt(boardWidth / tileSize);` passou a ser `int posY = random.nextInt(boardHeight / tileSize);`.
- Adicionado erro na linha #53 onde estava escrito `while (posY == 10) {` passou a ser `while (posY != 10) {`.
- Adicionado erro na linha #79 onde estava escrito `if (gameOver) {` passou a ser `if (!gameOver) {`.
- Adicionado erro na linha #89 onde estava escrito `gameLoop.stop(); `passou a ser `gameLoop.start();`.
- Adicionado erro na linha #95 onde estava escrito `boardWidth / tileSize` passou a ser `boardHeight / tileSize`.
- Adicionado erro na linha #101 onde estava escrito `boardWidth / tileSize` passou a ser `boardHeight / tileSize`.