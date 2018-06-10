/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;
import javax.media.opengl.GL;
public class Objek {
static void Kubus(GL gl)
{
gl.glBegin(GL.GL_POLYGON);/* f1: Surface bagian depan */
gl.glVertex3f(0.0f,0.0f,0.0f);
gl.glVertex3f(0.0f,0.0f,1.0f);
gl.glVertex3f(1.0f,0.0f,1.0f);
gl.glVertex3f(1.0f,0.0f,0.0f);
gl.glEnd();
gl.glBegin(GL.GL_POLYGON);/* f2: Surface bagian bawah(ABFE)*/
gl.glVertex3f(0.0f,0.0f,0.0f);
gl.
glVertex3f(1.0f,0.0f,0.0f);
gl.glVertex3f(1.0f,1.0f,0.0f);
gl.glVertex3f(0.0f,1.0f,0.0f);
gl.glEnd();
gl.glBegin(GL.GL_POLYGON);/* f3:Surface bagian belakang (CDHG)*/
gl.glVertex3f(1.0f,1.0f,0.0f);
gl.glVertex3f(1.0f,1.0f,1.0f);
gl.glVertex3f(0.0f,1.0f,1.0f);
gl.glVertex3f(0.0f,1.0f,0.0f);
gl.glEnd();
gl.glBegin(GL.GL_POLYGON);/* f4: Surface bagian atas (EFGH)*/
gl.glVertex3f(1.0f,1.0f,1.0f);
gl.glVertex3f(1.0f,0.0f,1.0f);
gl.glVertex3f(0.0f,0.0f,1.0f);
gl.glVertex3f(0.0f,1.0f,1.0f);
gl.glEnd();
gl.glBegin(GL.GL_POLYGON);/* f5: Surface bagian kiri (ADEH)*/
gl.glVertex3f(0.0f,0.0f,0.0f);
gl.glVertex3f(0.0f,1.0f,0.0f);
gl.glVertex3f(0.0f,1.0f,1.0f);
gl.glVertex3f(0.0f,0.0f,1.0f);
gl.glEnd();
gl.glBegin(GL.GL_POLYGON);/* f6: Surface bagian kanan (BCFG)*/
gl.glVertex3f(1.0f,0.0f,0.0f);
gl.glVertex3f(1.0f,0.0f,1.0f);
gl.glVertex3f(1.0f,1.0f,1.0f);
gl.glVertex3f(1.0f,1.0f,0.0f);
gl.glEnd();
}
}


