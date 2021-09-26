package cursoUdemyLeo.orientacaoObjeto.heranca;

public class Heroi extends Jogador {

    public Heroi (int x, int y){
        super(x, y);
    }

    public boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(posicaoX - oponente.posicaoX);
        int deltaY = Math.abs(posicaoY - oponente.posicaoY);

        if (deltaX == 0 && deltaY == 1) {
            oponente.setVida(30);
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.setVida(30);
            return true;
        } else {
            return false;
        }
    }


}
