const funcoes = require('./soma.js')
test('A soma esta corrreta',()=>{
    expect(funcoes.somar(1,2)).toBe(3)
})
test('A subtração esta corrreta',()=>{
    expect(funcoes.subitrair(2,1)).toBe(1)
})
test('A soma esta corrreta',()=>{
    expect(funcoes.dividir(10,2)).toBe(5)
})
test('A soma esta corrreta',()=>{
    expect(funcoes.multiplicacao(2,2)).toBe(4)
})

