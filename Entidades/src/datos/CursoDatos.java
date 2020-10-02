package datos;

import entidades.Curso;
import entidades.Persona;

import java.util.*;

public class CursoDatos {
    public List<Curso>  listaCurso = new ArrayList<Curso>();
    static int id=0;

    public CursoDatos(){
    }

    public void create(Curso c) {
        id = id + 1;
        System.out.println("ID:" + id);
        c.setId(id);
        listaCurso.add(c);
    }
    public void deleteC(int id) {
        try {
            for (Curso c : listaCurso) {
                if (id == c.getId()) {
                    listaCurso.remove(c);
                    System.out.println("Eliminado " + c.getNombre());
                }
            }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void ActualizarC(Curso a) {
        for (Curso ca : listaCurso) {
            if (ca.getId() == a.getId()){
                ca.setId(a.getId());
                ca.setNombre(a.getNombre());
                ca.setHoras(a.getHoras());
                ca.setCredits(a.getCredits());
                System.out.println("Se actualizo correctamente");
                break;
            }else{
                System.out.println("La ID no existe: " + ca.getId());
            }
        }
    }

}