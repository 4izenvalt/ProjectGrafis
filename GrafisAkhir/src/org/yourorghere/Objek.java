package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Objek {

    static void kotak(GL gl) {
        gl.glColor3f(0.0f, 0.7f, 0.7f);
        gl.glBegin(GL.GL_POLYGON);/*  bagian depan */
        gl.glColor3f(0.0f, 0.7f, 0.7f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.5f);
        gl.glVertex3f(2.0f, 0.0f, 1.5f);
        gl.glVertex3f(2.0f, 0.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian bawah */

        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(2.0f, 0.0f, 0.0f);
        gl.glVertex3f(2.0f, 2.0f, 0.0f);
        gl.glVertex3f(0.0f, 2.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian belakang */
        gl.glVertex3f(2.0f, 2.0f, 0.0f);
        gl.glVertex3f(2.0f, 2.0f, 1.5f);
        gl.glVertex3f(0.0f, 2.0f, 1.5f);
        gl.glVertex3f(0.0f, 2.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian atas */
        gl.glVertex3f(2.0f, 2.0f, 1.5f);
        gl.glVertex3f(2.0f, 0.0f, 1.5f);
        gl.glVertex3f(0.0f, 0.0f, 1.5f);
        gl.glVertex3f(0.0f, 2.0f, 1.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian kiri */
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 2.0f, 0.0f);
        gl.glVertex3f(0.0f, 2.0f, 1.5f);
        gl.glVertex3f(0.0f, 0.0f, 1.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian kanan */
        gl.glVertex3f(2.0f, 0.0f, 0.0f);
        gl.glVertex3f(2.0f, 0.0f, 1.5f);
        gl.glVertex3f(2.0f, 2.0f, 1.5f);
        gl.glVertex3f(2.0f, 2.0f, 0.0f);
        gl.glEnd();
    }

    static void segitiga(GL gl) {
        gl.glColor3f(0.0f, 0.5f, 1.7f);
        gl.glBegin(GL.GL_POLYGON);/*  bagian depan */
        gl.glColor3f(0.0f, 0.5f, 1.7f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.5f);
        gl.glVertex3f(-2.0f, 0.0f, 1.5f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);/*  bagian belakang */
        gl.glVertex3f(-2.0f, 2.0f, 1.5f);
        gl.glVertex3f(0.0f, 2.0f, 1.5f);
        gl.glVertex3f(0.0f, 2.0f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);/*  bagian atas */
        gl.glVertex3f(-2.0f, 2.0f, 1.5f);
        gl.glVertex3f(-2.0f, 0.0f, 1.5f);
        gl.glVertex3f(0.0f, 0.0f, 1.5f);
        gl.glVertex3f(0.0f, 2.0f, 1.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian kiri */
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 2.0f, 0.0f);
        gl.glVertex3f(0.0f, 2.0f, 1.5f);
        gl.glVertex3f(0.0f, 0.0f, 1.5f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian kanan */
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(-2.0f, 0.0f, 1.5f);
        gl.glVertex3f(-2.0f, 2.0f, 1.5f);
        gl.glVertex3f(0f, 2.0f, 0.0f);
        gl.glEnd();
    }

    static void ekor(GL gl) {
        gl.glColor3f(1.0f, 0.5f, 0.0f);
        gl.glBegin(GL.GL_POLYGON);/*  bagian atas */
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(3.3f, 0.0f, 1.0f);
        gl.glVertex3f(3.3f, 0.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian depan */
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(3.3f, 0.0f, 0.0f);
        gl.glVertex3f(3.3f, 0.3f, 0.0f);
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian bawah */
        gl.glVertex3f(3.3f, 0.3f, 0.0f);
        gl.glVertex3f(3.3f, 0.3f, 1.0f);
        gl.glVertex3f(0.0f, 1.0f, 1.0f);
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);/*  bagian belakang */
        gl.glVertex3f(3.3f, 0.3f, 1.0f);
        gl.glVertex3f(3.3f, 0.0f, 1.0f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(0.0f, 1.0f, 1.0f);
        gl.glEnd();

    }

    static void baling(GL gl) {

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
    }

    static void balingKecil(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//depan
        gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.7f, 0.02f, 0.05f);
        gl.glVertex3f(0.7f, 0.0f, 0.05f);
        gl.glVertex3f(-0.7f, 0.0f, 0.05f);
        gl.glVertex3f(-0.7f, 0.02f, 0.05f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//belakang
        gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.7f, 0.02f, -0.05f);
        gl.glVertex3f(0.7f, 0.0f, -0.05f);
        gl.glVertex3f(-0.7f, 0.0f, -0.05f);
        gl.glVertex3f(-0.7f, 0.02f, -0.05f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//atas
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(0.7f, 0.02f, 0.05f);
        gl.glVertex3f(0.7f, 0.02f, -0.05f);
        gl.glVertex3f(-0.7f, 0.02f, -0.05f);
        gl.glVertex3f(-0.7f, 0.02f, 0.05f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//bawah
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(0.7f, 0.0f, 0.05f);
        gl.glVertex3f(0.7f, 0.0f, -0.05f);
        gl.glVertex3f(-0.7f, 0.0f, -0.05f);
        gl.glVertex3f(-0.7f, 0.0f, 0.05f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//atas 2
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(0.0f, 0.0f, -0.7f);
        gl.glVertex3f(0.0f, 0.0f, 0.7f);
        gl.glVertex3f(-0.1f, 0.0f, 0.7f);
        gl.glVertex3f(-0.1f, 0.0f, -0.7f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//bawah 2
        gl.glColor3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(0.0f, -0.02f, -0.7f);
        gl.glVertex3f(0.0f, -0.02f, 0.7f);
        gl.glVertex3f(-0.1f, -0.02f, 0.7f);
        gl.glVertex3f(-0.1f, -0.02f, -0.7f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//kanan 2
        gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(0.0f, 0.0f, -0.7f);
        gl.glVertex3f(0.0f, 0.0f, 0.7f);
        gl.glVertex3f(0.0f, -0.02f, 0.7f);
        gl.glVertex3f(0.0f, -0.02f, -0.7f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);//kiri 2
        gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(-0.1f, 0.0f, -0.7f);
        gl.glVertex3f(-0.1f, 0.0f, 0.7f);
        gl.glVertex3f(-0.1f, -0.02f, 0.7f);
        gl.glVertex3f(-0.1f, -0.02f, -0.7f);
        gl.glEnd();
    }

    static void kaki(GL gl) {
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(0.3f, 0.3f, 0.3f);
        gl.glVertex3f(0.0f, 0.0f, 0.0f);
        gl.glVertex3f(3.5f, 0.0f, 0.0f);
        gl.glVertex3f(3.5f, 0.3f, 0.0f);
        gl.glVertex3f(0.0f, 0.3f, 0.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(0.3f, 0.3f, 0.3f);
        gl.glVertex3f(1.8f, 0.3f, 0.0f);
        gl.glVertex3f(1.8f, 0.7f, 0.0f);
        gl.glVertex3f(1.5f, 0.7f, 0.0f);
        gl.glVertex3f(1.5f, 0.3f, 0.0f);
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(0.3f, 0.3f, 0.3f);
        gl.glVertex3f(0.0f, 0.0f, 1.0f);
        gl.glVertex3f(3.5f, 0.0f, 1.0f);
        gl.glVertex3f(3.5f, 0.3f, 1.0f);
        gl.glVertex3f(0.0f, 0.3f, 1.0f);
        gl.glEnd();
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(0.3f, 0.3f, 0.3f);
        gl.glVertex3f(1.8f, 0.3f, 1.0f);
        gl.glVertex3f(1.8f, 0.7f, 1.0f);
        gl.glVertex3f(1.5f, 0.7f, 1.0f);
        gl.glVertex3f(1.5f, 0.3f, 1.0f);
        gl.glEnd();
    }
    static void tiang(GL gl) {
        gl.glBegin(GL.GL_POLYGON);
        gl.glColor3f(0.3f, 0.3f, 0.3f);
        gl.glVertex3f(1.8f, 0.3f, 0.0f);
        gl.glVertex3f(1.8f, 0.7f, 0.0f);
        gl.glVertex3f(1.5f, 0.7f, 0.0f);
        gl.glVertex3f(1.5f, 0.3f, 0.0f);
        gl.glEnd();
    }
}
