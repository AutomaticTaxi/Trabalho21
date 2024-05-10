const funcoes = require('./Primos.js')
test('O número é primo ',()=>{
    expect(funcoes.primo(7)).toBeTruthy()
})