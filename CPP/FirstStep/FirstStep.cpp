#include <iostream>

int main() // 머리부
{ // 몸체 블록
	std::cout << "나의 첫번째 c++ 프로그램" << std::endl; // 표준 출력 스트림

	/* a와 b의 값 중에서
	 더 큰 값을 출력한다. */
	int a = 10;
	int b = 50;
	if (a > b) { 
		std::cout << a << std::endl; 
	}
	else {
		std::cout << b << std::endl;
	}

	std::cin >> a; 	// 표준 입력 스트림
	int aSquare = a * a;
	std::cout << "입력값 a * a = " << aSquare;

	return 0;
}