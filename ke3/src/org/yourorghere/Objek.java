/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;
import javax.media.opengl.GL;
public class Objek {
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


