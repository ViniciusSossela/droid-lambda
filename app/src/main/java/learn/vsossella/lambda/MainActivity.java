package learn.vsossella.lambda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button lambdaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lambdaButton = (Button)findViewById(R.id.lambda_button);
        lambdaButton.setOnClickListener(v -> Toast.makeText(this, "Heey, lambda works!", Toast.LENGTH_SHORT).show());
    }




}
