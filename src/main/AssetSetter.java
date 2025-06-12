package main;

import objects.OBJ_Chest;
import objects.OBJ_Door;
import objects.OBJ_Key;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        
        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 56 * gp.tileSize;
        gp.obj[0].worldY = 29 * gp.tileSize;

        gp.obj[1] = new OBJ_Key();
        gp.obj[1].worldX =  54 * gp.tileSize;
        gp.obj[1].worldY = 21 * gp.tileSize;

        gp.obj[2] = new OBJ_Key();
        gp.obj[2].worldX =  14 * gp.tileSize;
        gp.obj[2].worldY = 20 * gp.tileSize;

        gp.obj[3] = new OBJ_Door();
        gp.obj[3].worldX =  37 * gp.tileSize;
        gp.obj[3].worldY = 41 * gp.tileSize;

        gp.obj[4] = new OBJ_Door();
        gp.obj[4].worldX =  37 * gp.tileSize;
        gp.obj[4].worldY = 43 * gp.tileSize;

        gp.obj[5] = new OBJ_Door();
        gp.obj[5].worldX =  37 * gp.tileSize;
        gp.obj[5].worldY = 45 * gp.tileSize;

        gp.obj[6] = new OBJ_Chest();
        gp.obj[6].worldX =  41 * gp.tileSize;
        gp.obj[6].worldY = 43 * gp.tileSize;

    }
}
