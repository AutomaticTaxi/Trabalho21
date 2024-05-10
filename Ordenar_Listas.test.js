const funcoes = require('./Ordenador_Listas.js')
var array_crescente = [1,2,3,4,5,6];
var array_decrescente = [ 6,5,4,3,2,1];
var array_desordenado = [1,2,6,5,3,4];
test('Array esta crescente e retorna decrescente',()=>{
    expect(funcoes.Ordenar(array_crescente)).toEqual(array_decrescente)
})
test('Array esta decrescente e retorna crescente ',()=>{
    expect(funcoes.Ordenar(array_decrescente)).toEqual(array_crescente)
})
test('Array esta desordenado e retorna crescente ',()=>{
    expect(funcoes.Ordenar(array_desordenado)).toEqual(array_crescente)
})