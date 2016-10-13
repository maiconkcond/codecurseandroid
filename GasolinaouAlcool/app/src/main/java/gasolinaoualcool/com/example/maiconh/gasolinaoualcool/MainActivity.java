package gasolinaoualcool.com.example.maiconh.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.txtAlcool);
        precoGasolina = (EditText) findViewById(R.id.txtGasolina);
        botaoVerificar = (Button) findViewById(R.id.btnCalcular);
        textoResultado = (TextView) findViewById(R.id.txtResultado);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperando valores digitados
                String textoPrecoAlccol = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                //Converter para Double
                Double valorAlcool = Double.parseDouble(textoPrecoAlccol);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                //Calculo (Dividir preço do alcool pela gasolina
                double resultado = valorAlcool / valorGasolina;

                if (resultado >= 0.7){
                    textoResultado.setText("E melhor utilizar GASOLINA");
                }else{
                    textoResultado.setText("E melhor utilizar ALCOOL");
                }

            }
        });



    }
}
