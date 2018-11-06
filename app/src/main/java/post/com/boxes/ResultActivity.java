package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        float r = getIntent().getIntExtra("boxsize" , 0);
        TextView box = findViewById(R.id.ed_box);
        TextView size = findViewById(R.id.ed_size);
        TextView price = findViewById(R.id.ed_price);
      if(r == 3){
          box.setText("Box3");
          size.setText("Dimention: 23 /  14 / 13 cm");
          price.setText("Price: 65");
      }else{if(r == 5){
          box.setText("Box5");
          size.setText("Dimention: 39.5 /  27.5 / 23 cm");
          price.setText("Price: 90");
      }

      }
    }
}
