package untilz;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class loadSave {

    public static final String PLAYER_ATLAS = "F:\\javaGame\\java_game\\src\\res\\player_sprites.png";
    public static final String LEVEL_ATLAS = "F:\\javaGame\\java_game\\src\\res\\outside_sprites.png";

    public static BufferedImage GetSpriteAtlas(String fileNamne){
        BufferedImage img = null;
        File f = null;
        
        try {
            f = new File(""+ fileNamne);
            img = ImageIO.read(f);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }

}
