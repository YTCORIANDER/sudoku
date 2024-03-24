# Sudoku Solver
Welcome to the Sudoku Solver! 🧩 This repository provides Java implementations for solving standard Sudoku puzzles and unique diagonal Sudoku puzzles.

## About
Sudoku is a popular number puzzle game that challenges players to fill a 9x9 grid with digits so that each column, each row, and each of the nine 3x3 subgrids contain all of the digits from 1 to 9. This project offers solutions for verifying the validity of Sudoku solutions and checking for uniqueness along the main and anti-diagonals in unique diagonal Sudoku puzzles.

## Features
- **Sudoku Class:** Represents a standard Sudoku puzzle with methods for validation and checking solutions.
- **UniqueDiagonalSudoku Class:** Extends the Sudoku class to support unique diagonal Sudoku puzzles, ensuring uniqueness along the main and anti-diagonals.
- **Solver Methods:** Includes methods for checking rows, columns, boxes, and entire puzzles for validity and solution correctness.
- **Test Cases:** Provides predefined test cases to verify the functionality of the solver methods and ensure accurate Sudoku solving.

## Getting Started
To start using the Sudoku Solver:

1. Clone this repository: `git clone https://github.com/YTCORIANDER/sudoku.git`
2. Utilize the provided classes and methods to integrate Sudoku solving into your Java applications.
3. Explore the various solver methods and test cases to understand how to validate and solve Sudoku puzzles effectively.

## Usage
To use the Sudoku Solver in your Java project, follow these steps:

1. Import the necessary classes into your Java file:
    ```java
    import yourpackage.Sudoku;
    import yourpackage.UniqueDiagonalSudoku;
    ```

2. Create instances of Sudoku puzzles using the provided constructors, passing the initial grid as input:
    ```java
    int[][] sudokuGrid = {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    Sudoku sudoku = new Sudoku(sudokuGrid);
    ```

3. Use the provided methods to solve or validate the Sudoku puzzle:
    ```java
    boolean isValidSolution = sudoku.isValidSolution();
    System.out.println("Is the solution valid? " + isValidSolution);
    ```

4. For unique diagonal Sudoku puzzles, use the `UniqueDiagonalSudoku` class:
    ```java
    int[][] uniqueDiagonalSudokuGrid = {
        {1, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 3, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 4, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 5, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 6, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 7, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 8, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 9}
    };

    UniqueDiagonalSudoku uniqueDiagonalSudoku = new UniqueDiagonalSudoku(uniqueDiagonalSudokuGrid);
    boolean isValidUniqueDiagonalSolution = uniqueDiagonalSudoku.isValidSolution();
    System.out.println("Is the unique diagonal solution valid? " + isValidUniqueDiagonalSolution);
    ```

## Contributing
Contributions to the Sudoku Solver are welcome! Whether you're improving existing functionality, adding new features, or fixing bugs, your contributions are appreciated. Please refer to the [contributing guidelines](CONTRIBUTING.md) for more information.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Resources
- [Sudoku Rules](https://www.sudokuessentials.com/rules.html): Official rules and strategies for playing Sudoku.
- [Sudoku Dragon](https://www.sudokudragon.com/): A comprehensive resource for Sudoku enthusiasts, offering solving techniques, puzzles, and more.

## Contact
For any questions or suggestions regarding the Sudoku Solver, feel free to reach out.

Happy Sudoku solving! 🧠🔢
