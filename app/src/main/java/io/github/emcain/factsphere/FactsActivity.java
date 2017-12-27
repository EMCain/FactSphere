package io.github.emcain.factsphere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FactsActivity extends AppCompatActivity {
    // declare our variables
    private TextView factTextView;
    private Button showFactButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        // assign the views from our Layout file to the corresponding variables
        factTextView = (TextView) findViewById(R.id.factTextView);
        showFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = "Humans can survive underwater. But not for very long.";
                factTextView.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}
