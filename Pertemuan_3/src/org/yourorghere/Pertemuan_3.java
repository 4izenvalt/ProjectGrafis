package org.yourorghere;
import com.sun.opengl.util.Animator;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
public class Pertemuan_3 implements 
GLEventListener,MouseListener,MouseMotionListener {
public static void main(String[] args) {
Frame frame = new Frame("Pertemuan 3 -Objek 3 Dimensi");
GLCanvas canvas = new GLCanvas();
canvas.addGLEventListener(new Pertemuan_3());
frame.add(canvas);
frame.setSize(640, 480);
final Animator animator = new Animator(canvas);
frame.addWindowListener(new WindowAdapter() {
@Override
public void windowClosing(WindowEvent e) {
new Thread(new Runnable() {
public void run() {
animator.stop();
System.exit(0);
}
}).start();
}
});
// Center frame
frame.setLocationRelativeTo(null);
frame.setVisible(true);
animator.start();
}
private float view_rotx = 20.0f;
private float view_roty = 30.0f;
private int oldMouseX;
private int oldMouseY;
public void init(GLAutoDrawable drawable) {
GL gl = drawable.getGL();
gl.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
gl.glShadeModel(GL.GL_FLAT);
float ambient[]={1.0f,1.0f,1.0f,1.0f};
float difusse[]={1.0f,1.0f,1.0f,1.0f};
float specular[]={0.2f,1.0f,0.2f,1.0f};
float position[]={20.0f,30.0f,20.0f,0.0f};
gl.glLightfv(GL.GL_LIGHT0, GL.GL_AMBIENT, ambient,0);
gl.glLightfv(GL.GL_LIGHT0, GL.GL_DIFFUSE, difusse,0);
gl.glLightfv(GL.GL_LIGHT0, GL.GL_POSITION, position,0);
gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, 
specular,0);
float[] mambient ={ 0.1745f, 0.01175f, 0.01175f, 0.55f 
        };
float[] mdiffuse ={0.61424f, 0.04136f, 0.04136f, 0.55f 
};
float[] mspecular ={0.727811f, 0.626959f, 0.626959f, 
0.55f };
float mshine =76.8f ;
gl.glMaterialfv(GL.GL_FRONT,GL.GL_AMBIENT,mambient,0);
gl.glMaterialfv(GL.GL_FRONT,GL.GL_DIFFUSE,mdiffuse,0);
gl.glMaterialfv(GL.GL_FRONT,GL.GL_SPECULAR,mspecular, 
0);
gl.glMaterialf (GL.GL_FRONT,GL.GL_SHININESS,mshine);
gl.glEnable
(GL.GL_LIGHTING);
gl.glEnable(GL.GL_LIGHT0);
gl.glEnable(GL.GL_DEPTH_TEST);
gl.glEnable(GL.GL_NORMALIZE);
drawable.addMouseListener(this);
drawable.addMouseMotionListener(this);
}
public void reshape(GLAutoDrawable drawable, int x, int y, 
int width, int height) {
GL gl = drawable.getGL();
GLU glu = new GLU();
if (height <= 0) { 
height = 1;
}
final float h = (float) width / (float) height;
gl.glViewport(0, 0, width, height);
gl.glMatrixMode(GL.GL_PROJECTION);
gl.glLoadIdentity();
glu.gluPerspective(45.0f, h, 1.0, 20.0);
gl.glMatrixMode(GL.GL_MODELVIEW);
gl.glLoadIdentity();
}
public void display(GLAutoDrawable drawable) {
GL gl = drawable.getGL();
GLU glu = new GLU(); 
// Clear the drawing area
gl.glClear(GL.GL_COLOR_BUFFER_BIT | 
GL.GL_DEPTH_BUFFER_BIT);
// Reset the current matrix to the "identity"
gl.glLoadIdentity();
glu.gluLookAt(4,4,4,  // eye pos
0,0,0,   // look at
0,0,1);  // up
gl.glTranslatef(0.5f, 0.5f, 0.5f);       
gl.glRotatef(view_rotx, 1.0f, 0.0f, 0.0f);
gl.glRotatef(view_roty, 0.0f, 1.0f, 0.0f);
gl.glTranslatef(-0.5f, -0.5f, -0.5f);
Objek.Kubus(gl);
gl.glFlush();
}
public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean                deviceChanged) {
}
public void mouseClicked(MouseEvent e){
}
public void mouseEntered(MouseEvent e){}
public void mouseExited(MouseEvent e){
}
public void mouseReleased(MouseEvent e){
}
public void mousePressed(MouseEvent e){
oldMouseX=e.getX();
oldMouseY=e.getY();
}
public void mouseDragged(MouseEvent e){
int x=e.getX();
int y=e.getY();
Dimension size=e.getComponent().getSize();
float thetaY=360.0f*((float)(x
-
oldMouseX)/(float)size.width);
float thetaX=360.0f*((float)(oldMouseY-y)/(float)size.height);
oldMouseX=x;
oldMouseY=y;
view_rotx+=thetaX;
view_roty+=thetaY;
}
public void mouseMoved(MouseEvent e){
    }
}
