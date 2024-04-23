const functions = require('./Validar_CreditCard.js');

test('Número de cartão de crédito é válido', () => {
    expect(functions.validarNumeroCartaoCredito("4644 5416 8231 8883")).toBeTruthy();
});


test('Número de cartão de crédito é inválido', () => {
    expect(functions.validarNumeroCartaoCredito("4929896332852231")).toBeFalsy();
});

