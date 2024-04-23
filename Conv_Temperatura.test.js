const funcoes = require('./Conv_Temperatura.js')
test('Conversão esta correta Celsius para faren',()=>{
    expect(funcoes.Celsius_toBe_fahrenheit(30).toBe(86))
})
test('Conversão esta correta farenha  para Celsius ',()=>{
    expect(funcoes.fahrenheit_toBe_Celcius(86).toBe(30))
})