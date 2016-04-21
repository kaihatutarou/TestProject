package jp.ac.titech.itpro.sdl.hello;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;


public class MainActivity extends Activity {

    private EditText et;
    private InputMethodManager imm ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout v = (RelativeLayout) findViewById(R.id.main);
        DrawView t = new DrawView(this, 100, Color.YELLOW);
        v.addView(t);
        v.addView(new Text(this));
        et = ((EditText) findViewById(R.id.textView));
        imm = (InputMethodManager) getSystemService(this.INPUT_METHOD_SERVICE);

        //EditTextにリスナーをセット
        et.setOnKeyListener(new View.OnKeyListener() {

            //コールバックとしてonKey()メソッドを定義
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //イベントを取得するタイミングには、ボタンが押されてなおかつエンターキーだったときを指定
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    //キーボードを閉じる
                    imm.hideSoftInputFromWindow(et.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);


                    return true;
                }

                return false;
            }
        });


        //v.addView((new DrawView(this,0, Color.BLUE)));
        //v.addView(new DrawView(this,0, Color.RED));
    }


    public void click(View view) {
        et.setFocusable(true);
        et.setFocusableInTouchMode(true);
        et.requestFocus();
    }


}
