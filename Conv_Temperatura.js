function Celsius_toBe_fahrenheit(Val) {
    const convetido = ((9*Val/5) + 32);
    return convetido;
   
  }
function fahrenheit_toBe_Celcius(Val) {
    const convetido = (5*(Val - 32) / 9);
    return convetido;
    
}


module.exports = {Celsius_toBe_fahrenheit,fahrenheit_toBe_Celcius};