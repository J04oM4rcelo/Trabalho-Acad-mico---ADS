package objects;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Key extends SuperObject{

    public OBJ_Key() {

        name = "Key";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/Objects/key.png"));

        }catch(IOException e) { // or catch(Exception e)
            e.printStackTrace();
        }
    }

}
