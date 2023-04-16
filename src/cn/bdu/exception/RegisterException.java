package cn.bdu.exception;
//注册用户
public class RegisterException extends Exception {

	public RegisterException() {
		super();
	}

	public RegisterException(String message, Throwable cause) {
		super(message, cause);
	}

	public RegisterException(String message) {
		super(message);
	}

	public RegisterException(Throwable cause) {
		super(cause);
	}

}
