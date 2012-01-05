package se.jayway.opengl.tutorial;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;

public class TutorialPartV extends Activity {
    /** Called when the activity is first created. */
	OpenGLRenderer myRenderer=new OpenGLRenderer();
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	this.requestWindowFeature(Window.FEATURE_NO_TITLE); 
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
 		GLSurfaceView view = new GLSurfaceView(this);
   		view.setRenderer(myRenderer);
   		setContentView(view);
    }
    float prevX,prevY;
    float currentX,currentY;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
    	if(event.getAction()==MotionEvent.ACTION_DOWN){
    		prevX=event.getX();
    		prevY=event.getY();
    	}
    	if(event.getAction()==MotionEvent.ACTION_MOVE){
    		currentX=event.getX();
    		currentY=event.getY();
    		myRenderer.setRx(-prevY+currentY);
    		myRenderer.setRy(-prevX+currentX);
    		
    	}
    	return super.onTouchEvent(event);
    }
}