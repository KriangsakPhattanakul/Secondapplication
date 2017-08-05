package kriangsak.secondapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView r1,r2,r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        Intent intent =getIntent();
        String message1 = intent.getStringExtra("data1");
        String message2 = intent.getStringExtra("data2");
        String message3 = intent.getStringExtra("data3");

        TextView r1 = (TextView) findViewById(R.id.result1);
        TextView r2 = (TextView) findViewById(R.id.result2);
        TextView r3 = (TextView) findViewById(R.id.result3);
        r1.setText(message1);
        r2.setText(message2);
        r3.setText(message3);
    }
        public void Back_page(View view){
        Button btn = (Button)findViewById(R.id.btn_back);
        Intent intent = new Intent(SecondActivity.this,FirstActivity.class);
        startActivity(intent);
    }
}
