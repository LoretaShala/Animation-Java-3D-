import javax.vecmath.*;
import java.awt.*;
import java.awt.event.*;
import javax.media.j3d.*;
import com.sun.j3d.utils.geometry.*;

public class Boshti extends Shape3D
{
   public Boshti(double x)
   {
      GeometryInfo gi = new GeometryInfo(GeometryInfo.POLYGON_ARRAY);
      
         //k. e parë 
      Point3d[] vertices = {
         new Point3d(1+x,0,0+x),//0
         new Point3d(0.8+x,0,0.4+x),//1
         new Point3d(0.7+x,0,0.7+x),//2
         new Point3d(0.4+x,0,0.8+x),//3
         new Point3d(0+x,0,1+x),//4
         
         
         //k. e dytë
         new Point3d(-0.4-x,0,0.8+x),//5
         new Point3d(-0.7-x,0,0.7+x),//6
         new Point3d(-0.8-x,0,0.4+x),//7
         new Point3d(-1-x,0,0+x),//8
         
         
         //k. e tretë
         new Point3d(-0.8-x,0,-0.4-x),//9
         new Point3d(-0.7-x,0,-0.7-x),//10
         new Point3d(-0.4-x,0,-0.8-x),//11
         new Point3d(0+x,0,-1-x),//12
         
         
         
         //k. e katërt
         new Point3d(0.4+x,0,-0.8-x),//13
         new Point3d(0.7+x,0,-0.7-x),//14
         new Point3d(0.8+x,0,-0.4-x),//15
         //new Point3d(1,0,0),
         
         new Point3d(1+x,0.02,0+x),//16
         new Point3d(0.8+x,0.02,0.4+x),//17
         new Point3d(0.7+x,0.02,0.7+x),//18
         new Point3d(0.4+x,0.02,0.8+x),//19
         new Point3d(0+x,0.02,1+x),//20
         
         
         //k. e dytë
         new Point3d(-0.4-x,0.02,0.8+x),//21
         new Point3d(-0.7-x,0.02,0.7+x),//22
         new Point3d(-0.8-x,0.02,0.4+x),//23
         new Point3d(-1-x,0.02,0+x),//24
         
         
         //k. e tretë
         new Point3d(-0.8-x,0.02,-0.4-x),//25
         new Point3d(-0.7-x,0.02,-0.7-x),//26
         new Point3d(-0.4-x,0.02,-0.8-x),//27
         new Point3d(0+x,0.02,-1-x),//28
         
         
         
         //k. e katërt
         new Point3d(0.4+x,0.02,-0.8-x),//29
         new Point3d(0.7+x,0.02,-0.7-x),//30
         new Point3d(0.8+x,0.02,-0.4-x),//31
         //new Point3d(1,0,0)
         };
         
      
                 //këmba e parë
      int[] indices = {0,1,2,3, 4,5,6,7 ,8,9,10,11, 12,13,14,15, 16,17,18,19, 20,21,22,23 ,24,25,26,27 ,28,29,30,31,  0,16,17,2,  2,17,18,3 ,
         3,18,19,4, 4,19,20,5 ,5,20,21,6, 6,21,22,7, 7,22,23,8, 8,23,24,9 ,9,24,25,10 ,10,25,26,11,  11,26,27,12  ,12,27,28,13 ,13,28,29,14,
          14,29,30,15 ,15,30,31,16, 16,31,16,0, 0,16,17,1, 1,17,18,2 ,24,25,26,27 ,28,29,30,31,  0,16,17,2,  2,17,18,3 
          ,0,1,2,3, 4,5,6,7   };
          
      gi.setCoordinates(vertices);
      gi.setCoordinateIndices(indices);
          //këmba e parë
      int[] stripCounts = 
         {4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4 };
    
      
      gi.setStripCounts(stripCounts);
      
      NormalGenerator ng = new NormalGenerator();
      ng.generateNormals(gi);
      this.setGeometry(gi.getGeometryArray());
   }
}
