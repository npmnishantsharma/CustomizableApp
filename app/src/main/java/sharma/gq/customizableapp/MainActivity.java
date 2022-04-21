package sharma.gq.customizableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView appTitle, Edited, by;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appTitle = findViewById(R.id.appTitle);
        Edited = findViewById(R.id.pwe);
        by = findViewById(R.id.by);

        appTitle.setText("My Profile");
        Edited.setText("Edited By: Nishant Sharma(ADMIN)");
        by.setText("By Nishant Sharma");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, myactivity.class));
            }
        },6000);
    }
}