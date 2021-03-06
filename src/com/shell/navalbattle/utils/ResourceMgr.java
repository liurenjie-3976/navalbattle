/**
 * @author YC 03/30/2020
 */

package com.shell.navalbattle.utils;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ResourceMgr {
    public static BufferedImage submarineYellowU, submarineYellowR, submarineYellowD, submarineYellowRM, submarineYellowRS;
    public static BufferedImage submarineYellowL, submarineYellowLM, submarineYellowLS;
    public static BufferedImage submarineGreenL, submarineGreenU, submarineGreenR, submarineGreenD;
    public static BufferedImage submarineDarkBlueR, submarineDarkBlueL;
    public static BufferedImage submarinePinkR, submarinePinkL;
    public static BufferedImage bubbleBlue, bubbleRainbow, bubbleRainbowBig;
    public static BufferedImage seagrassFix, seagrassFloat;
    public static BufferedImage[] explodes = new BufferedImage[8];


    static {
        try {
            // degree = -180 for flip horizontally
            submarineYellowR = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/submarineYellow.png"));
            submarineYellowD = ImageUtil.rotateImage(submarineYellowR, -90);
            submarineYellowU = ImageUtil.rotateImage(submarineYellowR, 90);
            submarineYellowL = ImageUtil.rotateImage(submarineYellowR, -180);
            submarineYellowRM = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/submarineYellowM.png"));
            submarineYellowRS = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/submarineYellowS.png"));

            submarineYellowLM = ImageUtil.rotateImage(submarineYellowRM, -180);
            submarineYellowLS = ImageUtil.rotateImage(submarineYellowRS, -180);

            submarineGreenR = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/submarineGreen.png"));
            submarineGreenD = ImageUtil.rotateImage(submarineGreenR, -90);
            submarineGreenU = ImageUtil.rotateImage(submarineGreenR, 90);
            submarineGreenL = ImageUtil.rotateImage(submarineGreenR, -180);

            submarineDarkBlueR = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/submarineDarkBlue.png"));
            submarineDarkBlueL = ImageUtil.rotateImage(submarineDarkBlueR, -180);

            submarinePinkR = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/submarinePink.png"));
            submarinePinkL = ImageUtil.rotateImage(submarinePinkR, -180);

            bubbleBlue = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bubbleBlue.png"));
            bubbleRainbow = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bubbleRainbow.png"));
            bubbleRainbowBig = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bubbleRainbowBig.png"));

            seagrassFix = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/seagrass.png"));
            seagrassFloat = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/seagrassFloat.png"));

            for(int i = 0; i < explodes.length; i++)
                explodes[i] = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/e" + (i + 1) + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
