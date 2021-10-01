package com.desafio.rebeldes.api.dtos;

public class AtualizaLocalizacaoDTO {
	private Integer rebeldeId;
	private String Longitude;
	private String Latitude;

	public Integer getRebeldeId() {
		return rebeldeId;
	}

	public void setRebeldeId(Integer rebeldeId) {
		this.rebeldeId = rebeldeId;
	}

	public String getLongitude() {
		return Longitude;
	}

	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

	public String getLatitude() {
		return Latitude;
	}

	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
}
