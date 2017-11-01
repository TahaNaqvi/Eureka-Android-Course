package apex.app.class2b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView TV_name;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TV_name = findViewById(R.id.TV_name);
        extras = getIntent().getExtras();

        if (extras != null){
            String name = extras.getString("key");
            if (name.equals(""))
                TV_name.setText("Empty");
            else
                TV_name.setText(name);
        }

    }
}
