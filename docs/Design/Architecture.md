Design Document for Team P's MineSweeper
===

## Overview
This program lets us play the game MineSweeper. It is organized into an MVC model, where `MineField`, `Square`, and `Scoreboard` are the model, `MakeBoard` presents the view, and `MineSweeper` is our controller.

## Classes
### `MineSweeper`
This class is our controller class. It has a `Scoreboard` for keeping track of the number of games won/lost and a `MineField` for user interactions with the game board. It is responsible for taking in, interpreting, and carrying out user commands.

### `MineField`
The `MineField` class has a 2D array of `Square`s. It has a constructor which randomly mines a certain number of `Square`s within that array and accessor methods for various field of the class. It also has methods that return a certain `Square` from within the array, and one that returns the array itself. It contains an `inspect()` method, which recursively checks for the number of mines adjacent to the current square.

### `Square`
The `Square` class keeps track of whether or not that `Square` is flagged or mined and how many mines there are in the `Square`s adjacent to it. It contains accessor and mutator methods for its fields, and a `toString()` method that returns a String representation of the `Square`.

### `MakeBoard`
The `MakeBoard` class is our view class, which prints out a visual interpretation of the current state of the game board. Our team decided to separate this into a separate class rather than have a `toString()` method in `MineField` in order to make it easier to see which sections represented whih parts of the MVC model and make it clearer for those working on the different classes. This class calls various methods to interact with the `Square`'s `toString()` method as well as some of `Minefield`'s methods.

### `Scoreboard`
The `Scoreboard` class keeps track of how many games the user has won or lost while the program has been running.
