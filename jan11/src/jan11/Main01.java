package jan11;

import java.util.Arrays;

public class Main01 {
							//추가로 필요하다면 사용하는 것?
							//메인이 동작시 필요할 때 옵션을 추가해 준다.
	// 						main에다 옵션값 추가해주기. 거의 안쓰지만, 원하면 값추가하여 사용 가능
	public static void main(String[] args) {
		//args의 존재
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println(args);
		//[Ljava.lang.String;@58ceff1
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
		
		//사과 포도 딸기 = 스페이스바로 구분하면 됩니다.
		//main 메소드도 필요에 따라 바꿔줄 수 있다.
		// 위의 > 실행버튼 옆 아래 화살표 클릭후 Run Configurations..
	}
}
