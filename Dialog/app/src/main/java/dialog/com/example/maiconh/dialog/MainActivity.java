package dialog.com.example.maiconh.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {


    private Button botao;
    private AlertDialog.Builder dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.btnDialog);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Criando alert dialog
                dialog = new AlertDialog.Builder(MainActivity.this);

                //Configurando o titulo
                dialog.setTitle("Titudo da dialog");

                //Configurando a mensagem
                dialog.setMessage("Mensagem da dialog");

                //Desabilita o cancelamento da Dialog sem açao
                dialog.setCancelable(false);

                //Colocar icone na Dialog
                dialog.setIcon(android.R.drawable.ic_delete);

                //Cconfigurando os botoes
                dialog.setNegativeButton("NAO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Pressionado o botao NAO", Toast.LENGTH_SHORT).show();
                    }
                });


                dialog.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Pressionado o botao SIM", Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.create();
                dialog.show();

            }
        });
    }
}
