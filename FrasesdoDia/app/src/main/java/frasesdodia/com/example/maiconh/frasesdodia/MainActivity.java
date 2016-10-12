package frasesdodia.com.example.maiconh.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "Se você traçar metas absurdamente altas e falhar, seu fracasso será muito melhor que o sucesso de todos – James Cameron",
            "O sucesso normalmente vem para quem está ocupado demais para procurar por ele – Henry David",
            "A vida é melhor para aqueles que fazem o possível para ter o melhor – John Wooden",
            "Os empreendedores falham, em média, 3,8 vezes antes do sucesso final. O que separa os bem-sucedidos dos outros é a persistência – Lisa M. Amos",
            "Se você não está disposto a arriscar, esteja disposto a uma vida comum – Jim Rohn",
            "Escolha uma ideia. Faça dessa ideia a sua vida. Pense nela, sonhe com ela, viva pensando nela. Deixe cérebro, músculos, nervos, todas as partes do seu corpo serem preenchidas com essa ideia. Esse é o caminho para o sucesso – Swami Vivekananda",
            "Para de perseguir o dinheiro e comece a perseguir o sucesso – Tony Hsieh",
            "Todos os seus sonhos podem se tornar realidade se você tem coragem para persegui-los – Walt Disney",
            "Ter sucesso é falhar repetidamente, mas sem perder o entusiasmo – Winston Churchill",
            "Sempre que você vir uma pessoa de sucesso, você sempre verá as glórias, nunca os sacrifícios que os levaram até ali – Vaibhav Shah",
            "Sucesso? Eu não sei o que isso significa. Eu sou feliz. A definição de sucesso varia de pessoa para pessoa Para mim, sucesso é paz anterior – Denzel Washington",
            "Oportunidades não surgem. É você que as cria – Chris Grosser",
            "Não tente ser uma pessoa de sucesso. Em vez disso, seja uma pessoa de valor – Albert Einstein",
            "Não é o mais forte que sobrevive, nem o mais inteligente. Quem sobrevive é o mais disposto à mudança – Charles Darwin",
            "A melhor vingança é um sucesso estrondoso – Frank Sinatra",
            "Eu não falhei. Só descobri 10 mil caminhos que não eram o certo – Thomas Edison",
            "Um homem de sucesso é aquele que cria uma parede com os tijolos que jogaram nele – David Brinkley",
            "Ninguém pode fazer você se sentir inferior sem o seu consentimento – Eleanor Roosevelt",
            "O grande segredo de uma boa vida é encontrar qual é o seu destino. E realizá-lo – Henry Ford",
            "Se você está atravessando um inferno, continue atravessando – Churchill",
            "O que nos parece uma provação amarga pode ser uma bênção disfarçada – Oscar Wilde",
            "A distância entre a insanidade e a genialidade é medida pelo sucesso – Bruce Feirstein",
            "Não tenha medo de desistir do bom para perseguir o ótimo – John D. Rockefeller",
            "A felicidade é uma borboleta que, sempre que perseguida, parecerá inatingível; no entanto, se você for paciente, ela pode pousar no seu ombro – Nathaniel Hawthorne",
            "Se você não pode explicar algo de forma simples, então você não entendeu muito bem o que tem a dizer – Einstein",
            "Há dois tipos de pessoa que vão te dizer que você não pode fazer a diferença neste mundo: as que têm medo de tentar e as que têm medo de que você se dê bem – Ray Goforth",
            "Comece de onde você está. Use o que você tiver. Faça o que você puder – Arthur Ashe",
            "Descobri que, quanto mais eu trabalho, mais sorte eu pareço ter – Thomas Jefferson",
            "O ponto de partida de qualquer conquista é o desejo – Napoleon Hill",
            "Eu devo meu sucesso a meu hábito de respeitosamente ouvir conselhos e fazer exatamente o contrário – G. K. Chesterton"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseID);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseID);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Random randomico = new Random();

                int numeroAleatorico = randomico.nextInt(frases.length);
                textoNovaFrase.setText(frases[numeroAleatorico]);
            }
        });
    }
}
