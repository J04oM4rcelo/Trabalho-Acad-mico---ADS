package objects;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Chest extends SuperObject {

        public OBJ_Chest() {

        name = "Chest";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/Objects/chest (OLD).png"));

        }catch(IOException e) { // or catch(Exception e)
            e.printStackTrace();
        }
    }

}
