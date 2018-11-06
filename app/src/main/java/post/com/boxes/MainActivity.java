package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edlength;
    private EditText edwidth;
    private EditText edheight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  check(View view){
        int r = 0;
        edlength = findViewById(R.id.ed_length);
        edwidth = findViewById(R.id.ed_width);
        edheight = findViewById(R.id.ed_height);
        float l = Float.parseFloat(edlength.getText().toString());
        float w = Float.parseFloat(edwidth.getText().toString());
        float h = Float.parseFloat(edheight.getText().toString());
        if(l <= 23 && w <= 14 && h <= 13){
            Log.d("result" , "box3");
            r = 3;
        }else {
            Log.d("result" , "box5");
            r = 5;
        }Intent intent = new Intent(this , ResultActivity.class);
        intent.putExtra("boxsize" , r);
        startActivity(intent);
    }


}

