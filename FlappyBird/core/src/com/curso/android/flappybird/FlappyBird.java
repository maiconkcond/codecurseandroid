package com.curso.android.flappybird;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import org.w3c.dom.Text;

import java.util.Random;

public class FlappyBird extends ApplicationAdapter {


	private SpriteBatch batch;
    private Texture[] passaros;
    private Texture fundo;
    private Texture canoBaixo;
    private Texture canoTopo;
    private Random numeroRandomico;

    // Atributos de configuraçao
    private int larguraDispositivo;
    private int alturaDispositivo;

    private float variacao = 0;
    private float velocidadeQueda = 0;
    private float posicaoInicialVertical;
    private float posicaoMovimentaCanoHorizontal;
    private float espacoEntreCanos;
    private float deltaTime;
    private float alturaEntreCanosRandomica;




	@Override
	public void create () {

        batch = new SpriteBatch();
        passaros = new Texture[3];
        numeroRandomico = new Random();
        passaros[0] = new Texture("passaro1.png");
        passaros[1] = new Texture("passaro2.png");
        passaros[2] = new Texture("passaro3.png");

        fundo = new Texture("fundo.png");
        canoBaixo = new Texture("cano_baixo.png");
        canoTopo = new Texture("cano_topo.png");

        larguraDispositivo = Gdx.graphics.getWidth();
        alturaDispositivo = Gdx.graphics.getHeight();
        posicaoInicialVertical = alturaDispositivo / 2;
        posicaoMovimentaCanoHorizontal = larguraDispositivo ;
	    espacoEntreCanos= 300;
    }

	@Override
	public void render () {

    deltaTime = Gdx.graphics.getDeltaTime();

        variacao+= deltaTime * 10;
        posicaoMovimentaCanoHorizontal -= deltaTime * 200;
        velocidadeQueda ++;

        if (variacao > 2){ variacao = 0; }

        if (Gdx.input.justTouched()){
            velocidadeQueda = -15;
        }

        //faz passaro parar na posiçao zero
        if (posicaoInicialVertical > 0 || velocidadeQueda < 0) {
            posicaoInicialVertical = posicaoInicialVertical - velocidadeQueda;
        }

            //Verifica se cano saiu inteiramento da tela
            if (posicaoMovimentaCanoHorizontal < -canoTopo.getWidth()){
                posicaoMovimentaCanoHorizontal = larguraDispositivo;
                alturaEntreCanosRandomica = numeroRandomico.nextInt(400) - 200;
            }


        batch.begin();

        batch.draw(fundo,0,0, larguraDispositivo, alturaDispositivo);
        batch.draw(canoTopo,posicaoMovimentaCanoHorizontal,alturaDispositivo / 2 + espacoEntreCanos / 2 + alturaEntreCanosRandomica);
        batch.draw(canoBaixo, posicaoMovimentaCanoHorizontal,alturaDispositivo / 2 - canoBaixo.getHeight() - espacoEntreCanos / 2 + alturaEntreCanosRandomica);
        batch.draw(passaros[(int) variacao],120,posicaoInicialVertical);

        batch.end();
	}

}
