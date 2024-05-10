
function Ordenar(array){
    var test_OrdenadoCrescente;
    for (let i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
            test_OrdenadoCrescente=false; 
        }
        test_OrdenadoCrescente = true; 
    }
    if(test_OrdenadoCrescente==true){
        array.sort((a, b) => b - a);
        return array;

    }else{
        array.sort();
        return array;
    }
  }
  
  module.exports ={Ordenar};
  