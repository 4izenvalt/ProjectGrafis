package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

public class GLRenderer implements GLEventListener {
//class vector untuk memudah vektor-isasi

    float angle = 0;

    class vector {

        float x;
        float y;
        float z;

        public vector(float startX, float startY, float startZ) {
            x = startX;
            y = startY;
            z = startZ;
        }

        void vectorRotation(vector reference, float angle) {
            vector temp = reference;
            float magnitude = (float) Math.sqrt(Math.pow(temp.x, 2) + Math.pow(temp.y, 2) + Math.pow(temp.z, 2));
            temp.x = temp.x / magnitude;
            temp.y = temp.y / magnitude;
            temp.z = temp.z / magnitude;
            float dot_product = (x * temp.x) + (y * temp.y) + (z * temp.z);
            float cross_product_x = (y * temp.z) - (temp.z * z);
            float cross_product_y = -((x * temp.z) - (z * temp.x));
            float cross_product_z = (x * temp.y) - (y * temp.x);
            float last_factor_rodrigues = (float) (1 - Math.cos(Math.toRadians(angle % 360)));
            x = (float) ((x * Math.cos(Math.toRadians(angle % 360)))
                    + (cross_product_x * Math.sin(Math.toRadians(angle % 360)))
                    + (dot_product * last_factor_rodrigues * x));
            y = (float) ((this.y * Math.cos(Math.toRadians(angle % 360)))
                    + (cross_product_y * Math.sin(Math.toRadians(angle % 360)))
                    + (dot_product * last_factor_rodrigues * y));
            z = (float) ((z * Math.cos(Math.toRadians(angle % 360)))
                    + (cross_product_z * Math.sin(Math.toRadians(angle % 360)))
                    + (dot_product * last_factor_rodrigues * z));
        }
    }
    vector depanBelakang = new vector(0f, 0f, -1f);//deklarasi awal vektor untuk maju & mundur
    vector samping = new vector(1f, 0f, 0f);//deklarasi awal vektor untuk gerakan ke kanan & kiri
    vector vertikal = new vector(0f, 1f, 0f);//deklarasi awal vetor untuk gerakan naik & turun
    float Cx = 0, Cy = 2.5f, Cz = 0;
    float Lx = 0, Ly = 2.5f, Lz = -20f;
    float angle_depanBelakang = 0f;
    float angle_depanBelakang2 = 0f;
    float angle_samping = 0f;
    float angle_samping2 = 0f;
    float angle_vertikal = 0f;
    float angle_vertikal2 = 0f;
    float silinderAngle = 90f;
    float silinderAngle1 = 90f;//z+
    float silinderAngle2 = 90f;//z-
    float silinderAngle3 = 90f;//y+
    float silinderAngle4 = 90f;//y-
    float silinderAngle5 = 90f;//x+
    float silinderAngle6 = 90f;//x-
    boolean silinder1 = false;//z+
    boolean silinder2 = false;//z-
    boolean silinder3 = false;//y+
    boolean silinder4 = false;//y-
    boolean silinder5 = false;//x+
    boolean silinder6 = false;//x-
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

    private void cameraRotation(vector reference, double angle) {
        float M = (float) (Math.sqrt(Math.pow(reference.x, 2) + Math.pow(reference.y, 2) + Math.pow(reference.z, 2)));//magnitud
        float Up_x1 = reference.x / M; //melakukan
        float Up_y1 = reference.y / M; //normalisasi
        float Up_z1 = reference.z / M; //vektor patokan
        float VLx = Lx - Cx;
        float VLy = Ly - Cy;
        float VLz = Lz - Cz;
        float dot_product = (VLx * Up_x1) + (VLy * Up_y1) + (VLz * Up_z1);
        float cross_product_x = (Up_y1 * VLz) - (VLy * Up_z1);
        float cross_product_y = -((Up_x1 * VLz) - (Up_z1 * VLx));
        float cross_product_z = (Up_x1 * VLy) - (Up_y1 * VLx);
        float last_factor_rodriques = (float) (1 - Math.cos(Math.toRadians(angle % 360)));
        float Lx1 = (float) ((VLx * Math.cos(Math.toRadians(angle % 360)))
                + (cross_product_x * Math.sin(Math.toRadians(angle % 360)))
                + (dot_product * last_factor_rodriques * VLx));
        float Ly1 = (float) ((VLy * Math.cos(Math.toRadians(angle % 360)))
                + (cross_product_y * Math.sin(Math.toRadians(angle % 360)))
                + (dot_product * last_factor_rodriques * VLy));
        float Lz1 = (float) ((VLz * Math.cos(Math.toRadians(angle % 360)))
                + (cross_product_z * Math.sin(Math.toRadians(angle % 360)))
                + (dot_product * last_factor_rodriques * VLz));
        Lx = Lx1 + Cx;
        Ly = Ly1 + Cy;
        Lz = Lz1 + Cz;
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
// Move the "drawing cursor" around
        glu.gluLookAt(Cx, Cy, Cz,
                Lx, Ly, Lz,
                vertikal.x, vertikal.y, vertikal.z);
        gl.glPushMatrix();
        gl.glTranslatef(-0.5f, 1.5f, -18f);
        gl.glRotatef(silinderAngle, 1f, 0f, 0f);
        gl.glRotatef(silinderAngle1, 0f, 0f, 1f);//z+
        gl.glRotatef(silinderAngle2, 0f, 0f, -1f);//z-
        gl.glRotatef(silinderAngle3, 0f, 1f, 0f);//y+
        gl.glRotatef(silinderAngle4, 0f, -1f, 0f);//y-
        gl.glRotatef(silinderAngle5, 1f, 0f, 0f);//x+
        gl.glRotatef(silinderAngle6, -1f, 0f, 0f);//x-
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
<<<<<<< HEAD
<<<<<<< HEAD

=======
        
>>>>>>> parent of 91117a1... Update Kamera
        gl.glTranslatef(1f, 1f, -0.15f);
        gl.glRotatef(90, 1.0f, 0.0f, 0.0f);
=======
        
        gl.glTranslatef(1f, 1f, -0.40f); // koordinat berubah x=maju kedepan/belakang , y=kanan/kiri , z=atas/bawah
        gl.glRotatef(90, 1.0f, 0f, 0.0f);
>>>>>>> 1ac80dc8aab689d85ca9723cb6ea27f48939fc80
        gl.glRotatef(angle, 0.0f, 1.0f, 0.0f);
        Objek.baling(gl);//baling" depan
        gl.glPopMatrix();
        
        gl.glTranslatef(4.8f, 1.55f, 0.2f);
        gl.glRotatef(angle, 0f, 1f, 0f);
        Objek.balingKecil(gl);//baling" belakang
        gl.glPopMatrix();
        
        gl.glTranslatef(-1.2f, 0.5f, 2.2f);
        gl.glRotatef(-90, 1.0f, 0.0f, 0.0f);
        Objek.kaki(gl);
        gl.glPopMatrix(); 
        
         gl.glTranslatef(-0.65f, 1f, 0.30f);
        gl.glRotatef(-90, 1.0f, 0.0f, 0.0f);
        Objek.tiang(gl);
        gl.glPopMatrix();

        angle += 4f;
        if (silinder) {
            silinderAngle += 15f;
        }
        if (silinder1) {
            silinderAngle1 += 15f;
        }
        if (silinder2) {
            silinderAngle2 += 15f;
        }
        if (silinder3) {
            silinderAngle3 += 15f;
        }
        if (silinder4) {
            silinderAngle4 += 15f;
        }
        if (silinder5) {
            silinderAngle5 += 15f;
        }
        if (silinder6) {
            silinderAngle6 += 15f;
        }
        if (kamera) {
            Key_Pressed(74);
        }
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    void Key_Pressed(int keyCode) {
        //huruf A
        if (keyCode == 65) {
            vectorMovement(samping, 2f, 1f);
        } //huruf B
        else if (keyCode == 66) {
            vectorMovement(vertikal, 2f, 1f);
        } //huruf C
        else if (keyCode == 67) {
            vectorMovement(depanBelakang, 2f, 1f);
        } //panah bawah
        else if (keyCode == 40) {
            vectorMovement(vertikal, 2f, -1f);
        } //tombol spasi
        else if (keyCode == 32) {
            if (silinder) {
                silinder = false;
            } else {
                silinder = true;
            }
        } //panah Kiri
        else if (keyCode == 37) {
            angle_vertikal += 15f;
            samping.vectorRotation(vertikal, angle_vertikal - angle_vertikal2);
            depanBelakang.vectorRotation(vertikal, angle_vertikal - angle_vertikal2);
            cameraRotation(vertikal, angle_vertikal - angle_vertikal2);
            angle_vertikal2 = angle_vertikal;
        } //panah kanan
        else if (keyCode == 39) {
            angle_vertikal -= 15f;
            samping.vectorRotation(vertikal, angle_vertikal - angle_vertikal2);
            depanBelakang.vectorRotation(vertikal, angle_vertikal - angle_vertikal2);
            cameraRotation(vertikal, angle_vertikal - angle_vertikal2);
            angle_vertikal2 = angle_vertikal;
        } //panah atas
        else if (keyCode == 38) {
            angle_samping -= 15f;
//vertikal.vectorRotation(samping, angle_samping-angle_samping2);
            depanBelakang.vectorRotation(samping, angle_samping - angle_samping2);
            cameraRotation(samping, angle_samping - angle_samping2);
            angle_samping2 = angle_samping;
        } //panah bawah
        else if (keyCode == 40) {
            angle_samping += 15f;
//vertikal.vectorRotation(samping, angle_samping-angle_samping2);
            depanBelakang.vectorRotation(samping, angle_samping - angle_samping2);
            cameraRotation(samping, angle_samping - angle_samping2);
            angle_samping2 = angle_samping;
            //      } //panah kanan
//        else if (keyCode == 39) {
//            angle_depanBelakang -= 15f;
//            samping.vectorRotation(depanBelakang, angle_depanBelakang - angle_depanBelakang2);
//            vertikal.vectorRotation(depanBelakang, angle_depanBelakang - angle_depanBelakang2);
////cameraRotation(vertikal, angle_samping-angle_samping2);
//            angle_depanBelakang2 = angle_depanBelakang;
//        } //panah kiri
//        else if (keyCode == 37) {
//            angle_depanBelakang += 15f;
//            samping.vectorRotation(depanBelakang, angle_depanBelakang - angle_depanBelakang2);
//            vertikal.vectorRotation(depanBelakang, angle_depanBelakang - angle_depanBelakang2);
////cameraRotation(vertikal, angle_samping-angle_samping2);
//            angle_depanBelakang2 = angle_depanBelakang;
        }
    }
}
