package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Objek {

    static void baling(GL gl){
       // gl.glTranslatef(0.5f, -0.2f, -6.0f);
        //gl.glRotatef(angle, -1, 1, 0);
        gl.glBegin(GL.GL_POLYGON);//depan
        gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(2.0f, 0.02f, 0.05f);
        gl.glVertex3f(2.0f, 0.0f, 0.05f);
        gl.glVertex3f(-2.0f, 0.0f, 0.05f);
        gl.glVertex3f(-2.0f, 0.02f, 0.05f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//belakang
        gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(2.0f, 0.02f, -0.05f);
        gl.glVertex3f(2.0f, 0.0f, -0.05f);
        gl.glVertex3f(-2.0f, 0.0f, -0.05f);
        gl.glVertex3f(-2.0f, 0.02f, -0.05f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//atas
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(2.0f, 0.02f, 0.05f);
        gl.glVertex3f(2.0f, 0.02f, -0.05f);
        gl.glVertex3f(-2.0f, 0.02f, -0.05f);
        gl.glVertex3f(-2.0f, 0.02f, 0.05f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//bawah
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(2.0f, 0.0f, 0.05f);
        gl.glVertex3f(2.0f, 0.0f, -0.05f);
        gl.glVertex3f(-2.0f, 0.0f, -0.05f);
        gl.glVertex3f(-2.0f, 0.0f, 0.05f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//atas 2
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(0.0f, 0.0f, -2.0f);
        gl.glVertex3f(0.0f, 0.0f, 2.0f);
        gl.glVertex3f(-0.1f, 0.0f, 2.0f);
        gl.glVertex3f(-0.1f, 0.0f, -2.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//bawah 2
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(0.0f, -0.02f, -2.0f);
        gl.glVertex3f(0.0f, -0.02f, 2.0f);
        gl.glVertex3f(-0.1f, -0.02f, 2.0f);
        gl.glVertex3f(-0.1f, -0.02f, -2.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//kanan 2
        gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, -2.0f);
        gl.glVertex3f(0.0f, 0.0f, 2.0f);
        gl.glVertex3f(0.0f, -0.02f, 2.0f);
        gl.glVertex3f(0.0f, -0.02f, -2.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//kiri 2
        gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.1f, 0.0f, -2.0f);
        gl.glVertex3f(-0.1f, 0.0f, 2.0f);
        gl.glVertex3f(-0.1f, -0.02f, 2.0f);
        gl.glVertex3f(-0.1f, -0.02f, -2.0f);
        gl.glEnd();
    //    angle += 0.5;
    }
    static void kotak(GL gl) {
             gl.glBegin(GL.GL_POLYGON);/*  bagian depan */
        gl.glNormal3f(-4.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 3.0f);
        gl.glVertex3f(4.0f, 0.0f, 3.0f);
        gl.glVertex3f(4.0f, 0.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian bawah */
        gl.glNormal3f(0.0f, 0.0f, -3.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(4.0f, 0.0f, 0.0f);
        gl.glVertex3f(4.0f, 3.5f, 0.0f);
        gl.glVertex3f(0.0f, 3.5f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian belakang */
        gl.glNormal3f(4.0f, 0.0f, 0.0f);
        gl.glVertex3f(4.0f, 3.5f, 0.0f);
        gl.glVertex3f(4.0f, 3.5f, 3.0f);
        gl.glVertex3f(0.0f, 3.5f, 3.0f);
        gl.glVertex3f(0.0f, 3.5f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian atas */
        gl.glNormal3f(0.0f, 0.0f, 3.0f);
        gl.glVertex3f(4.0f, 3.5f, 3.0f);
        gl.glVertex3f(4.0f, 0.0f, 3.0f);
        gl.glVertex3f(0.0f, 0.0f, 3.0f);
        gl.glVertex3f(0.0f, 4.0f, 3.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian kiri */
        gl.glNormal3f(0.0f, 3.5f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 3.5f, 0.0f);
        gl.glVertex3f(0.0f, 3.5f, 3.0f);
        gl.glVertex3f(0.0f, 0.0f, 3.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian kanan */
        gl.glNormal3f(0.0f, -3.5f, 0.0f);
        gl.glVertex3f(4.0f, 0.0f, 0.0f);
        gl.glVertex3f(4.0f, 0.0f, 3.0f);
        gl.glVertex3f(4.0f, 3.5f, 3.0f);
        gl.glVertex3f(4.0f, 3.5f, 0.0f);
        gl.glEnd();
        }
        static void segitiga(GL gl) {
           gl.glBegin(GL.GL_POLYGON);/*  bagian depan */
        gl.glNormal3f(-4.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 3.0f);
        gl.glVertex3f(-4.0f, 0.0f, 3.0f);
        //gl.glVertex3f(-4.0f, 0.0f, 0.0f);
        gl.glEnd();
      
        gl.glBegin(GL.GL_POLYGON);/*  bagian belakang */
        gl.glNormal3f(4.0f, 0.0f, 0.0f);
       // gl.glVertex3f(4.0f, 3.5f, 0.0f);
        gl.glVertex3f(-4.0f, 3.5f, 3.0f);
        gl.glVertex3f(0.0f, 3.5f, 3.0f);
       gl.glVertex3f(0.0f, 3.5f, 0.0f);
        gl.glEnd();
       
        gl.glBegin(GL.GL_POLYGON);/*  bagian atas */
        gl.glNormal3f(0.0f, 0.0f, 3.0f);
        gl.glVertex3f(-4.0f, 3.5f, 3.0f);
        gl.glVertex3f(-4.0f, 0.0f, 3.0f);
        gl.glVertex3f(0.0f, 0.0f, 3.0f);
        gl.glVertex3f(0.0f, 4.0f, 3.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian kiri */
        gl.glNormal3f(0.0f, 3.5f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 3.5f, 0.0f);
        gl.glVertex3f(0.0f, 3.5f, 3.0f);
        gl.glVertex3f(0.0f, 0.0f, 3.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian kanan */
        gl.glNormal3f(0.0f, 3.5f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(-4.0f, 0.0f, 3.0f);
        gl.glVertex3f(-4.0f, 3.5f, 3.0f);
        gl.glVertex3f(0f, 3.5f, 0.0f);
        gl.glEnd();
    }
        static void ekor(GL gl) {
             gl.glBegin(GL.GL_POLYGON);/*  bagian depan */
        gl.glNormal3f(-8.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(8.0f, 0.0f, 1.0f);
        gl.glVertex3f(8.0f, 0.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian bawah */
        gl.glNormal3f(0.0f, 0.0f, -1.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(8.0f, 0.0f, 0.0f);
        gl.glVertex3f(8.0f, 1.5f, 0.0f);
        gl.glVertex3f(0.0f, 1.5f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian belakang */
        gl.glNormal3f(8.0f, 0.0f, 0.0f);
        gl.glVertex3f(8.0f, 1.5f, 0.0f);
        gl.glVertex3f(8.0f, 1.5f, 1.0f);
        gl.glVertex3f(0.0f, 1.5f, 1.0f);
        gl.glVertex3f(0.0f, 1.5f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian atas */
        gl.glNormal3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(8.0f, 1.5f, 1.0f);
        gl.glVertex3f(8.0f, 0.0f, 1.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(0.0f, 1.0f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian kiri */
        gl.glNormal3f(0.0f, 1.5f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 1.5f, 0.0f);
        gl.glVertex3f(0.0f, 1.5f, 1.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian kanan */
        gl.glNormal3f(0.0f, -1.5f, 0.0f);
        gl.glVertex3f(8.0f, 0.0f, 0.0f);
        gl.glVertex3f(8.0f, 0.0f, 1.0f);
        gl.glVertex3f(8.0f, 1.5f, 1.0f);
        gl.glVertex3f(8.0f, 1.5f, 0.0f);
        gl.glEnd();
        }
        static void ekor2(GL gl) {
             gl.glBegin(GL.GL_POLYGON);/*  bagian depan */
        gl.glNormal3f(-1.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(1.0f, 0.0f, 1.0f);
        gl.glVertex3f(1.0f, 0.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian bawah */
        gl.glNormal3f(0.0f, 0.0f, -1.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(1.0f, 1.5f, 0.0f);
        gl.glVertex3f(0.0f, 1.5f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian belakang */
        gl.glNormal3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(1.0f, 1.5f, 0.0f);
        gl.glVertex3f(1.0f, 1.5f, 1.0f);
        gl.glVertex3f(0.0f, 1.5f, 1.0f);
        gl.glVertex3f(0.0f, 1.5f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian atas */
        gl.glNormal3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(1.0f, 1.5f, 1.0f);
        gl.glVertex3f(1.0f, 0.0f, 1.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(0.0f, 1.0f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian kiri */
        gl.glNormal3f(0.0f, 1.5f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 1.5f, 0.0f);
        gl.glVertex3f(0.0f, 1.5f, 1.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian kanan */
        gl.glNormal3f(0.0f, -1.5f, 0.0f);
        gl.glVertex3f(1.0f, 0.0f, 0.0f);
        gl.glVertex3f(1.0f, 0.0f, 1.0f);
        gl.glVertex3f(1.0f, 1.5f, 1.0f);
        gl.glVertex3f(1.0f, 1.5f, 0.0f);
        gl.glEnd();
        }
    
}
