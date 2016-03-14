Design Document for Team P's MineSweeper
===

## Overview
This program lets us play the game MineSweeper. It is organized into an MVC model, where MineField, Square, and Scoreboard are the model, MakeBoard presents the view, and MineSweeper is our controller.

## Classes
### `MineSweeper`
This class is our controller class. It has a MakeBoard and a Scoreboard for presenting the game to the user and a MineField for user interactions with the game board. It is responsible for taking in, interpreting, and carrying out user commands.

### `MineField`
The MineField class has a 2D array of Squares. It has a constructor which randomly mines a certain number of Squares within that array and accessor methods for various field of the class. It also has methods that return a certain square from within the array, and one that returns the array itself. It contains an inspect method, which recursively checks for the number of mines adjacent to the current square.

### 'Square'
The Square class keeps track of whether or not that Square is flagged or mined and how many mines there are in the Squares adjacent to it. It contains accessor and mutator methods for its fields, and a toString method that returns a String representation of the Square.

### 'MakeBoard'
The MakeBoard class is our view class, which prints out a visual interpretation of the current state of the game board.

### 'Scoreboard'
The Scoreboard class keeps track of how many games the user has won or lost while the program has been running.
