package apex.app.class2b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ET_name;
    private Button B_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET_name = findViewById(R.id.ET_name);
        B_send = findViewById(R.id.B_send);

        B_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = ET_name.getText().toString();

                Intent i = new Intent(MainActivity.this, Activity2.class);
                i.putExtra("key", name);
                startActivity(i);
            }
        });


    }
}
