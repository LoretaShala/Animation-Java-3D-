import javax.vecmath.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.media.j3d.*;
import java.lang.Object.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.image.TextureLoader.*;
import com.sun.j3d.utils.geometry.*;
import java.applet.*;
import com.sun.j3d.utils.applet.MainFrame;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.universe.*;
import javax.media.j3d.*;
import javax.vecmath.*;
import com.sun.j3d.utils.geometry.*;
import javax.swing.Timer;
import javax.swing.*;
import java.lang.*;
import com.sun.j3d.utils.image.*;
import java.awt.Container;
import com.sun.j3d.utils.behaviors.vp.*;
import com.sun.j3d.loaders.objectfile.ObjectFile; 
import java.net.*;
import java.util.*;

public class PlanetSystem extends Applet 
{
   public static void main(String[] args) 
   {
      new MainFrame(new PlanetSystem(), 1000,600);
    
   }


   public void init()
   { 
      GraphicsConfiguration gc = SimpleUniverse.getPreferredConfiguration();
      Canvas3D cv = new Canvas3D(gc);
      setLayout(new BorderLayout());
      add(cv, BorderLayout.CENTER);
      BranchGroup bg = createSceneGraph();
      bg.compile();
      SimpleUniverse su = new SimpleUniverse(cv);
      su.getViewingPlatform().setNominalViewingTransform();
      su.addBranchGraph(bg);
    
   }
   
   
   private BranchGroup createSceneGraph() 
   {
      BranchGroup root = new BranchGroup();
      TransformGroup spin = new TransformGroup();
      
      spin.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
      root.addChild(spin);
     
      Background back = new Background();
   
   
   //Dielli
      Appearance ap = new Appearance();
      Texture tex = new TextureLoader( "sun.jpg", this).getTexture();
      ap.setTexture( tex );
      Sphere shape = new Sphere(1.0f, Primitive.GENERATE_TEXTURE_COORDS |
         Primitive.GENERATE_NORMALS_INWARD, ap);
      shape.setAppearance(ap);
      Transform3D tr = new Transform3D();
      tr.setScale(0.18);
      TransformGroup tg = new TransformGroup(tr);
      tg.addChild(shape);
      root.addChild(tg);
     
     
   
          
     
     //object: MERCURY
      Appearance ap2 = new Appearance();
      Texture tex2 = new TextureLoader("merkuri.jpg", this).getTexture();   
      ap2.setTexture( tex2 );
      Sphere shape2 = new Sphere( 1.0f, Primitive.GENERATE_TEXTURE_COORDS |
         Primitive.GENERATE_NORMALS_INWARD, ap2 );
      shape2.setAppearance(ap2);    
      Transform3D tr2 = new Transform3D();     
      tr2.setScale(0.02);
      TransformGroup tg2 = new TransformGroup(tr2);    
      Vector3f vector1=new Vector3f(-.22f,0f , 0f);
      tr2.setRotation(new AxisAngle4f(0.0f, 1.0f, 0.0f, 0.1f));
      tr2.setTranslation(vector1);
      tg2.setTransform(tr2);
      spin.addChild(tg2);
      tg2.addChild(shape2);
     
     
     
   
     //object: VENUS
      Appearance ap3 = new Appearance();
      Texture tex3 = new TextureLoader("venus.jpg", this).getTexture();
      ap3.setTexture( tex3 );
      Sphere shape3 = new Sphere( 1.0f, Primitive.GENERATE_TEXTURE_COORDS |
         Primitive.GENERATE_NORMALS_INWARD, ap3 );
      shape3.setAppearance(ap3);   
      Transform3D tr3 = new Transform3D();     
      tr3.setScale(0.025);
      TransformGroup tg3 = new TransformGroup(tr3);
      Vector3f vector2=new Vector3f(-.28f,0f , 0f);
      tr3.setRotation(new AxisAngle4f(0.0f, 1.0f, 0.0f, 0.1f));
      tr3.setTranslation(vector2);
      tg3.setTransform(tr3);
      spin.addChild(tg3);
      tg3.addChild(shape3);
     
       
   
        //object: EARTH
      Appearance ap4 = new Appearance();
      Texture tex4 = new TextureLoader( "earth.jpg", this).getTexture();
      ap4.setTexture( tex4 );
      Sphere shape4 = new Sphere( 1.0f, Primitive.GENERATE_TEXTURE_COORDS |
         Primitive.GENERATE_NORMALS_INWARD, ap4 );
      shape4.setAppearance(ap4);
      Transform3D tr4 = new Transform3D();     
      tr4.setScale(0.026);
      TransformGroup tg4 = new TransformGroup(tr4);      
      Vector3f vector4=new Vector3f(-.35f,0f , 0f);
      tr4.setRotation(new AxisAngle4f(0.0f, 1.0f, 0.0f, 0.1f));
      tr4.setTranslation(vector4);
      tg4.setTransform(tr4);
      spin.addChild(tg4);
      tg4.addChild(shape4);
     
     
     
   //object: MARS
      Appearance ap5 = new Appearance();
      Texture tex5 = new TextureLoader( "mars.jpg", this).getTexture();
      ap5.setTexture( tex5 );
      Sphere shape5 = new Sphere( 1.0f, Primitive.GENERATE_TEXTURE_COORDS |
         Primitive.GENERATE_NORMALS_INWARD, ap5 );
      shape5.setAppearance(ap5);
      Transform3D tr5 = new Transform3D();     
      tr5.setScale(0.02);
      TransformGroup tg5 = new TransformGroup(tr5);      
      Vector3f vector5=new Vector3f(-.41f,0f , 0f);
      tr5.setRotation(new AxisAngle4f(0.0f, 1.0f, 0.0f, 0.1f));
      tr5.setTranslation(vector5);
      tg5.setTransform(tr5);
      spin.addChild(tg5);
      tg5.addChild(shape5);
      
       
     
     
   //object: JUPITER
      Appearance ap6 = new Appearance();
      Texture tex6 = new TextureLoader( "jupiter.jpg", this).getTexture();   
      ap6.setTexture( tex6 );
      Sphere shape6 = new Sphere( 1.0f, Primitive.GENERATE_TEXTURE_COORDS |
         Primitive.GENERATE_NORMALS_INWARD, ap6 );
      shape6.setAppearance(ap6);
      Transform3D tr6 = new Transform3D();     
      tr6.setScale(0.07);
      TransformGroup tg6 = new TransformGroup(tr6);      
      Vector3f vector6=new Vector3f(-.52f,0f , 0f);
      tr6.setRotation(new AxisAngle4f(0.0f, 1.0f, 0.0f, 0.1f));
      tr6.setTranslation(vector6);
      tg6.setTransform(tr6);
      spin.addChild(tg6);
      tg6.addChild(shape6);
      
     
     
      //object: SATURN
      Appearance ap1 = new Appearance();
      Texture tex1 = new TextureLoader( "saturn.jpg", this).getTexture();
      ap1.setTexture( tex1 );
      Sphere shape1 = new Sphere( 1.0f, Primitive.GENERATE_TEXTURE_COORDS |
         Primitive.GENERATE_NORMALS_INWARD, ap1 );
      shape1.setAppearance(ap1);
      Transform3D tr1 = new Transform3D();     
      tr1.setScale(0.06);
      TransformGroup tg1 = new TransformGroup(tr1);
      Vector3f vector=new Vector3f(-.67f,0f , 0f);
      tr1.setRotation(new AxisAngle4f(0.0f, 1.0f, 0.0f, 0.1f));
      tr1.setTranslation(vector);
      tg1.setTransform(tr1);
      spin.addChild(tg1);
      tg1.addChild(shape1);
      
   //object: URANUS
      Appearance ap7 = new Appearance();
      Texture tex7 = new TextureLoader( "uranus.jpg", this).getTexture();
      ap7.setTexture( tex7 );
      Sphere shape7 = new Sphere( 1.0f, Primitive.GENERATE_TEXTURE_COORDS |
         Primitive.GENERATE_NORMALS_INWARD, ap7 );
      shape7.setAppearance(ap7);
      Transform3D tr7 = new Transform3D();     
      tr7.setScale(0.04);
      TransformGroup tg7 = new TransformGroup(tr7);
      Vector3f vector7=new Vector3f(-.78f,0f , 0f);
      tr7.setRotation(new AxisAngle4f(0.0f, 1.0f, 0.0f, 0.1f));
      tr7.setTranslation(vector7);
      tg7.setTransform(tr7);
      spin.addChild(tg7);
      tg7.addChild(shape7);
     
    //object: NEPTUN
      Appearance ap8 = new Appearance();
      Texture tex8 = new TextureLoader( "neptun.jpg", this).getTexture();
      ap8.setTexture( tex8 );
      Sphere shape8 = new Sphere( 1.0f, Primitive.GENERATE_TEXTURE_COORDS |
         Primitive.GENERATE_NORMALS_INWARD, ap8 );
      shape8.setAppearance(ap8);
      Transform3D tr8 = new Transform3D();     
      tr8.setScale(0.035);
      TransformGroup tg8 = new TransformGroup(tr8);
      Vector3f vector8=new Vector3f(-.88f,0f , 0f);
      tr8.setRotation(new AxisAngle4f(0.0f, 1.0f, 0.0f, 0.1f));
      tr8.setTranslation(vector8);
      tg8.setTransform(tr8);
      spin.addChild(tg8);
      tg8.addChild(shape8);

         
         
     //  object: BOSHTI
      Appearance ap9 = new Appearance();
      ap9.setMaterial(new Material());
      Shape3D shape9 = new Boshti(2.6);
      shape9.setAppearance(ap9); 
      Transform3D tr9 = new Transform3D();
      tr9.setScale(0.20);
      TransformGroup tg9 = new TransformGroup(tr9);
      Vector3f vector9=new Vector3f(0f,0f , 0f);
      tr9.setTranslation(vector9);
      tg9.setTransform(tr9);
      root.addChild(tg9);
      tg9.addChild(shape9);
       
      
      
      back.setGeometry( root );   
      Alpha alpha = new Alpha(-1, 7000);
      RotationInterpolator rotator = new RotationInterpolator(alpha, spin);
      BoundingSphere bounds = new BoundingSphere();
      rotator.setSchedulingBounds(bounds);
      spin.addChild(rotator);
   
      //background and light
      TextureLoader myLoader = new  TextureLoader("galaxy.jpg",this);
      ImageComponent2D myImage = myLoader.getImage( );
      Background background = new Background(2.0f, 2.0f, 2.0f);
      background.setImage(myImage);
      background.setApplicationBounds(bounds);
      root.addChild(background);
      AmbientLight light = new AmbientLight(true, new Color3f(Color.white));
      light.setInfluencingBounds(bounds);
      root.addChild(light);
      PointLight ptlight = new PointLight(new Color3f(Color.white),
         new Point3f(3f,3f,3f), new Point3f(1f,0f,0f));
      ptlight.setInfluencingBounds(bounds);
      root.addChild(ptlight);
      PointLight ptlight2 = new PointLight(new Color3f(Color.white),
         new Point3f(-2f,2f,2f), new Point3f(1f,0f,0f));
      ptlight2.setInfluencingBounds(bounds);
      root.addChild(ptlight2);
      return root;
   }
}