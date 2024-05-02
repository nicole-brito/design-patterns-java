package com.soulcode.factorymethod.problema;

import com.soulcode.factorymethod.ProdutoDigital;
import com.soulcode.factorymethod.ProdutoFisico;

public class TesteProduto {
    public static void main(String[] args) {
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoes(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoes(false);
    }
}
