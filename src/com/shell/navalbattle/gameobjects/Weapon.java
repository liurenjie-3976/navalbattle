/**
 * @author YC 03/30/2020
 */

package com.shell.navalbattle.gameobjects;

import com.shell.navalbattle.*;
import com.shell.navalbattle.utils.PropertyMgr;
import com.shell.navalbattle.utils.ResourceMgr;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Weapon extends AbstractGameObject {
    private int xPos, yPos;
    private Groups group;
    private Directions dir;
    private boolean alive;
    private BufferedImage currImage;
    private int speed = Integer.parseInt(PropertyMgr.getConfig("defaultSpeed"));

    public Weapon (int x, int y, Groups g, Directions d) {
        this.xPos = x;
        this.yPos = y;
        this.group = g;
        this.alive = true;

        if (g == Groups.Enemy) {
            this.currImage = ResourceMgr.bubbleBlue;
            this.dir = Directions.L;
        } else {
            this.currImage = ResourceMgr.bubbleRainbow;
            if (d == Directions.L) {
                this.dir = d;
            } else this.dir = Directions.R;
        }
    }

    public void paint(Graphics g) throws IOException {
        g.drawImage(currImage, xPos + currImage.getWidth() / 2, yPos, null);
        move();
    }

    public int getPosX() {
        return this.xPos;
    }

    public int getPosY() {
        return this.yPos;
    }

    public int getWidth() { return this.currImage.getWidth(); }

    public int getHeight() { return this.currImage.getHeight(); }

    public boolean isAlive() {
        return this.alive;
    }

    public void setAlive(Boolean status) {
        this.alive = status;
    }

    public void setSpeed(int i) {
        this.speed = i;
    }

    public void setImage(BufferedImage img) {
        this.currImage = img;
    }

    public Groups getGroup() {
        return this.group;
    }

    private void move() {
        // check if out of boundary
        boundaryCheck();

        if (!this.alive) return;

        // move when alive
        switch (this.dir) {
            case L:
                this.xPos -= speed;
                break;
            case R:
                this.xPos += speed;
                break;
//            case U:
//                this.yPos += SPEED;
//                break;
//            case D:
//                this.yPos -= SPEED;
//                break;
        }
    }

    private void boundaryCheck() {
        if (xPos > NavalFrame.FRAME_WIDTH || xPos < NavalFrame.FRAME_LOCATION_X
                || yPos > NavalFrame.FRAME_HEIGHT || yPos < NavalFrame.FRAME_LOCATION_Y) {
            setAlive(false);
        }
    }
}
