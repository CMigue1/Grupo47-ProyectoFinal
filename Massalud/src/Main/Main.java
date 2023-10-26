
package Main;

import AccesoADatos.AfiliadoData;
import AccesoADatos.EspecialidadData;
import AccesoADatos.OrdenData;
import AccesoADatos.PlanData;
import AccesoADatos.PrestadorData;
import Entidades.Afiliado;
import Entidades.Especialidad;
import Entidades.Orden;
import Entidades.Plan;
import Entidades.Prestador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Declaraciones de Entidades
        Afiliado afiliado = new Afiliado();
        Prestador prestador = null;
        Especialidad especialidad = null;
        Plan plan = null;
        Orden orden = null;
        
        
        // Declaraciones de Acceso a Datos
        
        AfiliadoData afilData = new AfiliadoData();
        PrestadorData presData = new PrestadorData();
        OrdenData ordenData = new OrdenData();
        EspecialidadData espeData = new EspecialidadData();
        PlanData planData = new PlanData();
        
        
        // Prueba de Metodos de PlanData
        // Metodo Agregar Plan
        //plan = new Plan("Plan Mas Cerca", 15000, 3);
        //planData.agregarPlan(plan);
        
        // Metodo buscarPlanPorId y Modificar Plan
//        plan = planData.buscarPlanPorId(1);
//        plan.setPrecio(600);
//        planData.modificarPlan(plan);
        
        
        // Metodo Listar Plan
        //System.out.println(planData.listarPlanes());
        
        // Metodo Eliminar Plan
        //planData.eliminarPlan(6);
        
        
        // Prueba
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingrese el id del afiliado a buscar");
//        int num = leer.nextInt();
//        afiliado = afilData.buscarAfiliado(num);
        
//        System.out.println("Seleccione el plan al que quiera cambiar");
        
//        plan = planData.buscarPlanPorId(4);
//        System.out.println(afilData.buscarAfiliadosPorPlan(plan.getIdPlan()));

        System.out.println(ordenData.buscarOrdenPorAfiliado(1));
        
        
        
        
       
        

    }
}
