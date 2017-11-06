package apex.app.biosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView LV_personalities;
    ArrayAdapter<String> adapter;
    private String[] names = new String[]{
           "Qaid-e-Azam",
            "Allama Iqbal",
            "Ghalib"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LV_personalities = findViewById(R.id.LV_personalities);
        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.single_list_item, R.id.TV_name, names);
        LV_personalities.setAdapter(adapter);

        LV_personalities.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent i = new Intent(MainActivity.this, DescriptionActivity.class);
                i.putExtra("index",position);
                startActivity(i);
            }
        });
    }
}
