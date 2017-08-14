package justjava.android.example.packagecom.sysbytes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        textView= (TextView) findViewById(R.id.username);
        Bundle extras = this.getIntent().getExtras();
        if(extras!=null) {
            String b=extras.getString("username");
            textView.setText(b);
        }
    }
}
