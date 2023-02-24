/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cliente;
import Entidad.Poliza;
import Entidad.Vehiculo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usario
 */
/*Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema 
que quiere realizar la empresa. 
12
a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de 
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail, 
domicilio, teléfono. 
b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca, 
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.). 
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un 
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de 
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total 
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra 
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las 
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de 
muchos a uno o de muchos a muchos. 
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza. 
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la 
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia, 
etc.). 
Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los 
requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes 
relaciones.*/
public class ServicioSeguro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Cliente> listaClientes = new ArrayList();
    List<Poliza> listaPolizas = new ArrayList();

    public Cliente registrarCliente() {
        Cliente c = new Cliente();
        System.out.println("Ingrese los datos del nuevo cliente a registrar:");
        System.out.println("Ingrese su nombre:");
        c.setNombre(leer.next());
        System.out.println("Registrar vehículo:");
        c.setVehiculo(registrarVehiculo());
//        System.out.println("Ingrese su apellido:");
//        c.setApellido(leer.next());
//        System.out.println("Ingrese su número de documento:");
//        c.setDocumento(leer.nextInt());
//        System.out.println("Ingrese su email:");
//        c.setMail(leer.next());
//        System.out.println("Ingrese su domicilio:");
//        c.setDomicilio(leer.next());
//        System.out.println("Ingrese su teléfono:");
//        c.setTelefono(leer.nextInt());
        return c;
    }

    public void mostrarCliente() {
        System.out.println("Los clientes de la empresa son:");
        for (Cliente aux : listaClientes) {
            System.out.println(aux);
        }
        System.out.println("Hay un total de " + listaClientes.size() + " clientes en la empresa.");
    }

    public void agregarCliente() {
        int opcion;
        do {
            listaClientes.add(registrarCliente());
            System.out.println("Desea agregar algún cliente más?");
            System.out.println("Ingrese: 1-Sí o 2-No");
            opcion = leer.nextInt();
        } while (opcion == 1);
    }

    public Vehiculo registrarVehiculo() {
        Vehiculo v = new Vehiculo();
        System.out.println("Ingrese la información del nuevo vehículo asegurado a registrar:");
        System.out.println("Ingrese su marca:");
        v.setMarca(leer.next());
        System.out.println("Ingrese su modelo:");
        v.setModelo(leer.next());
//        System.out.println("Ingrese su año de producción:");
//        v.setAnio(leer.nextInt());
//        System.out.println("Ingrese su número de motor:");
//        v.setNumeroMotor(leer.nextInt());
//        System.out.println("Ingrese su chasis:");
//        v.setChasis(leer.next());
//        System.out.println("Ingrese su color:");
//        v.setColor(leer.next());
//        System.out.println("Ingrese su tipo:");
//        v.setTipo(leer.next());
        return v;
    }

    public Cliente buscarCliente() {
        Cliente c1 = new Cliente();
        System.out.println("Ingrese el nombre del cliente que desea buscar:");
        String nombreCliente = leer.next();
        do {
            for (Cliente aux2 : listaClientes) {
                if (aux2.getNombre().equalsIgnoreCase(nombreCliente)) {
                    c1 = aux2;
                } else {
                    System.out.println("El nombre ingresado no se encuentra en el sistema.");
                    System.out.println("Ingrese el nombre del cliente que desea buscar:");
                    nombreCliente = leer.next();
                }
            }

        } while (!c1.getNombre().equalsIgnoreCase(nombreCliente));
        return c1;
    }

    public void registrarPoliza() {
        Cliente c2 = buscarCliente();//s.getListaClientes().get(0);
        System.out.println("Ingrese el modelo del vehiculo que desea registrar póliza:");
        String model = leer.next();
        do {
            if (c2.getVehiculo().getModelo().equalsIgnoreCase(model)) {
                System.out.println("El vehículo ha sido asegurado.");
            } else {
                System.out.println("El vehículo no se encuentra en el sistema.");
                System.out.println("Ingrese el modelo del vehiculo que desea registrar póliza:");
                model = leer.next();
            }
        } while (!c2.getVehiculo().getModelo().equalsIgnoreCase(model));
    }

    public void crearPoliza() {
        Poliza p = new Poliza();
        p.setCliente(buscarCliente());
        System.out.println("Ingrese el número de la póliza:");
        p.setNumeroPoliza(leer.nextInt());
        System.out.println("Fecha de inicio:");
        System.out.println("Ingrese el año:");
        int year = leer.nextInt();
        System.out.println("Ingrese el mes:");
        int month = leer.nextInt();
        System.out.println("Ingrese el dia:");
        int day = leer.nextInt();
        LocalDate fechaInicio = LocalDate.of(year, month, day);
        p.setFechaInicio(fechaInicio);
        System.out.println("Ingrese el año:");
        int year1 = leer.nextInt();
        System.out.println("Ingrese el mes:");
        int month1 = leer.nextInt();
        System.out.println("Ingrese el dia:");
        int day1 = leer.nextInt();
        LocalDate fechaFin = LocalDate.of(year1, month1, day1);
        p.setFechaFin(fechaFin);
        System.out.println("en cuantas cuotas quiere dividir su poliza?");
        p.setCantidadCuotas(leer.nextInt());
        System.out.println("ingrese la forma de pago");
        p.setFormaPago(leer.next());
        System.out.println("ingrese el monto total asegurado");
        p.setMontoTotalAsegurado(leer.nextInt());
        System.out.println("incluye granizo? 1) si / 2) no");
        int opc = leer.nextInt();
        if (opc==1) {
            p.setIncluyeGranizo(true);
        }else{
            p.setIncluyeGranizo(false);
        }
        if (p.getIncluyeGranizo()) {
            System.out.println("ingrese el monto maximo de granizo");
            p.setMontoMaximoGranizo(leer.nextInt());
        }
        System.out.println("ingrese el tipo de cobertura");
        p.setTipoCobertura(leer.next());
        listaPolizas.add(p);
    }
    public void gestionDeCuotas(){
        System.out.println("ingrese el cliente del que quiere saber las cuotas");
        String cli = leer.next();
        for (Poliza aux : listaPolizas) {
            if (cli.equals(aux.getCliente())) {
                System.out.println("");
            }
        }
              
        
    }

    public void menu() {
        int opc;
        do {
            System.out.println("Ingrese una opción:");
            System.out.println("1)Agregar cliente");
            System.out.println("2)Registrar poliza");
            System.out.println("3)Salir del sistema");
            System.out.println("4)Poliza");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    registrarPoliza();
                    break;
                case 3:
                    System.out.println("Adiós.");
                    break;
                case 4:
                    crearPoliza();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opc != 3);
    }
}
