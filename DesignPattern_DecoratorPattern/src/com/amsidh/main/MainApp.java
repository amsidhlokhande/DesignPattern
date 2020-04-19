package com.amsidh.main;

import com.amsidh.intf.Shape;
import com.amsidh.intf.impl.Circle;
import com.amsidh.intf.impl.Rectangle;
import com.amsidh.intf.impl.RedShapeDecorator;

public class MainApp {
  public static void main(String[] args) {
   Shape shape=new Rectangle();
   System.out.println("Rectangle with no color");
   shape.draw();
   
   shape=new RedShapeDecorator(shape);
   System.out.println("Rectangle with color");
   shape.draw();
   
   
   System.out.println("Circle with no color");
   shape=new Circle();
   shape.draw();
   
   System.out.println("Rectangle with color");
   
   shape=new RedShapeDecorator(shape);
   shape.draw();
}
}
