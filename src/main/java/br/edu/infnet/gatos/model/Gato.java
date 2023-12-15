package br.edu.infnet.gatos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Gato {
    private int id;
    private String nome;
    private String raca;

}
