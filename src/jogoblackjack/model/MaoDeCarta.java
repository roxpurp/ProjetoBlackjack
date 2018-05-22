package jogoblackjack.model;

import jogoblackjack.util.Ilist;
import jogoblackjack.util.Iterator;
import jogoblackjack.util.LinkedList;

public class MaoDeCarta {

    Baralho baralho;
    Croupier croupier;
    int pontos;
    Ilist lista;

    public MaoDeCarta() {
        lista = new LinkedList();
    }

    //retorna o total de pontos na mão
    public int CartasNaMao(Ilist maodecarta) {

        Carta temp; //(Carta) maodecarta.iterator().next();

        //String c = temp.getNumero();
        Iterator cursor = maodecarta.iterator();
        int aux;

        while (cursor.hasNext()) {
            temp = (Carta) cursor.next();

//
//            if (temp.getNumero().equals("K") || temp.getNumero().equals("Q") || temp.getNumero().equals("J")) {
//                pontos += 10;
//            } else if  {
//            } else {
//                pontos += Integer.parseInt(temp.getNumero());
//
//            }
            switch (temp.getNumero()) {
                case "K":
                    aux = 10;
                    break;

                case "Q":
                    aux = 10;
                    break;

                case "J":
                    aux = 10;
                    break;
                case "AS":
                    aux = valorAs(maodecarta);
                    break;
                default:
                    aux = Integer.parseInt(temp.getNumero());
            }

            pontos = pontos + aux;

        }
        return pontos;
    }

    public int valorAs(Ilist maodecarta) {
        Iterator cursor = maodecarta.iterator();
        Carta temp;

        while (cursor.hasNext()) {
            temp = (Carta) cursor.next();
            if (temp.getNumero().equals("K") || temp.getNumero().equals("Q") || temp.getNumero().equals("J")) {
                return 11;
            }
        }
        return 1;

    }
}