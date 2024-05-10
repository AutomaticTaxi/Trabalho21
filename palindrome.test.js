const funcoes = require('./Palindromos.js')
test('A string é um palindromo',()=>{
    expect(funcoes.palindrome("race car")).toBeTruthy()
})