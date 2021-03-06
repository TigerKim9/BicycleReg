//package com.spring.bicycle;
//
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//
//import com.spring.bicycle.domain.UserDTO;
//import com.spring.bicycle.service.UserService;
//
//
//
//public class UserValidator implements Validator {
//	
//	
//	private UserService userService;
//
//	public UserValidator(UserService userService) {
//		this.userService = userService;
//	}
//	// 이  Validator 가 제공된 Class의 인스턴스(clazz) 를 유효성 검사 할수 있나?
//	@Override
//	public boolean supports(Class<?> clazz) {
//		System.out.println("supports(" + clazz.getName() + ")");
//		// 검증할 객체의 클래스 타입인지 확인 : WriteDTO = class; 가능여부
//		return UserDTO.class.isAssignableFrom(clazz);
//	}
//	
//	// 주어진 객체(target)에 유효성검사를 하고 
//	// 유효성검사에 오류가 있는 경우 주어진 객체에 이 오류들을 errors 에 등록 한다.
//	// 아래 validate() 는 Spring 이 기본적인 binding이 수행한 이후에 호출된다.
//	// 따라서, errors 에는 Spring이 수행한 binding 에러 들이 이미 담겨 있고
//	// target 에는 binding 이 완료한 커맨드 객체가 전달된다.
//	@Override
//	public void validate(Object target, Errors errors) {
//		System.out.println("validate()");
//		UserDTO dto = (UserDTO)target;
//		
//		
//		String email = dto.getEmail();
////		String duplEmail = ;
////		System.out.println(duplEmail);
//	
//		String name = dto.getName();
//		if(name == null || name.trim().isEmpty()) {
//			System.out.println("name 입력 오류");
//			errors.rejectValue("name", "이름을 입력해주세요.");
//		}
//		String pw = dto.getPw();
//		if(pw == null || pw.trim().isEmpty()) {
//			System.out.println("패스워드 입력 오류");
//			errors.rejectValue("pw", "비밀번호를 입력해주세요.");
//
//		}
//		if(email == null || email.trim().isEmpty()) {  // binding 실패하면 null 로 남아 있을 것이다.
//			System.out.println("email 입력 오류");
//			// 에러 등록 rejectValue(field, errorCode);
//			errors.rejectValue("email", "noValue");
//			return;
//		}
//		
//		if(email.equals(userService.duplicateEmail(email))) {
//			errors.rejectValue("email", "중복된 이메일이 있습니다.");
//		}
//
//	}
//}
//
//
//
//
