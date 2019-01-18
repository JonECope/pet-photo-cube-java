import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Processing_Files extends PApplet {

PImage img1, img2, img3, img4, img5, img6;
float r; //rotation
float dw;

public void setup() {
  
  img1 = loadImage("uno.jpg");
  img2 = loadImage("dos.jpg");
  img3 = loadImage("tres.jpg");
  img4 = loadImage("quatro.jpg");
  img5 = loadImage("cinco.jpg");
  img6 = loadImage("seis.jpg");
  imageMode(CENTER);
  noCursor();
  dw = displayWidth/4;
}

public void draw() {
  background(0);
  lights();
  
  
  r += 0.01f;
  
  translate(displayWidth/2, displayHeight/2);
  rotateZ(r);
  rotateX(map(mouseY, 0, width, 5*-PI, 5*PI));
  rotateY(map(mouseX, height, 0, 5*-PI, 5*PI));

  
  //image1
  pushMatrix(); //store current transformation state
  translate(0, 0, .5f*dw);
  image(img1, 0, 0, dw, dw);
  rectMode(CENTER);
  fill(255, 255, 255, mouseX/5);
  stroke(0);
  rect(0, 0, dw, dw);
  popMatrix(); //restore previous transformation state
  
  //image2
  pushMatrix(); //store current transformation state
  translate(0, 0, -.5f*dw);
  image(img2, 0, 0, dw, dw);
  rectMode(CENTER);
  fill(255, 255, 255, mouseX/5);
  stroke(0);
  rect(0, 0, dw, dw);
  popMatrix(); //restore previous transformation state
  
  //image3
  pushMatrix(); //store current transformation state
  rotateY(HALF_PI);
  translate(0, 0, -.5f*dw);
  image(img3, 0, 0, dw, dw);
  rectMode(CENTER);
  fill(255, 255, 255, mouseX/5);
  stroke(0);
  rect(0, 0, dw, dw);
  popMatrix(); //restore previous transformation state
  
  //image4
  pushMatrix(); //store current transformation state
  rotateY(HALF_PI);
  translate(0, 0, .5f*dw);
  image(img4, 0, 0, dw, dw);
  rectMode(CENTER);
  fill(255, 255, 255, mouseX/5);
  stroke(0);
  rect(0, 0, dw, dw);
  popMatrix(); //restore previous transformation state
  
  //image5
  pushMatrix(); //store current transformation state
  rotateX(HALF_PI);
  translate(0, 0, .5f*dw);
  image(img5, 0, 0, dw, dw);
  rectMode(CENTER);
  fill(255, 255, 255, mouseX/5);
  stroke(0);
  rect(0, 0, dw, dw);
  popMatrix(); //restore previous transformation state
  
  //image6
  pushMatrix(); //store current transformation state
  rotateX(HALF_PI);
  translate(0, 0, -.5f*dw);
  image(img6, 0, 0, dw, dw);
  rectMode(CENTER);
  fill(255, 255, 255, mouseX/5);
  stroke(0);
  rect(0, 0, dw, dw);
  popMatrix(); //restore previous transformation state
}
  public void settings() {  fullScreen(P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Processing_Files" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
