function calcularVendas() {
            const precoTelheiro = 1.05;
            const precoQuadrado = 0.51;

            const qtTelheiro = parseInt(document.getElementById("telheiro").value);
            const qtQuadrado = parseInt(document.getElementById("quadrado").value);

            if (isNaN(qtTelheiro) || isNaN(qtQuadrado) || qtTelheiro < 0 || qtQuadrado < 0) {
                document.getElementById("resultado").value = "Digite quantidades válidas de pregos.";
                return;
            }

            const totalTelheiro = qtTelheiro * precoTelheiro;
            const totalQuadrado = qtQuadrado * precoQuadrado;
            const totalArrecadado = totalTelheiro + totalQuadrado;
            const comissao = totalArrecadado * 0.10;

            document.getElementById("resultado").value =
                `Total arrecadado: R$ ${totalArrecadado.toFixed(2)}\n` +
                `Comissão (10%): R$ ${comissao.toFixed(2)}`
        }