package reto01;

import reto01.model.ClaseMala;
import reto01.model.MethodExecutor;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ClaseMala cm = new ClaseMala();

        //Paso #1 - Obtener los 100 nombres con reflexión
        List<String> methodList = Arrays.stream(ClaseMala.class.getDeclaredMethods())
                .filter(Main::isNotStatic)
                .map(Method::getName)
                .toList();
        //Paso #2 - Crear threads que reciban el nombre del método y lo ejecuten
        methodList.
                forEach(method -> new Thread(new MethodExecutor(method, cm)).start());

    }

    private static boolean isNotStatic(Method method) {
        return !Modifier.isStatic(method.getModifiers());
    }


}
