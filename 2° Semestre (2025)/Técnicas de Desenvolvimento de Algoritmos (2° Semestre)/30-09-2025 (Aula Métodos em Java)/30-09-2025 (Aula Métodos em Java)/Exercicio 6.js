function aplicarDesconto() {
            const valor = parseFloat(document.getElementById("valorProduto").value);

            if (isNaN(valor) || valor <= 0) {
                document.getElementById("resultado").value = "Digite um valor válido para o produto.";
                return;
            }

            const valorComDesconto = valor * 0.91;

            document.getElementById("resultado").value = `Valor original: R$ ${valor.toFixed(2)}\n` +
                                                          `Valor com desconto de 9%: R$ ${valorComDesconto.toFixed(2)}`;
        }