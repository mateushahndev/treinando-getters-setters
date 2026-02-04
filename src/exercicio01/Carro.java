/*  A equipe UTForce e-Racing da UTFPR Ponta Grossa está trabalhando em seu novo projeto,
automatizar a troca de marchas de seu carro elétrico. Para isso, a equipe fez uma parceria
com os alunos dos cursos de Análise e Desenvolvimento de Sistemas e Ciência da
Computação. Como requisito, o câmbio possui 5 marchas (desconsiderando a marcha ré). O
carro deve permanecer no neutro (marcha 0) enquanto o carro esteja com velocidade 0. Ao
ser acelerado e/ou freado, o carro aumentará e/ou diminuirá a sua velocidade em 5 km/h e
trocará de marcha de acordo com as velocidades atingidas (sem interferência do piloto).
Sabe-se que o carro possui velocidade máxima de 130 km/h. A fim de economia de
combustível, a equipe UTForce e-Racing fez um estudo e passou aos programadores a
seguinte tabela, que deve ser respeitada na definição da marcha em relação a velocidade.
Note que a velocidade e a marcha não poderão ser alterados externamente, ou seja, apenas
as funcionalidade de acelerar e frear o carro podem manipular essas variáveis.
Marcha Velocidade
Neutro 0 km/h
1ª Marcha 1 – 19 km/h
2ª Marcha 20 – 39 km/h
3ª Marcha 40 – 59 km/h
4ª Marcha 60 – 89 km/h
5ª Marcha 90 km/h – limite do carro */

package exercicio01;

public class Carro {

    private int velocidadeAtual = 0;
    private int velocidadeMaxima;
    private int marcha = 0;

    public Carro() {

        this(130);
    }

    public Carro(int velocidadeMaxima) {

        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {

        return this.velocidadeAtual;
    }

    public int getMarcha() {

        return this.marcha;
    }

    public void acelerar() {

        if(this.velocidadeAtual + 5 <= this.velocidadeMaxima) {

            this.velocidadeAtual += 5;
        }

        atualizarMarcha();
    }

    public void frear() {

        if(this.velocidadeAtual - 5 >= 0) {

            this.velocidadeAtual -= 5;
        }

        atualizarMarcha();
    }

    public void atualizarMarcha() {

        if(this.velocidadeAtual == 0) {

            this.marcha = 0;

        } else if(this.velocidadeAtual >= 1 && this.velocidadeAtual <= 19) {

            this.marcha = 1;

        } else if(this.velocidadeAtual >= 20 && this.velocidadeAtual <= 39) {

            this.marcha = 2;

        } else if(this.velocidadeAtual >= 40 && this.velocidadeAtual <= 59) {

            this.marcha = 3;

        } else if(this.velocidadeAtual >= 60 && this.velocidadeAtual <= 89) {

            this.marcha = 4;

        } else {

            this.marcha = 5;
        }
    }

}