package kriangsak.secondapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class FirstActivity extends AppCompatActivity {
    String data1,data2,data3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

        public void sendmassage (View View){
        Button btn  = (Button)findViewById(R.id.btn_send);

        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.edit_user);
        EditText editText2 = (EditText) findViewById(R.id.edit_pass);
        EditText editText3 = (EditText) findViewById(R.id.edit_tel);
        String message1 = editText1.getText().toString();
        String message2 = editText2.getText().toString();
        String message3 = editText3.getText().toString();
        intent.putExtra("data1", message1);
        intent.putExtra("data2", message2);
        intent.putExtra("data3", message3);
        startActivity(intent);
    }
}
