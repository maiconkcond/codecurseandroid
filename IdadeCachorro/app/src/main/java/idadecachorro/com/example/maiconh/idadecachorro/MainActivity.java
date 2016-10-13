package idadecachorro.com.example.maiconh.idadecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (EditText) findViewById(R.id.txtIdade);
        botaoIdade = (Button) findViewById(R.id.btnCalcular);
        resultadoIdade = (TextView) findViewById(R.id.ResultadoIdadeID);


        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recuperando o que usuario digitou
                String textoDigitado = caixaTexto.getText().toString();

                //Verifica se foi digitado algo
                if (textoDigitado.isEmpty()){
                    //Esta vazia
                    resultadoIdade.setText("Nao foi digitado nenhum numero");
                }else{
                    //Usuario digitou algo
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado * 7;

                    resultadoIdade.setText("A idade do cachorro em anos humanos e: " + resultadoFinal +" anos");
                }

            }
        });
    }
}
