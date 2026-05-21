export class QuitandaController {
    constructor(model, view) {
        this.model = model;
        this.view = view;
    }

    init() {
        this.view.bntAdd.onclick = () => this.addProduto();
        this.view.bntEntrada.onclick = () => this.entradaProduto();
        this.view.bntVenda.onclick = () => this.vendaProduto();

        this.atualizar();
    }
    addProduto() {
        try {
            const nome = this.view.nome.value;
            const preco = parseFloat(this.view.preco.value);
            const quantidade = parseInt(this.view.quantidade.value);

            if (!nome || preco <= 0 || quantidade <= 0) {
                alert("Preencha todos os campos corretamente.");
                return;
            }

            this.model.adicionar(nome, preco, quantidade);
            this.view.mensagem("Produto adicionado com sucesso!");
            this.atualizar();
        } catch (error) {
            this.view.mensagem("Erro ao adicionar produto: " + error.message);
        }
    }
    entradaProduto() {
        try {
            const nome = this.view.nomeEntrada.value;
            const quantidade = parseInt(this.view.quantidadeEntrada.value);

            if (!nome || quantidade <= 0) {
                alert("Preencha todos os campos corretamente.");
                return;
            }

            this.model.entrada(nome, quantidade);
            this.view.mensagem("Entrada de produto realizada com sucesso!");
            this.atualizar();
        } catch (error) {
            this.view.mensagem("Erro na entrada de produto: " + error.message);
        }
    }

    venderProduto() {
        try{
            const nome = this.view.nomeVenda.value;
            const quantidade = parseInt(this.view.quantidadeVenda.value);

            if (!nome || quantidade <= 0) {
                alert("Preencha todos os campos corretamente.");
                return;
            }

            this.model.vender(nome, quantidade);
            this.view.mensagem("Venda de produto realizada com sucesso!");
            this.atualizar();
        } catch (error) {
            this.view.mensagem("Erro na venda de produto: " + error.message);
        }
    }

    atualizar() {
        this.view.renderProdutos(this.model.getProdutos());
        this.view.renderHistorico(this.model.getMovimentacoes());
    }
}