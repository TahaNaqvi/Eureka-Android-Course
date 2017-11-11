package apex.app.customrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView RV_list;
    private CustomAdapter adapter;

    private int[] eventImages = {
            R.drawable.event1,
            R.drawable.event2,
            R.drawable.event3,
            R.drawable.event4,
            R.drawable.event1,
            R.drawable.event2,
            R.drawable.event3,
            R.drawable.event4,
            R.drawable.event1,
            R.drawable.event2,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RV_list = findViewById(R.id.RV_list);
        adapter = new CustomAdapter(MainActivity.this, eventImages);
        RV_list.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        RV_list.setAdapter(adapter);

    }
}
