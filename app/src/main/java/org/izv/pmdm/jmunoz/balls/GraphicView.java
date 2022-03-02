package org.izv.pmdm.jmunoz.balls;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.Random;

public class GraphicView extends View {
    public Paint ball1, ball2,ball3,ball4,ball5,ball6,ball7,ball8,ball9,ball10,ball11,ball12;

    private static final int RADIO = 50 ;

    private int posX1,posX2,posX3,posX4, posX5, posX6, posX7, posX8, posX9, posX10, posX11, posX12;
    private int posY1, posY2,posY3,posY4, posY5, posY6, posY7, posY8, posY9, posY10, posY11, posY12;
    private int velX1,velX2,velX3,velX4, velX5, velX6, velX7,velX8,velX9,velX10,velX11,velX12;
    private int velY1,velY2,velY3,velY4,velY5,velY6,velY7,velY8,velY9,velY10,velY11,velY12;
    private int w, limitW, h, limitH;
    private int random1, random2,random3,random4;
    private boolean check1, check2, check3, check4;



    public GraphicView(Context context, AttributeSet attr) {
        super(context, attr);
        createBalls();
        getspeed();

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldW, int oldH) {
        posX1 = new Random().nextInt(w);  posY1 = new Random().nextInt(h);
        posX2 = new Random().nextInt(w);  posY2 = new Random().nextInt(h);
        posX3 = new Random().nextInt(w);  posY3 = new Random().nextInt(h);
        posX4 = new Random().nextInt(w);  posY4 = new Random().nextInt(h);
        posX5 = new Random().nextInt(w);  posY5 = new Random().nextInt(h);
        posX6 = new Random().nextInt(w);  posY6 = new Random().nextInt(h);
        posX7 = new Random().nextInt(w);  posY7 = new Random().nextInt(h);
        posX8 = new Random().nextInt(w);  posY8 = new Random().nextInt(h);
        posX9 = new Random().nextInt(w);  posY9 = new Random().nextInt(h);
        posX10 = new Random().nextInt(w);  posY10 = new Random().nextInt(h);
        posX11 = new Random().nextInt(w);  posY11 = new Random().nextInt(h);
        posX12 = new Random().nextInt(w);  posY12 = new Random().nextInt(h);
    }

    protected void onDraw(Canvas c) {
        /*----------MOVES-----------*/
        mov();
        /*----------SIZES-----------*/
        w = getWidth(); h = getHeight();
        limitW = w - RADIO; limitH = h - RADIO;
        /*----------DIRECTION-----------*/
        direction();
        /*----------DRAW-----------*/
        drawBalls(c);

        postInvalidateDelayed(100);

    }

    protected void createBalls(){

        ball1 = new Paint();
        ball2 = new Paint();
        ball3 = new Paint();
        ball4 = new Paint();
        ball5 = new Paint();
        ball6 = new Paint();
        ball7 = new Paint();
        ball8 = new Paint();
        ball9 = new Paint();
        ball10 = new Paint();
        ball11 = new Paint();
        ball12 = new Paint();

        ball1.setColor(Color.BLUE);
        ball2.setColor(Color.BLUE);
        ball3.setColor(Color.BLUE);

        ball4.setColor(Color.YELLOW);
        ball5.setColor(Color.YELLOW);
        ball6.setColor(Color.YELLOW);

        ball7.setColor(Color.GREEN);
        ball8.setColor(Color.GREEN);
        ball9.setColor(Color.GREEN);

        ball10.setColor(Color.RED);
        ball11.setColor(Color.RED);
        ball12.setColor(Color.RED);

    }

    protected void getspeed(){

        if(MainActivity.mode == 1){
            velX1 = 40; velY1 = -40;
            velX2 = -40; velY2 = 40;
            velX3 = -40; velY3 = -40;
            velX4 = 40; velY4 = 40;
            velX5 = 40; velY5 = -40;
            velX6 = -40; velY6 = 40;
        }
        else if(MainActivity.mode == 2){
            velX1 = -80; velY1 = 80;
            velX2 = 80; velY2 = -80;
            velX3 = -80; velY3 = -80;
            velX4 = 80; velY4 = 80;
            velX5 = -80; velY5 = 80;
            velX6 = 80; velY6 = -80;
            velX7 = -80; velY7 = -80;
            velX8 = 80; velY8 = 80;
            velX9 = -80; velY9 = 80;
        }
        if(MainActivity.mode == 3){
            velX1 = -140; velY1 = 140;
            velX2 = 140; velY2 = -140;
            velX3 = -140; velY3 = -140;
            velX4 = 140; velY4 = 140;
            velX5 = -140; velY5 = 140;
            velX6 = 140; velY6 = -140;
            velX7 = -140; velY7 = -140;
            velX8 = 140; velY8 = 140;
            velX9 = -140; velY9 = 140;
            velX10 = 140; velY10 = -140;
            velX11 = -140; velY11 = -140;
            velX12 = 140; velY12 = 140;
        }

    }

    protected void direction(){
       /*------------------BLUE-----BALLS----------------------*/
        if ( posX1 >= limitW ) { posX1 = limitW; velX1 *= -1; }     if ( posX1 <= RADIO) { posX1 = RADIO ; velX1 *= -1;}    if ( posY1 >= limitH) { posY1 = limitH; velY1 *= -1;}   if ( posY1 <= RADIO) { posY1 = RADIO ; velY1 *= -1;}
        if ( posX2 >= limitW ) { posX2 = limitW; velX2 *= -1; }     if ( posX2 <= RADIO) { posX2 = RADIO ; velX2 *= -1;}    if ( posY2 >= limitH) { posY2 = limitH; velY2 *= -1;}   if ( posY2 <= RADIO) { posY2 = RADIO ; velY2 *= -1;}
        if ( posX3 >= limitW ) { posX3 = limitW; velX3 *= -1; }     if ( posX3 <= RADIO) { posX3 = RADIO ; velX3 *= -1;}    if ( posY3 >= limitH) { posY3 = limitH; velY3 *= -1;}   if ( posY3 <= RADIO) { posY3 = RADIO ; velY3 *= -1;}
        if ( posX4 >= limitW ) { posX4 = limitW; velX4 *= -1; }     if ( posX4 <= RADIO) { posX4 = RADIO ; velX4 *= -1;}    if ( posY4 >= limitH) { posY4 = limitH; velY4 *= -1;}   if ( posY4 <= RADIO) { posY4 = RADIO ; velY4 *= -1;}
        if ( posX5 >= limitW ) { posX5 = limitW; velX5 *= -1; }     if ( posX5 <= RADIO) { posX5 = RADIO ; velX5 *= -1;}    if ( posY5 >= limitH) { posY5 = limitH; velY5 *= -1;}   if ( posY5 <= RADIO) { posY5 = RADIO ; velY5 *= -1;}
        if ( posX6 >= limitW ) { posX6 = limitW; velX6 *= -1; }     if ( posX6 <= RADIO) { posX6 = RADIO ; velX6 *= -1;}    if ( posY6 >= limitH) { posY6 = limitH; velY6 *= -1;}   if ( posY6 <= RADIO) { posY6 = RADIO ; velY6 *= -1;}
        if ( posX7 >= limitW ) { posX7 = limitW; velX7 *= -1; }     if ( posX7 <= RADIO) { posX7 = RADIO ; velX7 *= -1;}    if ( posY7 >= limitH) { posY7 = limitH; velY7 *= -1;}   if ( posY7 <= RADIO) { posY7 = RADIO ; velY7 *= -1;}
        if ( posX8 >= limitW ) { posX8 = limitW; velX8 *= -1; }     if ( posX8 <= RADIO) { posX8 = RADIO ; velX8 *= -1;}    if ( posY8 >= limitH) { posY8 = limitH; velY8 *= -1;}   if ( posY8 <= RADIO) { posY8 = RADIO ; velY8 *= -1;}
        if ( posX9 >= limitW ) { posX9 = limitW; velX9 *= -1; }     if ( posX9 <= RADIO) { posX9 = RADIO ; velX9 *= -1;}    if ( posY9 >= limitH) { posY9 = limitH; velY9 *= -1;}   if ( posY9 <= RADIO) { posY9 = RADIO ; velY9 *= -1;}
        if ( posX10 >= limitW ) { posX10 = limitW; velX10 *= -1; }     if ( posX10 <= RADIO) { posX10 = RADIO ; velX10 *= -1;}    if ( posY10 >= limitH) { posY10 = limitH; velY10 *= -1;}   if ( posY10 <= RADIO) { posY10 = RADIO ; velY10 *= -1;}
        if ( posX11 >= limitW ) { posX11 = limitW; velX11 *= -1; }     if ( posX11 <= RADIO) { posX11 = RADIO ; velX11 *= -1;}    if ( posY11 >= limitH) { posY11 = limitH; velY11 *= -1;}   if ( posY11 <= RADIO) { posY11 = RADIO ; velY11 *= -1;}
        if ( posX12 >= limitW ) { posX12 = limitW; velX12 *= -1; }     if ( posX12 <= RADIO) { posX12 = RADIO ; velX12 *= -1;}    if ( posY12 >= limitH) { posY12 = limitH; velY12 *= -1;}   if ( posY12 <= RADIO) { posY12 = RADIO ; velY12 *= -1;}



    }

    protected void mov(){

        posX1 += velX1; posY1 += velY1;
        posX2 += velX2; posY2 += velY2;
        posX3 += velX3; posY3 += velY3;
        posX4 += velX4; posY4 += velY4;
        posX5 += velX5; posY5 += velY5;
        posX6 += velX6; posY6 += velY6;
        posX7 += velX7; posY7 += velY7;
        posX8 += velX8; posY8 += velY8;
        posX9 += velX9; posY9 += velY9;
        posX10 += velX10; posY10 += velY10;
        posX11 += velX11; posY11 += velY11;
        posX12 += velX12; posY12 += velY12;

    }

    protected void drawBalls(Canvas c){

        if(MainActivity.mode == 1){
            /*------BLUE--------*/
            if(!check1) {
                random1 = 1 + new Random().nextInt(3);
                check1 =true;
            }
            switch(random1){
                case 1:  c.drawCircle(posX1, posY1, RADIO, ball1); Log.v("xyzyx" , " 1 ball blue");break;
                case 2:  c.drawCircle(posX1, posY1, RADIO, ball1); c.drawCircle(posX2, posY2, RADIO, ball2);Log.v("xyzyx" , " 2 ball blue");break;
                case 3:  c.drawCircle(posX1, posY1, RADIO, ball1); c.drawCircle(posX2, posY2, RADIO, ball2);c.drawCircle(posX3, posY3, RADIO, ball3);Log.v("xyzyx" , " 3 ball blue");break;
            }
            MainActivity.numBlue = random1;
            Log.v("xyzyx" , MainActivity.numBlue+" 1");
            /*------YELLOW-------*/
            if(!check2) {
                random2 = 1 + new Random().nextInt(3);
                check2 = true;
            }
            switch(random2){
                case 1:  c.drawCircle(posX4, posY4, RADIO, ball4); Log.v("xyzyx" , " 1 ball yellow");break;
                case 2:  c.drawCircle(posX4, posY4, RADIO, ball4); c.drawCircle(posX5, posY5, RADIO, ball5);Log.v("xyzyx" , " 2 ball yellow");break;
                case 3:  c.drawCircle(posX4, posY4, RADIO, ball4); c.drawCircle(posX5, posY5, RADIO, ball5);c.drawCircle(posX6, posY6, RADIO, ball6);Log.v("xyzyx" , " 3 ball yellow");break;
            }
            MainActivity.numYellow = random2;
            Log.v("xyzyx" , MainActivity.numYellow+" 1");
        }
        else if(MainActivity.mode == 2){

            /*------BLUE--------*/
            if (!check1) {
                random1= 1+ new Random().nextInt(2);
                check1 = true;
            }

            switch(random1){
                case 1:  c.drawCircle(posX1, posY1, RADIO, ball1); break;
                case 2:  c.drawCircle(posX1, posY1, RADIO, ball1); c.drawCircle(posX2, posY2, RADIO, ball2);break;
                case 3:  c.drawCircle(posX1, posY1, RADIO, ball1); c.drawCircle(posX2, posY2, RADIO, ball2);c.drawCircle(posX3, posY3, RADIO, ball3);break;
            }
            MainActivity.numBlue = random1;
            Log.v("xyzyx" , MainActivity.numBlue+" 2");
            /*------YELLOW-------*/
            if(!check2) {
                random2 = 1 + new Random().nextInt(2);
                check2 = true;
            }
            switch(random2){
                case 1:  c.drawCircle(posX4, posY4, RADIO, ball4); break;
                case 2:  c.drawCircle(posX4, posY4, RADIO, ball4); c.drawCircle(posX5, posY5, RADIO, ball5);break;
                case 3:  c.drawCircle(posX4, posY4, RADIO, ball4); c.drawCircle(posX5, posY5, RADIO, ball5);c.drawCircle(posX6, posY6, RADIO, ball6);break;
            }
            MainActivity.numYellow = random2;
            Log.v("xyzyx" , MainActivity.numYellow+" 2");
            /*-------GREEN---------*/
            if(!check3) {
                random3 = 1 + new Random().nextInt(2);
                check3 = true;
            }
            switch(random3){
                case 1:  c.drawCircle(posX7, posY7, RADIO, ball7); break;
                case 2:  c.drawCircle(posX7, posY7, RADIO, ball7); c.drawCircle(posX8, posY8, RADIO, ball8);break;
                case 3:  c.drawCircle(posX7, posY7, RADIO, ball7); c.drawCircle(posX8, posY8, RADIO, ball8);c.drawCircle(posX9, posY9, RADIO, ball9);break;
            }
            MainActivity.numGreen = random3;
            Log.v("xyzyx" , MainActivity.numGreen+" 2");
        }
        else if(MainActivity.mode == 3){

            /*------BLUE--------*/
            if(!check1) {
                random1 = 1 + new Random().nextInt(2);
                check1 = true;
            }
            switch(random1){
                case 1:  c.drawCircle(posX1, posY1, RADIO, ball1); break;
                case 2:  c.drawCircle(posX1, posY1, RADIO, ball1); c.drawCircle(posX2, posY2, RADIO, ball2);break;
                case 3:  c.drawCircle(posX1, posY1, RADIO, ball1); c.drawCircle(posX2, posY2, RADIO, ball2);c.drawCircle(posX3, posY3, RADIO, ball3);break;
            }
            MainActivity.numBlue = random1;
            Log.v("xyzyx" , MainActivity.numBlue+" 3");
            /*------YELLOW-------*/
            if(!check2) {
                random2 = 1 + new Random().nextInt(2);
                check2 = true;
            }
            switch(random2){
                case 1:  c.drawCircle(posX4, posY4, RADIO, ball4); break;
                case 2:  c.drawCircle(posX4, posY4, RADIO, ball4); c.drawCircle(posX5, posY5, RADIO, ball5);break;
                case 3:  c.drawCircle(posX4, posY4, RADIO, ball4); c.drawCircle(posX5, posY5, RADIO, ball5);c.drawCircle(posX6, posY6, RADIO, ball6);break;
            }
            MainActivity.numYellow = random2;
            Log.v("xyzyx" , MainActivity.numYellow+" 3");
            /*-------GREEN---------*/
            if(!check3) {
                random3 = 1 + new Random().nextInt(2);
                check3 = true;
            }
            switch(random3){
                case 1:  c.drawCircle(posX7, posY7, RADIO, ball7); break;
                case 2:  c.drawCircle(posX7, posY7, RADIO, ball7); c.drawCircle(posX8, posY8, RADIO, ball8);break;
                case 3:  c.drawCircle(posX7, posY7, RADIO, ball7); c.drawCircle(posX8, posY8, RADIO, ball8);c.drawCircle(posX9, posY9, RADIO, ball9);break;
            }
            MainActivity.numGreen = random3;
            Log.v("xyzyx" , MainActivity.numGreen+" 3");
            /*-------RED----------*/
            if(!check4) {
                random4 = 1 + new Random().nextInt(2);
                check4 = true;
            }
            switch(random4){
                case 1:  c.drawCircle(posX10, posY10, RADIO, ball10); break;
                case 2:  c.drawCircle(posX10, posY10, RADIO, ball10); c.drawCircle(posX11, posY11, RADIO, ball11);break;
                case 3:  c.drawCircle(posX10, posY10, RADIO, ball10); c.drawCircle(posX11, posY11, RADIO, ball11);c.drawCircle(posX12, posY12, RADIO, ball12);break;
            }
            MainActivity.numRed = random4;
            Log.v("xyzyx" , MainActivity.numRed+" 3");
        }

    }

}

