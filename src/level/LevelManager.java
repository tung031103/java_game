package level;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import main.Game;
import untilz.loadSave;

public class LevelManager {
    private Game game;
    private BufferedImage[] levelSprite;


    public LevelManager(Game game){
        this.game = game;
        // levelSprite = loadSave.GetSpriteAtlas(loadSave.LEVEL_ATLAS);
        importOutsideSprites();
    }


    

    private void importOutsideSprites() {
        BufferedImage img = loadSave.GetSpriteAtlas(loadSave.LEVEL_ATLAS);
        levelSprite = new BufferedImage[48];
        for(int j=0;j<4;j++){
            for(int i=0;i<12;i++){
                int index = j*12 + i;
                levelSprite[index] = img.getSubimage(i*32, j*32, 32, 32);
            }
        }

    }




    public void draw(Graphics g){
        g.drawImage(levelSprite[2], 0, 0, null);
    }

    public void update(){

    }
}
