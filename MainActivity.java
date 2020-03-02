//package 

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = findViewById(R.id.textView);
        final Button przycisk = findViewById(R.id.button);
        x=0;
        przycisk.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                przycisk.setText("click"+Integer.toString(x++));
            }
        });
    }
}
