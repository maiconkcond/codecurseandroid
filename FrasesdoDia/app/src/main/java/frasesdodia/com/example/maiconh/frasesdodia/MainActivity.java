package frasesdodia.com.example.maiconh.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {"teste", "teste2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseID);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseID);

        textoNovaFrase.setText(frases[1]);
    }
}
