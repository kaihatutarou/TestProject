package jp.ac.titech.itpro.sdl.hello;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by tarou on 16/04/18.
 */
public class DrawView extends View implements {

    int x;
    int c;
    public DrawView(Context context,int x,int c) {
        super(context);
        this.x=x;
        this.c=c;
    }

    public void onDraw(Canvas c){
            Paint p=new Paint();
            p.setColor(this.c);
            c.drawRect(0,0,200,200,p);
       }
}
