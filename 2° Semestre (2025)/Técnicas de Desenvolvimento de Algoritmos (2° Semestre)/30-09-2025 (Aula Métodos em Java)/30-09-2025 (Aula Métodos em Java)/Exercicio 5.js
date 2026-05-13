 function calcularVelocidade(distancia, tempo) {
            if (tempo <= 0) return null;
            return distancia / tempo;
        }

        function calcularVelocidades() {
            const dist1 = parseFloat(document.getElementById("distancia1").value);
            const tempo1 = parseFloat(document.getElementById("tempo1").value);

            const dist2 = parseFloat(document.getElementById("distancia2").value);
            const tempo2 = parseFloat(document.getElementById("tempo2").value);

            const dist3 = parseFloat(document.getElementById("distancia3").value);
            const tempo3 = parseFloat(document.getElementById("tempo3").value);

            if ([dist1, dist2, dist3, tempo1, tempo2, tempo3].some(v => isNaN(v) || v < 0)) {
                document.getElementById("resultado").value = "Digite valores válidos para todas as distâncias e tempos.";
                return;
            }

            const v1 = calcularVelocidade(dist1, tempo1);
            const v2 = calcularVelocidade(dist2, tempo2);
            const v3 = calcularVelocidade(dist3, tempo3);

            document.getElementById("resultado").value =
                `Velocidade do Objeto 1: ${v1.toFixed(2)} unidades/tempo\n` +
                `Velocidade do Objeto 2: ${v2.toFixed(2)} unidades/tempo\n` +
                `Velocidade do Objeto 3: ${v3.toFixed(2)} unidades/tempo`;
        }