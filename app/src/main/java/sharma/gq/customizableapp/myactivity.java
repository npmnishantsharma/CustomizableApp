package sharma.gq.customizableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

public class myactivity extends AppCompatActivity {
    TextView textView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myactivity);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Nishant Sharma");
        textView = findViewById(R.id.textView5);
        textView.setText("My Profile");
    }
}