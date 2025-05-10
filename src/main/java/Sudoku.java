import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sudoku {
  int boardWidth = 600;
  int boardHeight = 650;

  JFrame frame = new JFrame("Sudoku");

  public Sudoku() {
    frame.setVisible(true);
    frame.setSize(boardWidth, boardHeight);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setLayout(new BorderLayout());
  }
}