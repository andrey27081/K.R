package com.company;

/**
 * Created by Andrey on 20.12.2016.
 */
public class Snake {
    Main m;
    public int lenght = 2; // изначальная длинна змейки
    public int direction = 1; // переменная описующая движения

    public int sX[] = new int[m.WIDTH*m.HEIGHT]; // мaссив координат змейки по X
    public int sY[] = new int[m.WIDTH*m.HEIGHT]; // массив координат змейки по Y


    public Snake(int x1, int y1, int x2, int y2){
        sX[0] = x1;
        sX[1] = x2;
        sY[0] = y1;
        sY[1] = y2;
    }
    public void move(){

        for(int l = lenght; l > 0; l--){
            sX[l] = sX[l-1]; // при движении змейки, клеточки что б занимали позицию клеточки за которой следуют
            sY[l] = sY[l-1];
        }

        // вверх up
        if(direction == 0) sY[0]--;
        // вправо right
        if(direction == 1) sX[0]++;
        // вниз down
        if(direction == 2) sY[0]++;
        // влево left
        if(direction == 3) sX[0]--;

        if(sY[0] > m.HEIGHT - 1) sY[0] = 0; // если змейка уползает вниз то вылезет сверху
        if(sY[0] < 0 ) sY[0] = m.HEIGHT-1; // если змейка уползает вверх то вылезет снизу
        if(sX[0] > m.WIDTH-1) sX[0] = 0; // если змейка уползает в право то выползает слева
        if(sX[0] < 0) sX[0] = m.WIDTH-1; // если змейка уползает влева то выползает справо

    }
}
