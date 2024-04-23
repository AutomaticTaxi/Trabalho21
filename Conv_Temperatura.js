function Celsius_toBe_fahrenheit (Val) {
    return (9*Val/5) + 32
   
  }
function fahrenheit_toBe_Celcius (Val) {
    const convetido = (5*(Val - 32) / 9);
    console.log(convetido);
    return fahrenheit_toBe_Celcius;
    
}
fahrenheit_toBe_Celcius(86);

module.exports = {Celsius_toBe_fahrenheit,fahrenheit_toBe_Celcius};