public class Arvore { 
    No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        No novo = new No(valor);

        if (raiz == null) {
            raiz = novo;
            return;
        }

        No atual = raiz;

        while (true) {
            if (valor < atual.valor) {
                if (atual.esquerda == null) {
                    atual.esquerda = novo;
                    return;
                }
                atual = atual.esquerda;
            } else {
                if (atual.direita == null) {
                    atual.direita = novo;
                    return;
                }
                atual = atual.direita;
            }
        }
    }

    public void preOrdem (No node) { 
        if (node != null) {
            System.out.print(node.valor + " ");
            preOrdem (node.esquerda);
            preOrdem (node.direita);
        
        }
    }

    public void emOrdem(No node) {

        if (node != null) {
            emOrdem(node.esquerda);
            System.out.print(node.valor + " ");
            emOrdem (node.direita);

        }
    }

}
