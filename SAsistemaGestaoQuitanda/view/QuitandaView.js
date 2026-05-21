export class QuitandaView {
    constructor() {
        this.nome = document.getElementById("nome");
        this.preco = document.getElementById("preco");
        this.qtd = document.getElementById("qtd");

        this.nomeEntrada = document.getElementById("nomeEntrada");
        this.qtdEntrada = document.getElementById("qtdEntrada");

        this.nomeVenda = document.getElementById("nomeVenda");
        this.qtdVenda = document.getElementById("qtdVenda");

        this.lista = document.getElementById("lista");
        this.historico = document.getElementById("historico");

        this.btnAdd = document.getElementById("btnAdd");
        this.btnEntrada = document.getElementById("btnEntrada");
        this.btnVenda = document.getElementById("btnVenda");
    }

    renderProdutos(produtos) {
        this.lista.innerHTML = "";
        produtos.forEach(produtos => {
            const item = document.createElement("li");
            this.lista.textContent = `${produtos.nome} - R$${produtos.preco} - Quantidade: ${produtos.qtd}`;
            this.lista.appendChild(li);
        });
    }

    renderHistorico(movs) {
        this.historico.innerHTML = "";

        movs.forEach(mov => {
            const li = document.createElement("li");
            li.textContent = `${mov.data} - ${mov.tipo} - ${mov.nome} - Quantidade: ${mov.qtd}`;
            this.historico.appendChild(li);
        });
    }

    mostrarErro(msg) {
        alert(msg);
    }
}