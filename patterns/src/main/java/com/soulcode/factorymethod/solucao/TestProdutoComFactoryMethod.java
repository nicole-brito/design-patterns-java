package com.soulcode.factorymethod.solucao;

import com.soulcode.factorymethod.Produto;
import com.soulcode.factorymethod.TipoProdutoEnum;

import java.util.Calendar;

public class TestProdutoComFactoryMethod {
    public static void main(String[] args) {

        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);
//        Produto{Descricao='null', Preco=null, PossuiDimensoes=false}
//        Produto{Descricao='null', Preco=null, PossuiDimensoes=true}

        //Antes do Java 8 tinha o Calendar, que era um static factory method
        Calendar instande = Calendar.getInstance();
    }
}
