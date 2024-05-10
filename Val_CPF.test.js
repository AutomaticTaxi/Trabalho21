const funcoes = require('./Val_CPF.js')
test('CPF é valido', () => {
    expect(funcoes.TestaCPF("08007940103")).toBeTruthy();
});