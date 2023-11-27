import java.util.*;

public class dowhile4 {
    public static void main(String[] args) {
        String[] produtos = {"Pão (UN)","Maçã (KG)","Sabão em pó 2kg (UN)","Abacate (KG)","Coca-Cola 2L (UN)"};
        double[] precos = {0.75,8.2,19.98,5.76,8.64};

        List<String> codProdutosCarrinho = new ArrayList<>();
        List<String> produtosCarrinho = new ArrayList<>();
        List<Double> precosCarrinho = new ArrayList<>();
        List<Double> unidadesCarrinho = new ArrayList<>();
        List<Double> subTotalCarrinho = new ArrayList<>();
        int qtdProdCarrinho = 0;

        boolean carrinhoCheio = false;

        Scanner scnProdutos = new Scanner(System.in);
        String codScnProduto;
        Scanner scnQtdProduto = new Scanner(System.in);
        Double qtdScnProd;
        Scanner scnContinuar = new Scanner(System.in);

        int idProdTemp;
        while (carrinhoCheio == false) {
            idProdTemp = 0;
            while (idProdTemp < produtos.length) {
                System.out.println("Cód.: " + idProdTemp + " - Produto: " + produtos[idProdTemp]);
                idProdTemp++;
            }

            System.out.println("Digite o código do produto");
            codScnProduto = scnProdutos.nextLine();

            int codIntProd = Integer.valueOf(codScnProduto);

            codProdutosCarrinho.add(codScnProduto);
            produtosCarrinho.add(produtos[codIntProd]);
            precosCarrinho.add(precos[codIntProd]);

            System.out.println("Digite a quantidade desejada");
            qtdScnProd = scnQtdProduto.nextDouble();
            unidadesCarrinho.add(qtdScnProd);

            qtdProdCarrinho++;
            if (qtdProdCarrinho == produtos.length) {
                carrinhoCheio = true;
            }

            subTotalCarrinho.add(precos[codIntProd] * qtdScnProd);
            System.out.println(subTotalCarrinho);

            System.out.println("Deseja adicionar outro produto? Digite 'S' para continuar ou Digite 'N' para calcular o valor do carrinho");
            if (scnContinuar.nextLine().toUpperCase().equals("N")) {
                break;
            }
        }

        scnProdutos.close();
        scnQtdProduto.close();
        scnContinuar.close();

        int idProdCarrinhoTmp = 0;
        double precoTotal = 0;
        // String strQtdCarrinho = unidadesCarrinho.toString();
        System.out.println("Os produtos do carrinho são: ");
        while (idProdCarrinhoTmp < produtosCarrinho.size()) {
            System.out.println("Cód: " + codProdutosCarrinho.get(idProdCarrinhoTmp) + ", Produto: " + produtosCarrinho.get(idProdCarrinhoTmp) + ", Preço: " + precosCarrinho.get(idProdCarrinhoTmp) + ", Quantidade: " + unidadesCarrinho.get(idProdCarrinhoTmp));
            precoTotal += subTotalCarrinho.get(idProdCarrinhoTmp);
            idProdCarrinhoTmp++;
        }

        System.out.println(unidadesCarrinho);

        System.out.println("O valor total do carrinho é de R$: " + precoTotal);
    }
}