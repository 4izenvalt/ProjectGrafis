package org.yourorghere;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

public class GLRenderer implements GLEventListener {
//class vector untuk memudah vektor-isasi

 
    class vector {

        float x;
        float y;
        float z;

        public vector(float startX, float startY, float startZ) {
            x = startX;
            y = startY;
            z = startZ;
        }

    }
    vector depan = new vector(0f, 0f, 1f);//deklarasi awal vektor untuk depan[Sumbu Z]
    vector kanan = new vector(1f, 0f, 0f);//deklarasi awal vektor untuk gerakan ke kanan[Sumbu X]
    vector naik = new vector(0f, 1f, 0f);//deklarasi awal vetor untuk gerakan naik[Sumbu Y]

    float Cx = 0, Cy = 0f, Cz = 0;
    float Lx = 0, Ly = 0f, Lz = -20f;
    float silinderAngle = 90f;
    float silinderAngle1 = 90f;
    float silinderAngle2 = 90f;
    float baling = 1;
    float baling1 = 1;
    boolean angle = false;
    boolean angle1 = false;
    boolean silinder1 = false;
    boolean silinder2 = false;
    boolean kamera2 = false;
    boolean ori = true, silinder = false, kamera = false;

    /*
     ini adalah metod untuk melakukan pergerakan.
     magnitude adalah besarnya gerakan sedangkan direction digunakan untuk menentukan arah.
     gunakan -1 untuk arah berlawanan dengan vektor awal
     */
    private void vectorMovement(vector toMove, float magnitude, float direction) {
        float speedX = toMove.x * magnitude * direction;
        float speedY = toMove.y * magnitude * direction;
        float speedZ = toMove.z * magnitude * direction;
        Cx += speedX;
        Cy += speedY;
        Cz += speedZ;
        Lx += speedX;
        Ly += speedY;
        Lz += speedZ;
    }

    public void init(GLAutoDrawable drawable) {
// Use debug pipeline
// drawable.setGL(new DebugGL(drawable.getGL()));
        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());
// Enable VSync
        gl.setSwapInterval(1);

        gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glClearColor(0.5f, 0.5f, 0.5f, .0f);
        gl.glShadeModel(GL.GL_SMOOTH);
//gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        if (height <= 0) { // avoid a divide by zero error!
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 200.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
// Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
// Reset the current matrix to the "identity" 
        gl.glLoadIdentity();
        glu.gluLookAt(Cx, Cy, Cz, Lx, Ly, Lz, naik.x, naik.y, naik.z);

        gl.glTranslatef(0.0f, 0.0f, -15f);

        gl.glRotatef(silinderAngle, 1f, 0f, 0f);//x +(mutar depan)
        gl.glRotatef(silinderAngle1, 0f, 0f, 1f);//z +(tapi mutarnya Y -)
        gl.glRotatef(silinderAngle2, -1f, 0f, 0f);//x -(malah mutarnya Z -)
        gl.glRotatef(-90, 0.0f, 0.0f, 1.0f);
        gl.glRotatef(90, 0.0f, 1.0f, 0.0f);
        gl.glPushMatrix();
        Objek.kotak(gl);
        gl.glPushMatrix();
        gl.glPushMatrix();
        gl.glPushMatrix();
        gl.glPushMatrix();
        gl.glPushMatrix();
        Objek.segitiga(gl);
        gl.glPopMatrix();

        gl.glTranslatef(1.5f, 1.5f, 0f);
        gl.glRotatef(90, 1.0f, 0.0f, 0.0f);
        Objek.ekor(gl);
        gl.glPopMatrix();

        gl.glTranslatef(1.0f, 1.0f, -0.45f);
        gl.glRotatef(90, 1.0f, 0.0f, 0.0f);
        gl.glRotatef(baling, 0.0f, 1.0f, 0.0f);
        Objek.baling(gl);//baling" depan
        gl.glPopMatrix();

        gl.glTranslatef(4.8f, 1.55f, 0.2f);
        gl.glRotatef(baling1, 0f, 1f, 0f);
        Objek.balingKecil(gl);//baling" belakang
        gl.glPopMatrix();

        gl.glTranslatef(-1.2f, 0.5f, 2.2f);
        gl.glRotatef(-90, 1.0f, 0.0f, 0.0f);
        Objek.kaki(gl);
        gl.glPopMatrix();

        gl.glTranslatef(-0.65f, 1f, 0.30f);
        gl.glRotatef(-90, 1.0f, 0.0f, 0.0f);
        Objek.tiang(gl);
<<<<<<< HEAD

//        angle += 40f;
//        angle1 += 10f;
=======
        gl.glPushMatrix();
         gl.glTranslatef(-1f,-1f, -0.70f);
        gl.glRotatef(-50, 0f, 0f, 0.1f);
        Objek.wind(gl);
         gl.glPopMatrix();
         
         gl.glTranslatef(1.1f,-1.2f, 1.1f);
        gl.glRotatef(90, 0f, 1f, 0f);
        Objek.pintu(gl);
        angle += 40f;
        angle1 += 10f;

>>>>>>> 54a7ae70cf2cc4fa70badad48fce5a0452254bff
        if (silinder) {
            silinderAngle += 15f;
        }
        if (silinder1) {
            silinderAngle1 += 15f;
        }
        if (silinder2) {
            silinderAngle2 += 15f;
        }
        if (angle) {
            baling -= 40f;
        }
        if (angle1) {
            baling1 -= 10f;
        }
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    void Key_Pressed(int keyCode) {
        //huruf W
        if (keyCode == 87) {
            vectorMovement(kanan, 0.5f, 1f);
            System.out.println("Maju depan X Plus");
        } //huruf S
        else if (keyCode == 83) {
            vectorMovement(kanan, 0.5f, -1f);
            System.out.println("Mundur Belakang X Minus");
        } //huruf D
        else if (keyCode == 68) {
            vectorMovement(depan, 0.5f, 1f);
            System.out.println("Kanan Belakang Z Plus");

        } //huruf A
        else if (keyCode == 65) {
            vectorMovement(depan, 0.5f, -1f);
            System.out.println("Kiri depan Z Minus");
        } //panah atas
        else if (keyCode == 38) {
            vectorMovement(naik, 0.5f, 1f);
        } //panah bawah
        else if (keyCode == 40) {
            vectorMovement(naik, 0.5f, -1f);
        } //tombol 1
        else if (keyCode == 49) {
            if (silinder) {
                silinder = false;
            } else {
                silinder = true;
            }
        } //tombol 2
        else if (keyCode == 50) {
            if (silinder1) {
                silinder1 = false;
            } else {
                silinder1 = true;
            }
        } //tombol 3
        else if (keyCode == 51) {
            if (silinder2) {
                silinder2 = false;
            } else {
                silinder2 = true;
            }
        } //tombol 9
        else if (keyCode == 57) {
            if (angle) {
                angle = false;
            } else {
                angle = true;
            }
        } //tombol 0
        else if (keyCode == 48) {
            if (angle1) {
                angle1 = false;
            } else {
                angle1 = true;
            }

        }
    }
}
