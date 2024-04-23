const funcoes = require('./Senha.js')
test('Senha Correta ',()=>{
    expect(funcoes.Validar_Senhas("Senha@12")).toBeTruthy()
});