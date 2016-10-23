package radiobutton.com.example.maiconh.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private TextView escolha;
    private RadioGroup radioGrup;
    private RadioButton radioButtonEscolhido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.btnEscolher);
        escolha = (TextView) findViewById(R.id.txtEscolha);
        radioGrup = (RadioGroup) findViewById(R.id.groupID);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idRadioButtonEscolhido = radioGrup.getCheckedRadioButtonId();

                if (idRadioButtonEscolhido > 0 ){
                    radioButtonEscolhido = (RadioButton)findViewById(idRadioButtonEscolhido);

                    escolha.setText( radioButtonEscolhido.getText());
                }
            }
        });
    }
}
