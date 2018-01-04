package io.github.emcain.factsphere;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class FactsActivity extends AppCompatActivity {
    private FactBook factBook = new FactBook();
    private ColorWheel wheel = new ColorWheel();
    // view declarations
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout background;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        // assign the views from our Layout file to the corresponding variables
        factTextView = (TextView) findViewById(R.id.factTextView);
        showFactButton = (Button) findViewById(R.id.showFactButton);
        background = (RelativeLayout) findViewById(R.id.background);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = factBook.getFact();

                // change the text to display it
                factTextView.setText(fact);
                background.setBackgroundColor(wheel.getColor());
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}
