function converteDolar(valorReais, cotacao) {
            return valorReais / cotacao;
        }

        function calcularDolar() {
            const valorReais = parseFloat(document.getElementById("valorReais").value);
            const cotacao = parseFloat(document.getElementById("cotacao").value);

            if (isNaN(valorReais) || isNaN(cotacao) || valorReais <= 0 || cotacao <= 0) {
                document.getElementById("resultado").value = "Digite valores válidos para valor e cotação.";
                return;
            }

            const valorDolar = converteDolar(valorReais, cotacao);

            document.getElementById("resultado").value = `Valor em dólar: $ ${valorDolar.toFixed(2)}`;
        }