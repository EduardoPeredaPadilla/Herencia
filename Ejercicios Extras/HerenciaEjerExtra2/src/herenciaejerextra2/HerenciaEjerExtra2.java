package herenciaejerextra2;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import Services.EdificioDeOficinasService;
import Services.PoliService;
import java.util.ArrayList;
import java.util.Scanner;

public class HerenciaEjerExtra2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Edificio> edificios = new ArrayList();
        int indice = 0;
        int poliTechados = 0;
        int poliAbiertos = 0;
        
        for (int i = 0; i < 2; i++) {
            PoliService polServ = new PoliService();
            Polideportivo poli = polServ.crearPolideportivo();
            edificios.add(poli);
            EdificioDeOficinasService edifOficinasServ = new EdificioDeOficinasService();
            EdificioDeOficinas edifOficinas = edifOficinasServ.crearEdifDeOficinas();
            edificios.add(edifOficinas);
        }
        
        System.out.println("-------------- LISTA DE EDIFICIOS ---------------");
        
        for (Edificio edificio : edificios) {
            indice++;
            switch(indice) {
                case 1:
                    System.out.println("");
                    PoliService polServ = new PoliService();
                    Polideportivo poli = (Polideportivo) edificio;
                    System.out.println(poli.toString());
                    polServ.calcularSup(poli);
                    polServ.calcularVol(poli);
                    if (poli.getTipoDeInstalacion().equalsIgnoreCase("Techado")) {
                        poliTechados++;
                    } else {
                        poliAbiertos++;
                    }
                    break;
                case 2:
                    System.out.println("");
                    EdificioDeOficinasService edifOficinasServ = new EdificioDeOficinasService();
                    EdificioDeOficinas edifOficinas = (EdificioDeOficinas) edificio;
                    System.out.println(edifOficinas);
                    edifOficinasServ.calcularSup(edifOficinas);
                    edifOficinasServ.calcularVol(edifOficinas);
                    edifOficinasServ.cantPersonas(edifOficinas);
                    break;
                case 3:
                    System.out.println("");
                    polServ = new PoliService();
                    poli = (Polideportivo) edificio;
                    System.out.println(poli.toString());
                    polServ.calcularSup(poli);
                    polServ.calcularVol(poli);
                    if (poli.getTipoDeInstalacion().equalsIgnoreCase("Techado")) {
                        poliTechados++;
                    } else {
                        poliAbiertos++;
                    }
                    break;
                case 4:
                    System.out.println("");
                    edifOficinasServ = new EdificioDeOficinasService();
                    edifOficinas = (EdificioDeOficinas) edificio;
                    System.out.println(edifOficinas);
                    edifOficinasServ.calcularSup(edifOficinas);
                    edifOficinasServ.calcularVol(edifOficinas);
                    edifOficinasServ.cantPersonas(edifOficinas);
                    break;
            }
        }
        System.out.println("");
        System.out.println("El total de Polideportivos techados es de = " + poliTechados);
        System.out.println("El total de Polideportivos abiertos es de = " + poliAbiertos);

    }

}
