package com.tundra.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISCIA(1, "Pessoa Fisica"),
	PESSOAJURIDICA(2, "Pessoa Júridica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao)
	{
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod()
	{
		return cod;
	}
	
	public String getDescricao()
	{
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod)
	{
		if(cod ==null)
		{
			return null;
		}
		
		for (TipoCliente x: TipoCliente.values()) {
			if (cod.equals(x.cod)) {
				return x;
				
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}