package main;
import java.awt.*;
import javax.swing.*;

import inputs.KeyBoardInput;
import inputs.MouseInput;

import static main.Game.GAME_HEIGHT;
import static main.Game.GAME_WIDTH;;

public class GamePanel extends JPanel{
    private MouseInput mouseInput;

    private Game game;

    public GamePanel(Game game){
        mouseInput = new MouseInput(this);
        this.game = game;
        setPanelSize();
        addKeyListener(new KeyBoardInput(this));
        addMouseListener(mouseInput);
        addMouseMotionListener(mouseInput);
    }

    private void setPanelSize() {
        Dimension size = new Dimension(GAME_WIDTH,GAME_HEIGHT);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
        System.out.println("size: "+ GAME_WIDTH + " : " + GAME_HEIGHT);
    }

    public void updateGame(){

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        game.render(g);
    }

    public Game getGame()
    {
        return game;
    }

}
