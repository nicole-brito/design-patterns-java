package com.soulcode.singleton.solucao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgendaSingleton {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        /* AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();

        System.out.println(agenda1);
        System.out.println(agenda2);

        //com.soulcode.singleton.solucao.AgendaSingletonLAZY@6acbcfc0
        //com.soulcode.singleton.solucao.AgendaSingletonLAZY@6acbcfc0

        //Reflection
        Constructor<AgendaSingletonLAZY> constructorDoMal = AgendaSingletonLAZY.class.getDeclaredConstructor();
        constructorDoMal.setAccessible(true);
        AgendaSingletonLAZY agenda3 = constructorDoMal.newInstance();
        AgendaSingletonLAZY agenda4 = constructorDoMal.newInstance();

        System.out.println(agenda3);
        System.out.println(agenda4);
        //com.soulcode.singleton.solucao.AgendaSingletonLAZY@5f184fc6
        //com.soulcode.singleton.solucao.AgendaSingletonLAZY@3feba861

        //Dá para impedir o reflection usando ENUM */

        AgendaSingletonEnum agenda1 = AgendaSingletonEnum.getInstance();
        AgendaSingletonEnum agenda2 = AgendaSingletonEnum.getInstance();

        System.out.println(agenda1.hashCode());
        System.out.println(agenda2.hashCode());

        //Reflection
        Constructor<AgendaSingletonEnum> constructorDoMal = AgendaSingletonEnum.class.getDeclaredConstructor();
        constructorDoMal.setAccessible(true);
        AgendaSingletonEnum agenda3 = constructorDoMal.newInstance();
        AgendaSingletonEnum agenda4 = constructorDoMal.newInstance();

        System.out.println(agenda3.hashCode());
        System.out.println(agenda4.hashCode());

        reservaDiaEnum("Sexta");
        reservaDiaEnum("Sábado");

//      reservaDiaEAGER("Sexta");
//      reservaDiaEAGER("Sábado");

//      reservaDiaLAZY("Sexta");
//      reservaDiaLAZY("Sábado");

    }

//    public static void reservaDiaEAGER(String dia) {
//        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
//        agenda.ocupa(dia);
//        System.out.println(agenda.getDiasDisponiveis());
//    }

//    public static void reservaDiaLAZY(String dia) {
//        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
//        agenda.ocupa(dia);
//        System.out.println(agenda.getDiasDisponiveis());
//    }

    public static void reservaDiaEnum(String dia) {
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
    }
}
