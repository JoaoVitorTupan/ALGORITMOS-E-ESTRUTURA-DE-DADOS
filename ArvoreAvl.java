public class ArvoreAvl {
    No raiz;

    public void inserir(int valor) {
        raiz = inserir(raiz, valor);
    }

    private No inserir(No no, int valor) {
        if (no == null) return new No(valor);

        if (valor < no.valor)
            no.esquerda = inserir(no.esquerda, valor);
        else if (valor > no.valor)
            no.direita = inserir(no.direita, valor);
        else
            return no;

        no.altura = 1 + Math.max(no.altura(no.esquerda), no.altura(no.direita));

        return no.balancear(no);
    }
    
    private No remover(No no, int valor) {
    if (no == null) return null;

    if (valor < no.valor)
        no.esquerda = remover(no.esquerda, valor);
    else if (valor > no.valor)
        no.direita = remover(no.direita, valor);
    else {
        if (no.esquerda == null)
            return no.direita;
        else if (no.direita == null)
            return no.esquerda;

        No substituto = menorValor(no.direita);
        no.valor = substituto.valor;
        no.direita = remover(no.direita, substituto.valor);
    }

    no.altura = 1 + Math.max(no.altura(no.esquerda), no.altura(no.direita));

    return no.balancear(no);
    }

    private No menorValor(No no) {
        while (no.esquerda != null)
            no = no.esquerda;
        return no;
    }

    private void preOrdem(No no) {
    if (no != null) {
        System.out.print(no.valor + " ");
        preOrdem(no.esquerda);
        preOrdem(no.direita);
        }
    }
    
}
