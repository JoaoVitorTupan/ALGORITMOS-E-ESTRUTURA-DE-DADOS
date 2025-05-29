class No { 
    int valor; 
    No esquerda;
    No direita;
    int altura;
    
    public No(int valor) { 
        this.valor = valor; 
        this.esquerda = null;
        this.direita = null;
    } 

    public int altura(No no) {
    if (no == null) return -1;
    return no.altura;
    }

    public No rotacaoDireita(No y) {
    No x = y.esquerda;
    No T2 = x.direita;
    x.direita = y;
    y.esquerda = T2;
    return x;
}

public No rotacaoEsquerda(No x) {
    No y = x.direita;
    No T2 = y.esquerda;
    y.esquerda = x;
    x.direita = T2;
    return y;
    }

    public No balancear(No no) {
    int balance = altura(no.esquerda) - altura(no.direita);

    if (balance > 1 && altura(no.esquerda.esquerda) >= altura(no.esquerda.direita)) {
        return rotacaoDireita(no);
    }

    if (balance < -1 && altura(no.direita.direita) >= altura(no.direita.esquerda)) {
        return rotacaoEsquerda(no);
    }

    return no;
    }

}