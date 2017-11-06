package apex.app.biosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    private TextView TV_description;
    private ImageView IV_description;
    private Bundle extras;
    private String[] desc = new String[]{
          "Muhammad Ali Jinnah (born Mahomedali Jinnahbhai; 25 December 1876  – 11 September 1948) was a lawyer, politician, and the founder of Pakistan.[1] Jinnah served as leader of the All-India Muslim League from 1913 until Pakistan's independence on 14 August 1947, and then as Pakistan's first Governor-General until his death. He is revered in Pakistan as Quaid-i-Azam (Urdu: قائد اعظم\u200E\u200E; Great Leader) and Baba-i-Qaum (Urdu: بابائے قوم\u200E\u200E; Father of the Nation). His birthday is observed as a national holiday in Pakistan.",
            "Iqbal was one of the major inspirations behind the Pakistan Movement, and is revered in Pakistan as Muffakir-e-Pakistan (The Thinker of Pakistan) or Shair-e-Mashriq (The Poet of the East).[1] Iqbal died on 21 April 1938 in Lahore at the age of 60. Thousands of visitors come to the mausoleum every day to pay their respects to the poet-philosopher.[2] It is said that Mustafa Kemal Atatürk sent earth collected from Maulana Rumi's tomb to be sprinkled on this grave[3]",
            "Mirza Ghalib was born in Kala Mahal, Agra[5] into a family descended from Aibak Turks who moved to Samarkand(in modern-day Uzbekistan) after the downfall of the Seljuk kings. His paternal grandfather, Mirza Qoqan Baig Khan, was a Saljuq Turk who had immigrated to India from Samarkand during the reign of Ahmad Shah (1748–54).[citation needed] He worked at Lahore, Delhi and Jaipur, was awarded the subdistrict of Pahasu (Bulandshahr, UP) and finally settled in Agra, UP, India. He had four sons and three daughters. Mirza Abdullah Baig Khan and Mirza Nasrullah Baig Khan were two of his sons.[citation needed]"
    };
    private int[] images = new int[]{
            R.drawable.qaid,
            R.drawable.iqbal,
            R.drawable.ghalib
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TV_description = findViewById(R.id.TV_description);
        IV_description = findViewById(R.id.IV_mazar_image);

        extras = getIntent().getExtras();
        if (extras != null){
            int position = extras.getInt("index");
            TV_description.setText(desc[position]);
            IV_description.setImageResource(images[position]);

        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return true;
    }
}
