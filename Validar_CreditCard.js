function validarNumeroCartaoCredito(numero) {
    // Remove espaços em branco e caracteres não numéricos
    const cleanNumber = numero.replace(/\D/g, '');

    // Se o número limpo não tiver 16 dígitos, é inválido
    if (cleanNumber.length !== 16) {
        return false;
    }

    // Remove espaços em branco e reverte a string para facilitar a iteração
    const reversedNumber = cleanNumber.split('').reverse().join('');
  
    let sum = 0;
    for (let i = 0; i < reversedNumber.length; i++) {
        let digit = parseInt(reversedNumber[i]);
        
        // Se o índice for ímpar, duplica o dígito
        if (i % 2 === 1) {
            digit *= 2;
            if (digit > 9) {
                digit -= 9; // Subtrai 9 se o resultado for maior que 9
            }
        }
        
        sum += digit;
    }
  
    // Se a soma for múltipla de 10, o número do cartão é válido
    return sum % 10 === 0;
}

/*
// Testes
test('Número de cartão de crédito é válido', () => {
    expect(validarNumeroCartaoCredito("4539976744026304")).toBe(true);
    expect(validarNumeroCartaoCredito("4929896332852230")).toBe(true);
});

test('Número de cartão de crédito é inválido', () => {
    expect(validarNumeroCartaoCredito("4539976744026305")).toBe(false);
    expect(validarNumeroCartaoCredito("4929896332852231")).toBe(false);
});
*/
module.exports = {
    validarNumeroCartaoCredito
};