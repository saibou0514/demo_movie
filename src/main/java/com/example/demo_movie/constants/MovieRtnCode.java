package com.example.demo_movie.constants;

public enum MovieRtnCode {

	SUCCESSFUL("500","���\"),
	PARAMS_ERROR("400","��J���~�A�ſ�J0�έt�ƥB���ରnull�Ϊ�"),
	MOVIE_CODE_IS_EXISTS("400","�q�v�N�X�w�s�b"),
	MOVIE_NOT_EXISTS("400","�q�v���s�b"),
	CUSTOMER_IS_EXISTS("400","�b���w�s�b"),
	TICKET_QUANTITY_ERROR("400","�u�줣��"),
	ORDER_LIST_IS_EMPTY("400","�d�L�q����");

	private String code;

	private String message;

	private MovieRtnCode(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
