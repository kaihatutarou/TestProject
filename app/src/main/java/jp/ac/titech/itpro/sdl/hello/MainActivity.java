package jp.ac.titech.itpro.sdl.hello;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout v=(RelativeLayout)findViewById(R.id.main);
        DrawView t=new DrawView(this,100, Color.YELLOW);
        v.addView(t);

        v.addView((new DrawView(this,0, Color.BLUE)));
        v.addView(new DrawView(this,0, Color.RED));
    }




}
