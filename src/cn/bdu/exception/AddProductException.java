package cn.bdu.exception;
//添加商品
public class AddProductException extends Exception {

	public AddProductException() {
		super();
	}

	public AddProductException(String message, Throwable cause) {
		super(message, cause);
	}

	public AddProductException(String message) {
		super(message);
	}

	public AddProductException(Throwable cause) {
		super(cause);
	}

}
