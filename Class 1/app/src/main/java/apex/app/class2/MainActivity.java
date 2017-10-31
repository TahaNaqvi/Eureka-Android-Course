package apex.app.class2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private TextView TV_text;
    private EditText ET_edittext;
    private Button B_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        TV_text = findViewById(R.id.TV_text);
        ET_edittext = findViewById(R.id.ET_edittext);
        B_button = findViewById(R.id.B_button);

        B_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = ET_edittext.getText().toString();
                TV_text.setText(name);
            }
        });
    }
}
