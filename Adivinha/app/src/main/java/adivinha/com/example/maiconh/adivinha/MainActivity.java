package adivinha.com.example.maiconh.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnJogarID;
    private TextView resultadoID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogarID = (Button) findViewById(R.id.btnJogarID);
        resultadoID = (TextView) findViewById(R.id.resultadoID);


        btnJogarID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                resultadoID.setText("Texto alterado");
            }
        });




    }
}
