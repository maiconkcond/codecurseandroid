package checkbox.com.example.maiconh.checkbox;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    private CheckBox checkboxCao;
    private CheckBox checkboxGato;
    private CheckBox checkboxPapagaio;

    private Button botaoMostrar;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkboxCao = (CheckBox) findViewById(R.id.cbcaoID);
        checkboxGato = (CheckBox) findViewById(R.id.cbGatoID);
        checkboxPapagaio = (CheckBox) findViewById(R.id.cbPapagaioID);

        textoExibicao = (TextView) findViewById(R.id.txtExibicaoID);
        botaoMostrar = (Button) findViewById(R.id.btnMostrar);

        botaoMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itensSelecionas = "";

                itensSelecionas += "Item: " + checkboxCao.getText() + "- Status: " + checkboxCao.isChecked() +"\n";
                itensSelecionas += "Item: " + checkboxGato.getText()+ "- Status: " + checkboxGato.isChecked() +"\n";
                itensSelecionas += "Item: " + checkboxPapagaio.getText()+ "- Status: " + checkboxPapagaio.isChecked() + "\n";

                textoExibicao.setText(itensSelecionas);
            }
        });
    }
}
