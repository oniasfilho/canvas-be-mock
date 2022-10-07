package com.example.canvasmock.repository;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CanvaRepo {
    public Map<Integer, String> segmento_clientes = new HashMap<>();
    public Map<Integer, String> canais = new HashMap<>();
    public Map<Integer, String> relacionamento_clientes = new HashMap<>();
    public Map<Integer, String> atividade_chave = new HashMap<>();
    public Map<Integer, String> recursos_principais = new HashMap<>();
    public Map<Integer, String> parcerias_principais = new HashMap<>();
    public Map<Integer, String> fontes_receita = new HashMap<>();
    public Map<Integer, String> estrutura_custos = new HashMap<>();

    public void populateCanais(){
        canais.put(1, "primeiro canal");
        canais.put(2, "segundo canal");
        canais.put(3, "terceiro canal");
        canais.put(4, "quarto canal");
    }
}
