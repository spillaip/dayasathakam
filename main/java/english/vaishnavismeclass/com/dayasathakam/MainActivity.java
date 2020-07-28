package english.vaishnavismeclass.com.dayasathakam;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {
    ListView lv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0040R.layout.activity_main);
        this.lv = (ListView) findViewById(C0040R.id.listView1);
        this.lv.setAdapter(new VcAdapter(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0040R.menu.main, menu);
        return true;
    }
}
