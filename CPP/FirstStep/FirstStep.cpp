#include <iostream>

int main() // �Ӹ���
{ // ��ü ���
	std::cout << "���� ù��° c++ ���α׷�" << std::endl; // ǥ�� ��� ��Ʈ������ ������ �����

	/* a�� b�� �� �߿���
	 �� ū ���� ����Ѵ�. */
	int a = 10;
	int b = 50;
	if (a > b) { 
		std::cout << a << std::endl; 
	}
	else {
		std::cout << b << std::endl;
	}

	std::cin >> a; 	// ǥ�� �Է� ��Ʈ��
	int aSquare = a * a;
	std::cout << "�Է°� a * a = " << aSquare << std::endl;

	/*
		a�� b���� ���� ��� 
		a�� b �� ��ȯ�Ѵ�. */

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
	std::cout << c << str;

	return 0;
}