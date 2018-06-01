package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Objek {

    static void Tabung(GL gl) {
        float amb[] = {0.34f, 0.34f, 0.34f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, diff, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);

        float BODY_LENGTH = 5f;
        float BODY_RADIUS = 2.0f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();

        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
    }

    static void Bola(GL gl) {

        float BODY_RADIUS = 2.0f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();

        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
    }

    static void BigBox(GL gl) {
        float amb[] = {0, 0.5f, 0, 1};
        float diff[] = {0, 0.5f, 0, 1};
        float spec[] = {0, 0.5f, 0, 1};
        float shine = 0;

        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_DIFFUSE, diff, 0);
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);

        gl.glBegin(GL.GL_QUADS);
        gl.glVertex3f(-10000, 0, -10000);
        gl.glVertex3f(10000, 0, -10000);
        gl.glVertex3f(10000, 0, 10000);
        gl.glVertex3f(-10000, 0, 10000);
        gl.glEnd();
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
