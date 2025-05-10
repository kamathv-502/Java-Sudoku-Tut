import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sudoku {

  class Tile extends JButton {
    int row;
    int col;

    Tile(int row, int col) {
      this.row = row;
      this.col = col;
    }
  }

  int boardWidth = 600;
  int boardHeight = 650;

  String[] puzzle = {
      "--74916-5",
      "2---6-3-9",
      "-----7-1-",
      "-586----4",
      "--3----9-",
      "--62--187",
      "9-4-7---2",
      "67-83----",
      "81--45---"
  };

  String[] solution = {
      "387491625",
      "241568379",
      "569327418",
      "758619234",
      "123784596",
      "496253187",
      "934176852",
      "675832941",
      "812945763"
  };

  JFrame frame = new JFrame("Sudoku");
  JLabel textLabel = new JLabel();
  JPanel textPanel = new JPanel();
  JPanel boardPanel = new JPanel();

  public Sudoku() {

    frame.setSize(boardWidth, boardHeight);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setLayout(new BorderLayout());

    textLabel.setText("Sudoku: 0");
    textLabel.setFont(new Font("Arial", Font.BOLD, 30));
    textLabel.setHorizontalAlignment(JLabel.CENTER);

    textPanel.add(textLabel);
    frame.add(textPanel, BorderLayout.NORTH);

    boardPanel.setLayout(new GridLayout(9, 9));
    setupTiles();
    frame.add(boardPanel, BorderLayout.CENTER);

    frame.setVisible(true);
  }

  void setupTiles() {
    for (int row = 0; row < 9; row++) {
      for (int col = 0; col < 9; col++) {
        Tile tile = new Tile(row, col);
        char tileChar = puzzle[row].charAt(col);
        if (tileChar != '-') {
          tile.setFont(new Font("Arial", Font.BOLD, 20));
          tile.setBackground(Color.LIGHT_GRAY);

          tile.setText(String.valueOf(tileChar));
          tile.setEnabled(false);
        } else {
          tile.setFont(new Font("Arial", Font.PLAIN, 20));
          tile.setBackground(Color.WHITE);

          tile.setText("");
          tile.setEnabled(true);
        }

        tile.setFocusable(false);
        boardPanel.add(tile);
      }
    }
  }
}