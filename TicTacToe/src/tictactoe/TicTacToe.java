/*
 * Filename TicTacToe.java
 * Written by Thando Ngwenya
 * Written on 13/04/2020
 * Description : Two players alternate placing Xs and Os into a grid until one player has three matching symbols
   in a row, horizontally, vertically, or diagonally. This app is a game in which the user is presented with a 
   three-by-three grid containing the digits 1 through 9. When the user chooses a position by typing a number, 
   an X is placed in the appropriate spot. It generates a random number for the position where the computer will
   place an O. It does not allow the player or the computer to place a symbol where one has already been placed.
   When either the player or the computer has three symbols in a row, a winner is declared; if all positions 
   have been exhausted and no one has three symbols in a row, a tie is  declared. 
 */
package tictactoe;
import javax.swing.JOptionPane;
public class TicTacToe 
{
    public static void main(String[] args) 
    {
        int[][] count = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        int row, column, position;
        JOptionPane.showMessageDialog(null,"Welcome to Tic Tac Tow.\n"
                + "You will have X and the computer will have O.");
        position = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter the position where you want to play"));
        int pos[] = new int[2];        
        extractRowColumn(position, pos);
        column = pos[0];
        row = pos[1];
        if(position == 0)
        {
            position = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Invalid entry! Please enter a number between 1 and 9 inclusive"));
            extractRowColumn(position, pos);
            column = pos[0];
            row = pos[1];
        }
        if(row < count.length && column < count[row].length)
        {
            count[row][column]++;
            for(int r = 0; r < count.length; ++r)
            {
                for(int c = 0; c < count[r].length; ++c)
                   JOptionPane.showMessageDialog(null, count[r][c] + " " + "\n");
            }
        }
    }
    private static int[] extractRowColumn(int position, int[] pos)
    {
        int row;
        if(position > 0 && position <= 3)
        {
            pos[0] = 0;
            pos[1] = getRow(position);
        }
        else if(position > 3 && position <= 6)
        {
            pos[0] = 1;
            pos[1] = 3 - getRow(position);
        }
        else if(position > 6 && position <= 9)
        {
            pos[0] = 2;
            pos[1] = 6 - getRow(position);
        }
        else 
            position = 0;
        return pos;
    }
    private static int getRow(int position) 
    {
        int row = position - 1;
        return row;
    }
}