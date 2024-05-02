package com.soulcode.singleton.problema;

public class TesteAgenda {
    public static void main(String[] args) {
        //Assim só ocupa um ou outro, porque toda vez que invoca o método, gera uma nova instância
        reservaDia("Sexta");
        reservaDia("Sábado");
        //{Sexta=false, Terça=true, Quarta=true, Sábado=true, Segunda=true, Domingo=true, Quinta=true}
        //{Sexta=true, Terça=true, Quarta=true, Sábado=false, Segunda=true, Domingo=true, Quinta=true}

        //Singleton cria uma instância só na memória
    }

    public static void reservaDia(String dia) {
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
    }
}
