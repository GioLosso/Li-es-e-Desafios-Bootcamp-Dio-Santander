

/*Criação de uma classe em OO utilizando Java */

class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;


//Construtor - Sobrecarga

Carro() { /* Sem nenhuma atribuição */

}

Carro(String cor, String modelo, int capacidadeTanque) { /* Com as atribuições */
    this.cor = cor;
    this.modelo = modelo;
    this.capacidadeTanque = capacidadeTanque;
    
}

// SET e GET

void setCor(String cor) { /* Utilizado para colocar em um atributo ; O void indica que o atributo está sendo memorizado e não retona nada*/
    this.cor = cor; /* Considero a atribuição da cor */
}
String getCor(){/* Solicite o retorno do atributo. Assim tanto o set quanto o get devem possuir o mesmo tipo */
    return cor;
}

void setModelo(String modelo) {
    this.modelo = modelo;
}

String getModelo(){
    return modelo;
}

void setcapacidadeTanque(int capacidadeTanque){
    this.capacidadeTanque = capacidadeTanque;
}

int getcapacidadeTanque(){
    return capacidadeTanque;
}

// Método do Tanque

double totalValorTanque(double valorCombustivel, int capacidadeTanque){
    return capacidadeTanque * valorCombustivel;
}
}