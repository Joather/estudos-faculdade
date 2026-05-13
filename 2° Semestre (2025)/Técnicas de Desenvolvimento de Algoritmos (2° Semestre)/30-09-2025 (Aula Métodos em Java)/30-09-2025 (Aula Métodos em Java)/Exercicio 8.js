function valorCofre(vinteCinco, dez, cinco) {
            return (vinteCinco * 0.25) + (dez * 0.10) + (cinco * 0.05);
        }

        function calcularValorCofre() {
            const moedas25 = parseInt(document.getElementById("vinteCinco").value);
            const moedas10 = parseInt(document.getElementById("dez").value);
            const moedas5 = parseInt(document.getElementById("cinco").value);

            if ([moedas25, moedas10, moedas5].some(v => isNaN(v) || v < 0)) {
                document.getElementById("resultado").value = "Digite quantidades válidas de moedas.";
                return;
            }

            const total = valorCofre(moedas25, moedas10, moedas5);

            document.getElementById("resultado").value = `O valor total do cofre é R$ ${total.toFixed(2)}`;
        }