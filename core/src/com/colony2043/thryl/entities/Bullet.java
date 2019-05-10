package com.colony2043.thryl.entities;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Bullet {
    String path = "C:\\Users\\minicodcraft\\Downloads\\game\\core\\assets\\";
    private static final int SPEED = 50;
    private static Texture texture;
    float x, y; // starting positions
    double yPos = Gdx.input.getY(); // the y i want to go to
    double xPos = Gdx.input.getX(); // the x i want to go to
    double xDis = xPos - x;
    double yDis = yPos - y;

    public Bullet(float x, float y) {
        this.x = x;
        this.y = y;

        if (texture == null) {
            texture = new Texture(path + "Bullet.png");
        }
    }


    public  void update (float deltaTime){
        if(yPos >= 0) {
            y += yDis * deltaTime;
        }
        else if(yPos < 0){
            y -= yDis * deltaTime;
        }

        if(xPos >= 0) {
            x += xDis * deltaTime;
        }
        else if(xPos < 0){
            x -= xDis * deltaTime;
        }
    }

    public void render (SpriteBatch batch){
            batch.draw(texture, x, y);
    }
}


