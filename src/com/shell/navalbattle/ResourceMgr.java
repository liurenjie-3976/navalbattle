/**
 * @author YC 03/30/2020
 */

package com.shell.navalbattle;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ResourceMgr {
    public static BufferedImage submarineYellowL, submarineYellowU, submarineYellowR, submarineYellowD;
    public static BufferedImage submarineGreenL, submarineGreenU, submarineGreenR, submarineGreenD;
    public static BufferedImage bubbleBlue;
    public static BufferedImage[] explodes = new BufferedImage[16];


    static {
        try {
            // degree = -180 for flip horizontally
            submarineYellowR = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/submarineYellow.png"));
            submarineYellowD = ImageUtil.rotateImage(submarineYellowR, -90);
            submarineYellowU = ImageUtil.rotateImage(submarineYellowR, 90);
            submarineYellowL = ImageUtil.rotateImage(submarineYellowR, -180);

            submarineGreenR = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/submarineGreen.png"));
            submarineGreenD = ImageUtil.rotateImage(submarineGreenR, -90);
            submarineGreenU = ImageUtil.rotateImage(submarineGreenR, 90);
            submarineGreenL = ImageUtil.rotateImage(submarineGreenR, -180);

            bubbleBlue = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bubbleBlue.png"));

//            for(int i=0; i<16; i++)
//                explodes[i] = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/e" + (i+1) + ".gif"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}