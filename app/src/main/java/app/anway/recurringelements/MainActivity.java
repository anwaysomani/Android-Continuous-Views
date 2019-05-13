package app.anway.recurringelements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare global elements for use within the entire class

    // For list View(element)
    ListView listView;

    // For textView within the list View
    TextView textView;

    // For fetching string array from strings.xml
    String[] listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign elements from xml to java class
        listView = (ListView) findViewById(R.id.listView);
        textView = (TextView) findViewById(R.id.individual);

        // Fetch data from resources(strings.xml) to class
        listItem = getResources().getStringArray(R.array.bca_students);

        // Wondering....this is pre-configured class, offerend by Android wale log(awesome dudes!)
        // You don't need to create and declare your own adapter if its plain text in listView
        // Just fetch it as android.R.{{ library }}.{{ element_to_fetch }}
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, listItem);

        // Assign adapter
        listView.setAdapter(adapter);

    }
}
