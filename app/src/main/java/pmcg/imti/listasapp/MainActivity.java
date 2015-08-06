package pmcg.imti.listasapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Virmerson on 05/08/15.
 */
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.my_list)
    ListView list;

    static final String[] NAMES = {
            "JÃO", "MARIA", "ZÉ"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        ButterKnife.bind(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,NAMES);

        list.setAdapter(adapter);
    }
}
