package datos;

import entidades.Persona;
import java.util.*;

public class PersonaDatos {
    public List<Persona> listaPersonas = new ArrayList<Persona>();
    public int id = 0;

    public PersonaDatos() {
    }

    public void create(Persona d) {
        try {
            id = id + 1;
            d.setId(id);
            System.out.println("ID:" + id);
            listaPersonas.add(d);
            System.out.println("Elemento: "+listaPersonas.get(0).getId());
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void deleteP(int id) {
        try {
            for (Persona d : listaPersonas) {
                if (id == d.getId()) {
                    listaPersonas.remove(d);
                    System.out.println("Eliminado"+d.getNombre());
                }
            }
        } catch (Exception e) {
            System.out.printf("ERROR" + e.getMessage());
        }
    }

    /*public void deleete(int id) {
        int indice = 0;
        indice = listaPersonas.lastIndexOf(id);
        if (indice == this.id) {
            listaPersonas.remove(indice);
            System.out.println("ID eliminado: " + indice);
        } else {
            System.out.println("La ID no existe " + indice);
        }
    }*/

    public void ActualizarP(Persona p) {
        for (Persona pa : listaPersonas) {
            if (pa.getId() == p.getId()){
                pa.setId(p.getId());
                pa.setNombre(p.getNombre());
                pa.setSexo(p.getSexo());
                pa.setAp_materno(p.getAp_materno());
                pa.setAp_paterno(p.getAp_paterno());
                //pa.setFechaNac(p.getFechaNac());
                pa.setCorreo(p.getCorreo());
                //pa.getDirection(p.getDirection());
                pa.setDni(p.getDni());
                System.out.println("Se actualizo correctamente");
                break;
            }else{
                System.out.println("La ID no existe: " + pa.getId());
            }
        }
    }

   /*private  int edad;

     public void edadP (){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el año de su nacimiento");
        int annoy = teclado.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        int mes = teclado.nextInt();
        System.out.println("Ingrese el dia de su nacimiento");
        int dia = teclado.nextInt();

        Calendar FechaN = new GregorianCalendar(annoy, mes , dia);
        Calendar fechaHoy = Calendar.getInstance();

        int anoNac = FechaN.get(Calendar.YEAR);
        int anoHoy = fechaHoy.get(Calendar.YEAR);
        edad = anoHoy - anoNac;

    }*/
}


