package com.soulcode.factorymethod.solucao;

import com.soulcode.factorymethod.Produto;
import com.soulcode.factorymethod.ProdutoDigital;
import com.soulcode.factorymethod.ProdutoFisico;
import com.soulcode.factorymethod.TipoProdutoEnum;

public class ProdutoFactory {

    //"Construtor" Virtualizado - Fábrica de instâncias, de objetos
    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {

        switch (tipoProdutoEnum) {
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoes(true);
                return produtoFisico;
            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoes(false);
                return produtoDigital;
            default:
                throw new IllegalArgumentException("Tipo de produto não disponível");
        }
    }

}
