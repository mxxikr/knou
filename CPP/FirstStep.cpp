#include <iostream>

using namespace std; // 특정 명칭공간이나 명칭공간 내의 특정 이름을 자주 사용하는 경우 명칭공간 지정 간소화 가능

namespace NameSpace1 { // 명칭 공간의 이름 : NameSpace1
	int d = 10; // 명칭을 선언하는 문장 나열
}
namespace NameSpace2 {
	int d = 20;
}
int d = 30;
namespace NameSpace1 {
	int e = 50;
}

int main() // 머리부
{ // 몸체 블록
	std::cout << "나의 첫번째 c++ 프로그램" << std::endl; // 표준 출력 스트림으로 문장을 출력함

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
	std::cout << "입력값 a * a = " << aSquare << std::endl;

	/*
		a가 b보다 작을 경우
		a와 b 값 변환한다. */

	if (a < b) {
		auto tmp = a;
		a = b;
		b = tmp;
	}
	std::cout << "a = " << a << std::endl;
	std::cout << "b = " << b << std::endl;

	int c;
	char str[100];
	std::cin >> c >> str;
	std::cout << c << str << std::endl;

	/* 명칭 공간
	   변수 출력 */
	int d = 40;
	std::cout << NameSpace1::d << std::endl; // 명칭공간 외부에서는 소속 명칭공간 지정해 사용
	std::cout << NameSpace2::d << std::endl;
	std::cout << ::d << std::endl;
	std::cout << d << std::endl;
	std::cout << NameSpace1::e << std::endl;

	cout << "Hello C world!" // using 이용한 std 명칭공간 간소화 사용
		<< endl;
	return 0;
}