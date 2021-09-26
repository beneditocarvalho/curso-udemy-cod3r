package cursoUdemyLeo.orientacaoObjeto.heranca;

public class Jogador {

    private int vida = 100;
    protected int posicaoX;
    protected int posicaoY;

    protected Jogador(int x, int y) {
        this.posicaoX = x;
        this.posicaoY = y;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida -= vida;
    }

    public void getPosicao() {
        System.out.println("X = " + posicaoX + " Y = " + posicaoY);
    }

    public boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(posicaoX - oponente.posicaoX);
        int deltaY = Math.abs(posicaoY - oponente.posicaoY);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }
    }

    public boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE -> {
                posicaoY++;
                break;
            }
            case SUL -> {
                posicaoY--;
                break;
            }
            case LESTE -> {
                posicaoX++;
                break;
            }
            case OESTE -> {
                posicaoX--;
                break;
            }
        }
        return true;
    }


}
