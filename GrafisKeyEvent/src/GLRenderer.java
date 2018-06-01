import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

/**
 * GLRenderer.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel)
 * <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class GLRenderer implements GLEventListener {
    float angle = 0;

//class vector untuk memudah vektor-isasi

//float Cx = 0f, Cy = 0f, Cz = 0f;
//float Lx = 0f, Ly = 0f, Lz = 0f;
    private class vector {

        float x;
        float y;
        float z;

        public vector(float startX, float startY, float startZ) {
            x = startX;
            y = startY;
            z = startZ;
        }
    }
    vector maju = new vector(0f, 0f, -1f);//deklarasi awal vektor untuk maju
    vector kanan = new vector(-1f, 0f, 0f);//deklarasi awal vektor untuk gerakan ke kanan
    vector naik = new vector(0f, 1f, 0f);//deklarasi awal vetor untuk gerakan naik
    vector bawah = new vector(0f, -1f, 0f);
    vector mundur = new vector(0f, 0f, 1f);
    vector kiri = new vector(1f, 0f, 0f);
    vector tutupTbg = new vector(1f, 0f, 0f);

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
    float Cx = 0f, Cy = 0f, Cz = 0f;
    float Lx = 0f, Ly = 0f, Lz = -10f;

    public void init(GLAutoDrawable drawable) {
// Use debug pipeline
// drawable.setGL(new DebugGL(drawable.getGL()));
//float Cx = 5f, Cy = 0f, Cz = 5f;
//float Lx = 0f, Ly = 0f, Lz = -20f;
        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());
// Enable VSync
        gl.setSwapInterval(1);
// Setup the drawing area and shading mode
        gl.glClearColor(0.5f, 0.5f, 0.5f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        if (height <= 0) { // avoid a divide by zero error!
            height = 1;//jangan dirubah
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);//Perpindahan Camera
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(60.0f, h, 1.0, 100.0);//100(Batasan View Port)
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
// Move the "drawing cursor" around
//Posisi melihat Benda Dari arah
//C: Camera melihat pergerakan kamera
//L : longtitude (melihat pergerakan Sudut)
        glu.gluLookAt(Cx, Cy, Cz,
                Lx, Ly, Lz,
                0, -0.00001, 0);//Y kasih 0.1 Biar Gak aneh (Kalo 1 miring)
        gl.glPushMatrix();
        gl.glTranslatef(0f, 0f, -6f);//posisi awal melihat object
        gl.glRotatef(angle, 1, 1, 0);
       // gl.glRotatef(0.0f, 0.0f, 0.0f, 0.0f);//perputaran object
        Objek.Kubus(gl);
        gl.glPopMatrix();
           angle += 2.5;
        gl.glFlush();
         gl.glPushMatrix();
        gl.glTranslatef(2.0f, 1f, -4f);//posisi awal melihat object
        gl.glRotatef(angle, 0, 1, 1);
       // gl.glRotatef(0.0f, 0.0f, 0.0f, 0.0f);//perputaran object
        Objek.Bola(gl);
        gl.glPopMatrix();
           angle += 2.5;
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    void Key_Pressed(int keyCode) {
        if (keyCode == 87) {
            System.out.println("S");
            vectorMovement(maju, 0.5f, -0.2f);
        }
        else if (keyCode == 68) {
            System.out.println("D");
            vectorMovement(kanan, 0.5f, -0.2f);
        }
        else if (keyCode == 38) {
            System.out.println("Atas");
            vectorMovement(naik, 0.5f, -0.2f);
        } else if (keyCode == 40) {
            System.out.println("Bawah");
            vectorMovement(bawah, 0.5f, -0.2f);
        } else if (keyCode == 83) {
            System.out.println("W");
            vectorMovement(mundur, 0.5f, -0.2f);
        } else if (keyCode == 65) {
            System.out.println("A");
            vectorMovement(kiri, 0.5f, -0.2f);
        }else {
            System.out.println("Tombol Belum Ada");
      }
    }
}
