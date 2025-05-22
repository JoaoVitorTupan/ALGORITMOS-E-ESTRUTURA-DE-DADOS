public class Main {
    public static void main(String[] args) {

        Arvore arvore = new Arvore();
        arvore.inserir(1);
        arvore.inserir(2);
        arvore.inserir(3);
        arvore.inserir(4);
        arvore.inserir(5);
        arvore.inserir(6);
        arvore.inserir(7);

        System.out.print("Pré-Ordem:");
        arvore.preOrdem(arvore.raiz);

        System.out.println("");

        System.out.print("Em-Ordem:");
        arvore.emOrdem(arvore.raiz);

        System.out.println("");

        System.out.print("Pos-Ordem:");
        arvore.posOrdem(arvore.raiz);

    }

}
