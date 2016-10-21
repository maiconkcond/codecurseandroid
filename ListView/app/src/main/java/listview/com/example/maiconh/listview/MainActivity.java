package listview.com.example.maiconh.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listaItens;
    private String[] itens = {
        "Angra dos Reis", "Caldas Novas", "Campos do Jordao",
        "Costa do Sauipe", "Ilheus", "Porto Seguro", "Rio de Janeiro",
        "Tiradentes", "Praga","Santiago","Zurigue","Caribe",
        "Buenos Aires", "Budapest", "Cancun","Aruba"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaItens = (ListView) findViewById(R.id.listViewID);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        listaItens.setAdapter(adaptador);

        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int codPosicao = position;
                String valorClicado = listaItens.getItemAtPosition(codPosicao).toString();
                Toast.makeText(getApplicationContext(),valorClicado,Toast.LENGTH_SHORT).show();

            }
        });

    }
}
