package com.projetojpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "item venda")
public class itemVenda {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		private int quantidade;
		
		private Double valor_unilateral;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "venda_id")
		private Venda venda;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "produto_id")
		private Produto produto;

}
