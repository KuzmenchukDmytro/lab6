package ua.procamp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Point point = new Point();
        for (Method m : point.getClass().getDeclaredMethods())
        {
            if (m.isAnnotationPresent(MyAnnotation.class))
            {
                m.setAccessible(true);
                m.invoke(point, 123);
            }
        }
        System.out.println(point.toString());




        System.out.println("\nЗадание №1: Список конструкторов с их параметрами\n");
        Class clazz = new Point().getClass();
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.print("parameter type: ");
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Задание №2: Модификаторы класса \n");
        int modifire = clazz.getModifiers();
        System.out.println("Is Public - " + Modifier.isPublic(modifire));
        System.out.println("Is Final - " + Modifier.isFinal(modifire));
        System.out.println("IsAbstract - " + Modifier.isAbstract(modifire));
    }
}
