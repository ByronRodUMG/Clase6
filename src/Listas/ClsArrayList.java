package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClsArrayList {
    public void ejemplo1() {
        List<String> taskList = new ArrayList<>();

        String lectura = "Ir a votar";
        taskList.add("Hacer compras");
        taskList.add("Sacar al perro");
        taskList.add("Hacer la cama");
        taskList.add("Lavar el carro");
        taskList.add(lectura);

//        System.out.println(taskList);
//        String primerTarea = taskList.get(0);
//        System.out.println("Primera tarea: " + primerTarea);
//
//        // Remover item
//        taskList.remove(0);
//        primerTarea = taskList.get(0);
//        System.out.println("Primera tarea: " + primerTarea);

        // Iteración o Recorrido
        int elementos = 0;
        for (String tarea : taskList) {
            System.out.println(elementos + " Tarea: " + tarea);
            elementos++;
        }
    }

    public void ejemplo2() {
        List<Integer> valores = new ArrayList<>();

        valores.add(500);
        valores.add(1000);
        valores.add(1500);
        valores.add(2000);
        valores.add(2500);

        // Iteración, Suma de valores
        int resultado = 0;
        for (Integer valor : valores) {
            resultado = resultado + valor;
        }
        System.out.println("Resultado: " + resultado);
    }

    public void listaValores() {
        Scanner s = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Ingrese un número:");
        int num = s.nextInt();
        numeros.add(num);

        numeros.add(1000);
        numeros.add(1500);

        int total = 0;
        for (int n : numeros) {
            total = total + n;
        }
        System.out.println("Sumatoria: " + total);
    }

    public void listaTareas() {
        List<ClsTaskList> task = new ArrayList<>();
        ClsTaskList tareaIndividual = new ClsTaskList();

        tareaIndividual.setTaskName("Hacer compras");
        tareaIndividual.setTaskDescription("Ir a la torre");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new ClsTaskList();

        tareaIndividual.setTaskName("Sacar al perro");
        tareaIndividual.setTaskDescription("Llevarlo al parque");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new ClsTaskList();

        tareaIndividual.setTaskName("Hacer la cama");
        tareaIndividual.setTaskDescription("Si no lo hago, me regañan");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new ClsTaskList();

        tareaIndividual.setTaskName("Ir a votar");
        tareaIndividual.setTaskDescription("Cumplir con mi país");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual = new ClsTaskList();

        task.get(1).setDone(true);
        task.get(3).setDone(true);

        int tarea_numero = 0;
        for (ClsTaskList tl : task) {
            if (!tl.isDone()) {
                System.out.println(tarea_numero + " Tarea: " + tl.getTaskName() + "\n\tDescripción: " + tl.getTaskDescription());
            }
            tarea_numero++;
        }
    }
}
