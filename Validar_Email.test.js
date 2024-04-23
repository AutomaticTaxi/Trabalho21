const funcoes = require('./Validar_Email.js');

test('E-mail é válido', () => {
    expect(funcoes.validarEmail("usuario@example.com")).toBeTruthy();
});

