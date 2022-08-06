public class Aplicação {
    
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setcapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getcapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6, 59));

        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe A", 66);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getcapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6, 66));
    }
}
