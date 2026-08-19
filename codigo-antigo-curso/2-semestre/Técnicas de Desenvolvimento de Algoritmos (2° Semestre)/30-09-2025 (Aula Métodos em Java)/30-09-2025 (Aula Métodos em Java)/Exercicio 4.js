        function getDelta(a, b, c) {
            return b * b - 4 * a * c;
        }

        function getX1(a, b, c) {
            const delta = getDelta(a, b, c);
            return (-b + Math.sqrt(delta)) / (2 * a);
        }

        function getX2(a, b, c) {
            const delta = getDelta(a, b, c);
            return (-b - Math.sqrt(delta)) / (2 * a);
        }

        function calcularEquacao() {
            const a = parseFloat(document.getElementById("a").value);
            const b = parseFloat(document.getElementById("b").value);
            const c = parseFloat(document.getElementById("c").value);

            if (isNaN(a) || isNaN(b) || isNaN(c) || a === 0) {
                document.getElementById("resultado").value = "Digite valores válidos. 'a' não pode ser zero.";
                return;
            }

            const delta = getDelta(a, b, c);

            if (delta < 0) {
                document.getElementById("resultado").value = "A equação não possui raízes reais.";
                return;
            }

            const x1 = getX1(a, b, c);
            const x2 = getX2(a, b, c);

            document.getElementById("resultado").value =
                `Delta: ${delta.toFixed(2)}\n` +
                `Raízes:\n` +
                `x1 = ${x1.toFixed(2)}\n` +
                `x2 = ${x2.toFixed(2)}`;
        }