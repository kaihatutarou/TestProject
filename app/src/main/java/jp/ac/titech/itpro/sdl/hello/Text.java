package jp.ac.titech.itpro.sdl.hello;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;

/**
 * Created by tarou on 16/04/21.
 */
public class Text extends TextView{


    public Text(Context context) {
        super(context);
        setText("aaaaaaa");
        setX(100);
        setY(100);
        setTextSize(50);
        setClickable(true);
        setBackgroundColor(Color.GREEN);

    }

}
