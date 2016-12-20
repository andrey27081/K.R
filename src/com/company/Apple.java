package com.company;

/**
 * Created by Andrey on 20.12.2016.
 */
public class Apple {
    Main m;

    public int posX;
    public int posY;


    public Apple( int x, int y){
        posX = x;
        posY = y;
    }
    public void setRandomPosition(){
        posX = (int) (Math.random() * m.WIDTH ); // рандомное координата по X
        posY = (int) (Math.random() * m.HEIGHT ); // рандомная координата по Y
    }
}
