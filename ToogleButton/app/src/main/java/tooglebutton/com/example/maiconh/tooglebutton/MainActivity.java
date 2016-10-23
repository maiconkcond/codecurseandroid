package tooglebutton.com.example.maiconh.tooglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private ToggleButton togglebutton;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        togglebutton = (ToggleButton) findViewById(R.id.toggleButtonID);
        textoExibicao = (TextView) findViewById(R.id.textoExibicao);

        togglebutton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                textoExibicao.setText("");
                if (isChecked){
                    textoExibicao.setText("Mostrar...");
                }
            }
        });
    }
}
