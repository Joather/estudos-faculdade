        function mostrarIMC(peso, altura) {
            const imc = peso / (altura * altura);
            return imc;
        }

        function calcularIMC() {
            const peso = parseFloat(document.getElementById("peso").value);
            const altura = parseFloat(document.getElementById("altura").value);

            if (isNaN(peso) || isNaN(altura) || peso <= 0 || altura <= 0) {
                document.getElementById("resultado").value = "Digite valores válidos de peso e altura.";
                return;
            }

            const imc = mostrarIMC(peso, altura);

            document.getElementById("resultado").value = `O IMC da pessoa é ${imc.toFixed(2)}`;
        }