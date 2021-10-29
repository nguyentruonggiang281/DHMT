package T3_12_NguyenTruongGiang_19130061_BT2;

import jgl.GL;
import jgl.GLCanvas;

import java.awt.*;
import java.io.IOException;

public class Bai3_robot extends GLCanvas {

    private static int shoulder = 0, elbow = 0;

    private void myinit() {
        myGL.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        myGL.glShadeModel(GL.GL_FLAT);
    }

    public void display() {
        myGL.glClear(GL.GL_COLOR_BUFFER_BIT);
        myGL.glPushMatrix();
        myGL.glScalef(0.75f, 0.75f, 0.75f);
//        vẽ thân
        myGL.glPushMatrix();
        myGL.glTranslatef(0.0f, 1.0f, 0.0f);
        myGL.glScalef(1.0f, 2.0f, 0.5f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();

//        vẽ đầu
        myGL.glPushMatrix();
        myGL.glTranslatef(0, 2.8f, 0);
        myGL.glPushMatrix();
        myGL.glRotatef((float) shoulder, 0.0f, 1.0f, 0.0f);
        myGL.glScalef(0.4f, 0.6f, 0.4f);
        myUT.glutWireSphere(1.0, 8, 10);
        myGL.glPopMatrix();
        myGL.glPopMatrix();

//        vẽ tay
        myGL.glPushMatrix();
        myGL.glTranslatef(0.0f, 1.8f, 0.0f);
//        vẽ tay phải
        myGL.glPushMatrix();
        myGL.glTranslatef(0.5f, 0.0f, 0.0f);
        myGL.glRotatef((float) shoulder, 0.0f, 0.0f, 1.0f);
        myGL.glTranslatef(0.5f, 0.0f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(1.0f, 0.4f, 0.5f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();

        myGL.glTranslatef(0.5f, 0.0f, 0.0f);
        myGL.glRotatef((float) elbow, 0.0f, 0.0f, 1.0f);
        myGL.glTranslatef(0.5f, 0.0f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(1.0f, 0.4f, 0.5f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();
        myGL.glPopMatrix();

//        vẽ tay trái
        myGL.glPushMatrix();
        myGL.glTranslatef(-0.5f, 0.0f, 0.0f);
        myGL.glRotatef(-(float) shoulder, 0.0f, 0.0f, 1.0f);
        myGL.glTranslatef(-0.5f, 0.0f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(1.0f, 0.4f, 0.5f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();

        myGL.glTranslatef(-0.5f, 0.0f, 0.0f);
        myGL.glRotatef(-(float) elbow, 0.0f, 0.0f, 1.0f);
        myGL.glTranslatef(-0.5f, 0.0f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(1.0f, 0.4f, 0.5f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();
        myGL.glPopMatrix();
        myGL.glPopMatrix();

//       vẽ chưng
        myGL.glPushMatrix();
        myGL.glTranslatef(0.0f, 0.25f, 0);
//       chưng phải
        myGL.glPushMatrix();
        myGL.glTranslatef(0.3f, -0.5f, 0.0f);
        myGL.glRotatef((float) shoulder, 0.0f, 0.0f, 1.0f);
        myGL.glTranslatef(0.0f, -0.5f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(0.4f, 1.5f, 0.5f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();

        myGL.glTranslatef(0.0f, -0.75f, 0.0f);
        myGL.glRotatef((float) elbow, 0.0f, 0.0f, 1.0f);
        myGL.glTranslatef(0.0f, -0.75f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(0.4f, 1.5f, 0.5f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();
        myGL.glPopMatrix();
//       chưng trái
        myGL.glPushMatrix();
        myGL.glTranslatef(-0.3f, -0.5f, 0.0f);
        myGL.glRotatef(-(float) shoulder, 0.0f, 0.0f, 1.0f);
        myGL.glTranslatef(0.0f, -0.5f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(0.4f, 1.5f, 0.5f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();

        myGL.glTranslatef(0.0f, -0.75f, 0.0f);
        myGL.glRotatef(-(float) elbow, 0.0f, 0.0f, 1.0f);
        myGL.glTranslatef(0.0f, -0.75f, 0.0f);
        myGL.glPushMatrix();
        myGL.glScalef(0.4f, 1.5f, 0.5f);
        myUT.glutWireCube(1.0);
        myGL.glPopMatrix();
        myGL.glPopMatrix();
        myGL.glPopMatrix();

        myGL.glPopMatrix();
        myGL.glFlush();
    }

    public void myReshape(int w, int h) {
        myGL.glViewport(0, 0, w, h);
        myGL.glMatrixMode(GL.GL_PROJECTION);
        myGL.glLoadIdentity();
        myGLU.gluPerspective(60.0, (double) w / (double) h, 1.0, 20.0);
        myGL.glMatrixMode(GL.GL_MODELVIEW);
        myGL.glLoadIdentity();
        myGL.glTranslatef(0.0f, 0.0f, -5.0f);
    }

    /* ARGSUSED1 */
    public void keyboard(char key, int x, int y) {
        switch (key) {
            case 's':
                shoulder = (shoulder + 5) % 360;
                myUT.glutPostRedisplay();
                break;
            case 'S':
                shoulder = (shoulder - 5) % 360;
                myUT.glutPostRedisplay();
                break;
            case 'e':
                elbow = (elbow + 5) % 360;
                myUT.glutPostRedisplay();
                break;
            case 'E':
                elbow = (elbow - 5) % 360;
                myUT.glutPostRedisplay();
                break;
            case 27:
                System.exit(0);
            default:
                break;
        }
    }

    public void init() {
        myUT.glutInitWindowSize(400, 400);
        myUT.glutInitWindowPosition(0, 0);
        myUT.glutCreateWindow(this);
        myinit();
        myUT.glutDisplayFunc("display");
        myUT.glutReshapeFunc("myReshape");
        myUT.glutKeyboardFunc("keyboard");
        myUT.glutMainLoop();
    }

    static public void main(String args[]) throws IOException {
        Frame mainFrame = new Frame();
        mainFrame.setSize(408, 427);
        Bai3_robot mainCanvas = new Bai3_robot();
        mainCanvas.init();
        mainFrame.add(mainCanvas);
        mainFrame.setVisible(true);
    }
//vaiiiiiiiiiiiiiiiiiiiiiiiiii
//    khó hiểu quá nhề
}