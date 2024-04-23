const functions = require('./Dados.js');


test('Resultado do lançamento está dentro do intervalo esperado', () => {
    const resultado = functions.lancarDado();
    expect(resultado).toBeGreaterThanOrEqual(1); 
    expect(resultado).toBeLessThanOrEqual(6);    
});
