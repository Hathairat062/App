package projectandroid.coe.mytest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Learn extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        listView = (ListView)findViewById(R.id.list_item);
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(Learn.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.learn_names));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Learn.this,SecondActivity.class);
                intent.putExtra("learn_names",listView.getItemAtPosition(position).toString());
                startActivity(intent);

            }
        });
        listView.setAdapter(mAdapter);
    }
}
