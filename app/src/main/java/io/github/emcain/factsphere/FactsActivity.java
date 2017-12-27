package io.github.emcain.factsphere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

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
                String[] facts = {
                        "The billionth digit of Pi is 9.",
                        "Humans can survive underwater. But not for very long.",
                        "A nanosecond lasts one billionth of a second.",
                        "Honey does not spoil.",
                        "The atomic weight of Germanium is seven two point six four.",
                        "An ostrich's eye is bigger than its brain.",
                        "Rats cannot throw up.",
                        "Iguanas can stay underwater for twenty-eight point seven minutes.",
                        "The moon orbits the Earth every 27.32 days.",
                        "A gallon of water weighs 8.34 pounds."
                };

                // Randomly select our fact
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(10);
                String fact = facts[randomNumber];

                // change the text to display it
                factTextView.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}
