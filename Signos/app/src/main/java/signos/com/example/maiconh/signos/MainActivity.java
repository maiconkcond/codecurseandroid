package signos.com.example.maiconh.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listaSignos;
    private String[] signos = {
            "Aries","Touro","Gemeos","Cancer","Leao","Virgem",
            "Libra","Escorpiao","Sagitario","Capricornio","Aquario","Peixes"
    };

    private String[] perfis = {
            "Os arianos em geral possuem grande energia e vitalidade. São corajoso, combativos, e costumam ter as qualidades necessárias para vencer, realizar, comandar, impor disciplina.",
            "As pessoas de Touro são, em geral, amantes de beleza, do conforto, de tudo o que der prazer, e do romantismo, em especial.",
            "As pessoas de Gêmeos são naturalmente inquietas e curiosas, sempre muito comunicativas.Preocupam-se muito com atividades intelectuais, e procuram amigos igualmente inteligentes.",
            "São por natureza indivíduos muito simpáticos e bem humorados, mas ao mesmo tempo introvertidos, tímidos e sonhadores; parecem estar sempre nas nuvens.",
            "Os leoninos caminham decididamente em direção ao sucesso, e só se contentam com a glória.",
            "Os virginianos são bastante reservados, mas muito afetuosos, demonstrando seus sentimentos com atitudes delicadas e pouco comuns. São críticos e introspectivos, perfeccionistas, atentos à detalhes.",
            "As pessoas de Libra são românticas, e sempre dispostas ao amor.",
            "Escorpião são inteligentes, arredios, têm emoções e sentimentos fortes, são muito persistentes, mas também podem ser rancorosos e obstinados.",
            "Os sagitarianos são inteligentes, de raciocínio brilhante, profundo e lógico. Ensinam e aprendem com igual facilidade. São sempre detalhistas, exigentes, impulsivos.",
            "Os capricornianos fazem planos, e têm paciência de deixa-los amadurecer.",
            "Aquário é um signo fraterno, e os aquarianos costumam ser dotados de forte espírito humanitário.",
            "Sonhadores, emotivos, muito receptivos, indecisos, sensuais, os piscianos podem ser considerados os mais maleáveis em todo o zodíaco, com todas as características, positivas ou negativas, que esta particularidade possa conferir.",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaSignos = (ListView) findViewById(R.id.listViewID);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
            getApplicationContext(),
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            signos
        );

        listaSignos.setAdapter(adaptador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int codPosicao = position;
                Toast.makeText(getApplicationContext(),perfis[codPosicao] ,Toast.LENGTH_LONG).show();

            }
        });
    }
}
