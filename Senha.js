function Validar_Senhas(senha){
    if(senha.length==8){
        if (/[a-z]/.test(senha)){
            if (/[A-Z]/.test(senha)){
                if(/[0-9]/.test(senha)){
                    if(/[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]/.test(senha)){
                         return true;   
                    }else{return false} 
                }else{return false} 
            }else{return false} 
        }else{return false} 
    }else{return false} 
}
module.exports = {
    Validar_Senhas
};